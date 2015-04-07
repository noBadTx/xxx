package com.xemoo.base;

/**
 * sql
 * user
 * @Type SQLManager
 * @author huxy
 * @date 2014-11-05
 * @Version V1.0
 */
public class SQLManager {
    public static final String GET_X_ACCOUNT_LOGIN_INFO = "xemoo.query_x_account_login";

    /** 用于分页时统一名称 */
    public static final String PAGE_NAME = "page";

    /** 查询角色列表 */
    public static final String ROLE_QUERY_ROLE_LIST_MAPPING = "role.query_role_List";

    /** 根据roleId查询角色信息 */
    public static final String ROLE_QUERY_ROLE_MAPPING = "role.query_role_by_id";

    /** 添加角色关系表 */
    public static final String ROLE_INSERT_PERMISSION_ROLE_MAPPING = "role.insert_permission_role";

    /** 删除角色关系表 */
    public static final String ROLE_DELETE_PERMISSION_ROLE_MAPPING = "role.delete_permission_role";

    /** 查询资源表列表 */
    public static final String PERMISSION_FINDALL = "permission.permission_findall";

    /** 查询资源表列表-用户 */
    public static final String PERMISSION_FINDALL_TO_ACCOUNTID = "permission.permission_findall_to_accountId";

    /** 查询资源表列表-角色 */
    //public static final String PERMISSION_FINDALL_TO_RPLEID = "permission.permission_findall_to_roleID";

    /** 查询资源表列表 */
    public static final String PERMISSION_LIST_BY_PPID = "permission.permission_list_by_ppid";

    /** 账号密码相关 start */
    /** 查询 */
    public static final String ACCOUNT_LOGIN_QUERY_ACCOUNT_LOGIN = "login.queryAccountLogin";
    
    /** 查询列表*/
    public static final String ACCOUNT_LOGIN_QUERY_ACCOUNT_LOGIN_LIST = "login.query_account_login_list";
    
    /** 查询列表个数*/
    public static final String ACCOUNT_LOGIN_QUERY_ACCOUNT_LOGIN_LIST_COUNT = "login.query_account_login_list_count";

    /** 新增 */
    public static final String ACCOUNT_LOGIN_INSERT_ACCOUNT_LOGIN = "login.insertAccountLogin";

    /** 修改密码 */
    public static final String ACCOUNT_LOGIN_UPDATE_PWD_BY_NAME_AND_OLDPWD = "login.updatePwdByNameOldPwd";

    /** 修改 */
    public static final String ACCOUNT_LOGIN_UPDATE_ACCOUNT_LOGIN = "login.updateAccountLogin";

    /** 账号密码相关 end */
    
    /** 账号角色关联关系 start*/
    /** @Fields ROLE_INSERT_ACCOUNT_ROLE_MAPPING : 插入一条账号和角色的关联记录  */
    public static final String ROLE_INSERT_ACCOUNT_ROLE_MAPPING = "front_role.insertRoleAccountRelation";
    /** 修改账号角色关联关系*/
    public static final String ROLE_UPDATE_ACCOUNT_ROLE_MAPPING = "front_role.updateRoleAccountRelation";
    
    /** 账号角色关联关系 end*/
    
    /** 角色权限相关 start */
    
    //查询前端显示角色list
    public static final String QUERY_FRONT_ROLE_LIST = "front_role.query_front_role_List";
    
    //查询前端显示角色个数
    public static final String QUERY_FRONT_ROLE_LIST_COUNT = "front_role.query_front_role_List_count";
    
    //查询单个前端角色
    public static final String QUERY_FRONT_ROLE_BY_ID = "front_role.query_front_role_by_id";
    
    //新增前端角色
    public static final String INSERT_FRONT_ROLE = "front_role.insert_front_role";
    
    //修改前端角色
    public static final String UPDATE_FRONT_ROLE = "front_role.update_front_role";
    
    //新增前端角色与真实角色的对应关系
    public static final String INSERT_ROLE_MOUDLE = "front_role.insert_role_moudle";
    
    //删除前端角色与真实角色的对应关系
    public static final String DELETE_ROLE_MOUDLE = "front_role.delete_role_moudle";
    
    //对应关系的查询
    public static final String QRY_ROLE_MOUDLE_LIST_BY_ID = "front_role.select_role_module";
    
    /** 角色权限相关 end */
    
    /**    问卷设置 start */
    
    //查询问卷设置
    public static final String QRY_QUESTIONNAIRE_CONFIG_BY_ID = "questionnaire_config.query_questionnarire_config_by_id";
    
    //新增问卷设置
    public static final String INSERT_QUESTIONNAIRE_CONFIG = "questionnaire_config.insert_questionnarire_config";
    
    //修改问卷设置
    public static final String UPDATE_QUESTIONNAIRE_CONFIG = "questionnaire_config.update_questionnarire_config";
    
    /**    问卷设置  end */
    
    /**    用户帐本 start */
    
    //根据userId查询用户帐本
    public static final String QRY_USER_BALANCE_BY_USER_ID = "user_balance.qryUserBalanceByUserId";
    
    //新增帐本
    public static final String INSERT_USER_BALANCE = "user_balance.insertUserBalance";
    
    /**   用户帐本end    */
    
    /**   问卷相关  start      */
    //查询问卷
    public static final String QRY_QUSERTIONNAIRE_SUMMARY = "questionnaire.queryQuestionSummary";
    
    //查询问卷list
    public static final String QRY_QUSERTIONNAIRE_SUMMARY_LIST = "questionnaire.queryQuestionSummaryList";
    
    ///查询问卷list个数
    public static final String QRY_QUSERTIONNAIRE_SUMMARY_LIST_COUNT = "questionnaire.queryQuestionSummaryListCnt";
    
    //新增问卷
    public static final String INSERT_QUSERTIONNAIRE_SUMMARY = "questionnaire.insert_questionnarire_summary";
    
    //修改问卷
    public static final String UPDATE_QUSERTIONNAIRE_SUMMARY = "questionnaire.update_questionnarire_summary";
    
    /**   问卷相关  end      */
    
    /**   用户问卷相关  start      */
    //查询用户问卷
    public static final String QRY_QUSERTIONNAIRE_SUMMARY_USER = "questionnaire.queryQuestionSummaryUserById";
    
    //查询用户问卷list
    public static final String QRY_QUSERTIONNAIRE_SUMMARY_USER_LIST = "questionnaire.queryQuestionSummaryUserListByQsId";
    
    ///查询用户问卷list个数
    public static final String QRY_QUSERTIONNAIRE_SUMMARY_USER_LIST_COUNT = "questionnaire.queryQuestionSummaryUserListByQsIdCnt";
    
    //新增用户问卷
    public static final String INSERT_QUSERTIONNAIRE_SUMMARY_USER = "questionnaire.insert_questionnarire_summary_user";
    
    //修改用户问卷
    public static final String UPDATE_QUSERTIONNAIRE_SUMMARY_USER = "questionnaire.update_questionnarire_summary_user";
    /**   用户问卷相关  end      */
}
