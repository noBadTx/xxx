package com.xemoo.app;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;

import com.xemoo.app.base.Action;
import com.xemoo.app.base.ActionManage;
import com.xemoo.app.base.BaseMdl;
import com.xemoo.app.base.BaseResponse;
import com.xemoo.app.base.Configuration;
import com.xemoo.app.base.ServiceManage;
import com.xemoo.util.StringUtil;

/**
 * app 接口基类
 * 
 * @Type AppAction
 * @author huxy
 * @date 2014-11-6
 * @Version V1.0
 */
public class AppAction extends HttpServlet {
	private static final long serialVersionUID = 2321992780372726646L;
	private static Logger logger = Logger.getLogger(AppAction.class);

	public AppAction() {

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		logger.debug("AppAction doGet --");
		response.setContentType("text/html; charset=UTF-8");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		if (logger.isDebugEnabled()) {
			logger.debug("MBInterFacesServlet - doPost");
		}
		response.setContentType("text/html; charset=UTF-8");
		byte[] bytes = new byte[1024];
		StringBuffer json = new StringBuffer();
		BaseResponse baseResponse = new BaseResponse();
		String result_code = Configuration.SERVICE_ERRORCODE;
		String result_msg = Configuration.SERVICE_ERRORMSG;
		String backResStr = "";
		BaseMdl baseRequest = null;
		try {
			int len = 0;
			while ((len = request.getInputStream().read(bytes)) > 0) {
				json.append(new String(bytes, 0, len));
			}
			logger.debug("[json str] -- " + json.toString());
			System.out.println("[json str] -- " + json.toString());
			try {
				baseRequest = (BaseMdl) JSONObject.toBean(
						JSONObject.fromObject(json.toString()), BaseMdl.class);
				Action action = ActionManage.getInstanse().getAction(
						baseRequest.getAction());
				if (action == null) {
					result_code = Configuration.PARAMETER_ERRORCODE;
					result_msg = Configuration.PARAMETER_ERRORMSG;
				} else {
					backResStr = ServiceManage.getInstanse().deal(
							baseRequest.getAction(), baseRequest.getInfo());
					logger.debug("[back str] --" + backResStr);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				logger.error("input jsonStr to object :", e);
			}
		} catch (Exception e) {
			// TODO: handle exception
			baseResponse.setCode(result_code);
			baseResponse.setMsg(result_msg);
			backResStr = JSONObject.fromObject(baseResponse).toString();
			logger.error("read inputStream ", e);
		}
		if (StringUtil.isEmpty(backResStr)) {
			baseResponse.setCode(result_code);
			baseResponse.setMsg(result_msg);
			backResStr = JSONObject.fromObject(baseResponse).toString();
		}
		System.out.println("backResStr:" + backResStr);
		try {
			response.getWriter().write(backResStr);
			logger.debug("[response write] --" + backResStr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("response write backResStr", e);
		}
	}
}
