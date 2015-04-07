package com.xemoo.service.login;

import com.xemoo.pojo.ActionPage;
import com.xemoo.pojo.login.AccountLogin;
import com.xemoo.exception.ServiceException;

/** 
 * @ClassName : IDbLockService 
 * @Description :   
 * @author xiangzhiwei 
 * @date 2014年3月26日 上午11:52:40 
 * @version 1.0 
 */
public interface IAccountLoginService
{
    /**
    * @Title 
    *           : queryAccountLogin 
    * @Description 
    *           : 查询锁对象
    * @param login 
    *          : 查询条件    
    * @return AccountLogin   返回类型 
     */
    public AccountLogin queryAccountLogin(AccountLogin login);
    
    /**
     * 查询后台管理登录列表(分页)
     * @param page
     * @return
     * @throws ServiceException
     */
    public ActionPage<AccountLogin> queryAccountLoginListPage(ActionPage<AccountLogin> page) throws ServiceException;
    
    /**
    * @Title  insertAccountLogin 
    * @Description  新增账号登录
    * @param login 要添加的记录信息
    * @return int -1:失败  0：成功
     */
    public Integer insertAccountLogin(AccountLogin login);
    
    /**
    * @Title updateAccountLogin 
    * @Description 修改账号登录
    * @param login 要修改的记录
    * @return Integer 
     */
    public Integer updateAccountLogin(AccountLogin login);
    
    /**
    * @Title updatePwdByNameOldPwd
    * @Description 根据旧密码和登录名修改密码
    * @param  name 用户名
    * @param  oldPwd 旧密码
    * @param  pwd 新密码
    * @return Integer   1:成功 0:不成功
     */
    public Integer updatePwdByNameOldPwd(String name, String oldPwd, String pwd);
    
}
