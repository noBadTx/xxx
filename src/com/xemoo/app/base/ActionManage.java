package com.xemoo.app.base;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * 加载配置
 * 
 * @Type ActionManage
 * @author huxy
 * @date 2014-11-6
 * @Version V1.0
 */
public class ActionManage {
	private static final ActionManage instanse = new ActionManage("/action.xml");
	private Map<String, Action> map = new ConcurrentHashMap<String, Action>();
	private String path;// 配置文件路径

	public static ActionManage getInstanse() {
		return instanse;
	}

	@SuppressWarnings("unchecked")
	private ActionManage(String path) {
		this.path = path;
		try {
			InputStream input = ActionManage.class.getClassLoader()
					.getResourceAsStream(path);
			InputStreamReader reader = new InputStreamReader(input, "UTF-8");
			XStream stream = new XStream(new DomDriver());
			stream.alias("ActionList", List.class);
			stream.alias("Action", Action.class);
			stream.useAttributeFor(Action.class, "msgType");
			stream.useAttributeFor(Action.class, "service");
			stream.useAttributeFor(Action.class, "method");
			List<Action> list = (List<Action>) stream.fromXML(reader);
			for (Action action : list) {
				Class clz = Class.forName(action.getService());
				Class[] types = clz.getInterfaces();//
				int falg = 0;
				for (Class type : types) {
					if (Service.class == type) {
						falg = 1;
						break;
					} else {
						falg = 2;
						break;
					}
				}
				if (falg == 0) {
					System.out
							.println("action="
									+ action.getMsgType()
									+ ",server is not implements Service or NoEncryptService ,check service ="
									+ action.getService());
					continue;
				}
				map.put(action.getMsgType(), action);
				Method method = null;
				if (falg == 1) {
					method = clz.getMethod(action.getMethod(), String.class);
				} else if (falg == 2) {
					method = clz
							.getMethod(action.getMethod(),
									HttpServletRequest.class,
									HttpServletResponse.class);
				}

				ServiceExecuter executer = new ServiceExecuter(
						clz.newInstance(), method);
				ServiceManage.getInstanse().add(action.getMsgType(), executer);
			}
		} catch (Exception e) {
			try {
				throw new Exception(e);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public Action getAction(String msgType) {
		return map.get(msgType);
	}
}
