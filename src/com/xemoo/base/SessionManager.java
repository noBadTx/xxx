package com.xemoo.base;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.engine.execution.SqlExecutor;
import com.ibatis.sqlmap.engine.impl.ExtendedSqlMapClient;

/**
 * ibatis session
 * 
 * @Type SessionManager
 * @author huxy
 * @date 2014-11-05
 * @Version V1.0
 */
public class SessionManager implements ISessionManager {

	private static final Log logger = LogFactory.getLog(SessionManager.class);

	public final static String SESSION_DEFAULT_KEY = "default";

	public final static String SESSION_STYTLE_READ_ONLY = "readOnly";

	public final static String SESSION_STYLE_READ_WRITE = "readAndWrite";

	private SqlExecutor sqlExecutor;

	private Map<?, ?> sessions = null;

	public SqlMapClient getSqlMapClient(String sessionKey, String defaultKey) {
		SqlMapClient result = null;

		if (sessionKey != null && defaultKey == null) {
			defaultKey = getDefaultSessionKeyByOldSessionKey(sessionKey);
		}

		if (getSessions() != null && getSessions().size() > 0) {
			if (getSessions().containsKey(sessionKey)) {
				result = (SqlMapClient) getSessions().get(sessionKey);
			} else if (defaultKey != null
					&& getSessions().containsKey(defaultKey)) {
				result = (SqlMapClient) getSessions().get(defaultKey);
			} else if (getSessions().containsKey(SESSION_DEFAULT_KEY)) {
				result = (SqlMapClient) getSessions().get(SESSION_DEFAULT_KEY);
			}
		}
		constructSqlExecutor(result);
		return result;
	}

	@SuppressWarnings("deprecation")
	private void constructSqlExecutor(SqlMapClient sqlMapClient) {
		if (sqlExecutor != null && sqlMapClient != null) {
			if (sqlMapClient instanceof ExtendedSqlMapClient) {
				setFieldValue(
						((ExtendedSqlMapClient) sqlMapClient).getDelegate(),
						"sqlExecutor", SqlExecutor.class, sqlExecutor);
			}
		}
	}

	private void setFieldValue(Object target, String fname,
			Class<? extends Object> ftype, Object fvalue) {
		if (target == null
				|| fname == null
				|| "".equals(fname)
				|| (fvalue != null && !ftype
						.isAssignableFrom(fvalue.getClass()))) {
			return;
		}
		Class<? extends Object> clazz = target.getClass();
		try {
			Method method = clazz.getDeclaredMethod(
					"set" + Character.toUpperCase(fname.charAt(0))
							+ fname.substring(1), ftype);
			if (!Modifier.isPublic(method.getModifiers())) {
				method.setAccessible(true);
			}
			method.invoke(target, fvalue);

		} catch (Exception me) {
			if (logger.isDebugEnabled()) {
				logger.debug(me);
			}
			try {
				Field field = clazz.getDeclaredField(fname);
				if (!Modifier.isPublic(field.getModifiers())) {
					field.setAccessible(true);
				}
				field.set(target, fvalue);
			} catch (Exception fe) {
				if (logger.isDebugEnabled()) {
					logger.debug(fe);
				}
			}
		}
	}

	public Map<?, ?> getSessions() {
		return sessions;
	}

	public void setSessions(Map<?, ?> sessions) {
		this.sessions = sessions;
	}

	public final static String getSessionKeyByCity(int city, String sessionStyle) {
		return String.valueOf(city) + "," + sessionStyle;
	}

	public final static String getDefaultSessionKeyByOldSessionKey(
			String oldSessionKey) {
		if (oldSessionKey != null) {
			int index = oldSessionKey.indexOf(",");
			if (index > 0) {
				return "*"
						+ oldSessionKey
								.substring(index, oldSessionKey.length());
			}
		}

		return null;
	}

	public SqlExecutor getSqlExecutor() {
		return sqlExecutor;
	}

	public void setSqlExecutor(SqlExecutor sqlExecutor) {
		this.sqlExecutor = sqlExecutor;
	}

}
