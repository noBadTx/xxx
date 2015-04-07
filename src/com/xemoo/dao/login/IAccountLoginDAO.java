package com.xemoo.dao.login;

import java.sql.SQLException;
import java.util.List;

import com.xemoo.pojo.DaoPage;
import com.xemoo.pojo.login.AccountLogin;

/**
 * @ClassName: IAccountLoginDAO
 * @Description: 登录DAO
 * @author xiangzhiwei
 * @date 2014-11-4 下午05:23:26
 * @version 1.0
 */
public interface IAccountLoginDAO
{
    /**
    * @Title: queryAccountLogin 
    * @Description 根据登录账号
    * @param login 查询条件
    * @return AccountLogin    返回类型 
     */
    public AccountLogin queryAccountLogin(AccountLogin login) throws SQLException;
    
    /**
     * 查询管理员登录账号列表
     * @param daoPage
     * @return
     * @throws DAOException
     */
    public List<AccountLogin> queryAccountLoginList(DaoPage daoPage) throws SQLException;
    
    /**
     * 查询管理员登录账号列表个数
     * @return
     * @throws DAOException
     */
    public Integer queryAccountLoginListCount() throws SQLException;
    
    /**
    * @Title insertAccountLogin 
    * @Description  新增登录账号
    * @param login 要添加的记录信息
    * @return int 0：添加败， -1：失败
     */
    public Integer insertAccountLogin(AccountLogin login) throws SQLException;
    
    /**
    * @Title updateAccountLogin 
    * @Description  修改登录账号
    * @param login 要修改的记录信息
    * @throws DAOException 
    * @return Integer 
     */
    public Integer updateAccountLogin(AccountLogin login) throws SQLException;
    
    /**
    * @Title updatePwdByNameOldPwd 
    * @Description 根据旧密码和登录名修改密码
    * @param  userName 登录名
    * @param  oldPwd 旧密码
    * @param  pwd 新密码
    * @throws DAOException    设定文件 
    * @return Integer    返回类型 
     */
    public Integer updatePwdByNameOldPwd(String userName, String oldPwd, String pwd) throws SQLException;
}
