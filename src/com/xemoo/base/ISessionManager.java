package com.xemoo.base;

import com.ibatis.sqlmap.client.SqlMapClient;

/**
 * ibatis
 * 
 * @Type ISessionManager
 * @author huxy
 * @date 2014-11-05
 * @Version V1.0
 */
public interface ISessionManager {

	SqlMapClient getSqlMapClient(String sessionKey, String defaultKey);

}
