package com.xemoo.constant;

/**
 * @ClassName: Status
 * @Description: 处理结果常量类
 * @author xujunjie
 * @date 2013-12-3 下午3:18:24
 * @version 1.0
 */
public interface Status
{
    /** 失败状态 */
    public static int FAIL = -1;

    /** 成功状态 */
    public static int SUCCESS = 0;

    /** 成功且数据库数据有效 */
    public static int SUCCESS_VALID = 1;

    /** 包月处理 1、未处理 2、处理中 3、成功 4、处理失败 start */
    public static int ORDER_UNTREATED = 1;

    public static int ORDER_PROCESS = 2;

    public static int ORDER_SUCCESS = 3;

    public static int ORDER_FAIL = 4;

    /** 包月处理 1、未处理 2、处理中 3、成功 4、处理失败 end */

    /** 帐号状态。0-正常；1-已暂停；2-已取消 start */
    public static int ACCOUNT_OPEN = 0;

    public static int ACCOUNT_PAUSE = 1;

    public static int ACCOUNT_CANCELLATION = 2;

    /** 企业 状态。0-正常；1-已暂停；2-已取消 end */

    /**
     * 员工状态 0-开通；1-暂停；2-注销;3-开通处理中；4-暂停处理中；5-注销处理中;6-开通失败；7-暂停失败；8-注销失败; 9: 注册失败
     * ; 10:待开通 start
     */
    public static int STAFF_STATUS_OPEN = 0;

    public static int STAFF_STATUS_OPEN_PROCESSING = 3;

    public static int STAFF_STATUS_OPEN_FAIL = 6;

    public static int STAFF_STATUS_PAUSE = 1;

    public static int STAFF_STATUS_PAUSE_PROCESSING = 4;

    public static int STAFF_STATUS_PAUSE_FAIL = 7;

    public static int STAFF_STATUS_CANCELLATION = 2;

    public static int STAFF_STATUS_CANCELLATION_PROCESSING = 5;

    public static int STAFF_STATUS_CANCELLATION_FAIL = 8;

    public static int STAFF_STATUS_REGISTER_FAIL = 9;

    public static int STAFF_STATUS_INIT = 10;

    /**
     * 员工状态 0-开通；1-暂停；2-注销;3-开通处理中；4-暂停处理中；5-注销处理中;6-开通失败；7-暂停失败；8-注销失败; 9: 注册失败
     * ; 10:待开通 end
     */

    /** 企业包月状态 (包月包的状态)start */
    public static int ACCOUNT_MONTH_OPEN = 1;

    public static int ACCOUNT_MONTH_CLOSE = 2;

    /** 企业包月状态 end */

    /** 创建包月状态 start */
    public static Long CREATE_MONTH_PORDUCT_FAILL = -1l;// 产品不存在

    public static Long CREATE_MONTH_PARAM_FAIL = 1l; // 参数错误

    public static Long CREATE_MONTH_FAIL = 4l;// 创建失败

    public static Long CREATE_MONTH_REPEAT = 2l;// 包月名称重复

    /** 创建包月状态 end */

    /** 包月/包年 类型 start **/
    public static int ORDER_MONTH = 2;

    public static int ORDER_YEAR = 1;

    /** 包月/包年 类型 end */

    /** 包月/包年 子类型 start */
    public static final int MONTH_5 = 5;

    public static final int MONTH_8 = 8;

    public static final int YEAR_50 = 50;

    public static final int YEAR_80 = 80;

    /** 包月/包年 子类型 end */

    /** 政企帐号状态 1-待校验，2-待开通，3-校验失败，4-开通，5-暂停，6-注销 */
    public interface ACCOUNT_ORDER_STATUS
    {
        public static final int ACCOUNT_ORDER_STATUS_CHECKING = 1;

        public static final int ACCOUNT_ORDER_STATUS_OPENING = 2;

        public static final int ACCOUNT_ORDER_STATUS_CHECK_FAILED = 3;

        public static final int ACCOUNT_ORDER_STATUS_OPEN = 4;

        public static final int ACCOUNT_ORDER_STATUS_PAUSE = 5;

        public static final int ACCOUNT_ORDER_STATUS_CANCELLATION = 6;
    }

    /** 包月员工开通是否需要短信 1-是 2-否 */
    public static final int ORDER_SMS_YES = 1;

    public static final int ORDER_SMS_NO = 2;

    /**
     * 搜索书籍
     */
    // 随机选书
    public static final int BOOK_TYPE_RANDOM = 1002;

    // 常规选书
    public static final int BOOK_TYPE_ORDER = 1001;

    //
    public interface ACCOUNT_LOGIN_STATUS
    {
        public static final int VALID = 1; // 有效

        public static final int INVALID = 2; // 无效
    }

    /** ************* 自定义打包状态s ********** */
    // 客户端类型
    public static final int ANDROID = 1;

    public static final int IPHONE = 2;

    public static final int IPAD = 4;
    
    public static final int ANDROIDPAD = 3 ;

    // 打包状态
    public static final int PACK_INIT = 1;

    public static final int PACK_ING = 2;

    public static final int PACK_FINISH = 3;

    public static final int PACK_FAIL = 4;

    /** ************* end *************** */

    /** 书籍上下架状态 */
    public static final int BOOK_SHELF_UP = 1; // 上架

    public static final int BOOK_SHELF_DOWN = 2;// 下架

    //企业业务表 业务状态
    public interface ENTERPRISE_BUSI_MAPPING_BM_STATUS {
        public static final int OPENING = 1;  //待开通
        public static final int OPEN = 2;     //开通
        public static final int PAUSE =3;  //暂停
        public static final int STOP = 4;   //终止服务
    }
    
    //当前处于服务开通的步骤
    public interface ENTERPRISE_BUSI_MAPPING_STEP {
        public static final int PREREGIST = 1; //企业预注册完毕
        public static final int PACKAGE_CONFIGURATION_COMPLETED = 2; //服务套餐配置完毕
        public static final int STAFF_UPLOADED = 3; //员工上传完毕
        public static final int BOOK_SELECTED = 4; //书籍挑选完毕
        public static final int SERVICE_ORDER_COMPLETE = 5; //服务订购流程完毕
    }
    
    public static final String is_delete_y = "y"; //删除
    public static final String is_delete_n = "n"; //未删除
    
    /** 政企帐号状态。0-待开通；1-开通； 2-暂停；3-注销 */
    public static int ENTERPRISE_OPENING = 0;
    
    public static int ENTERPRISE_OPEN = 1;

    public static int ENTERPRISE_PAUSE = 2;

    public static int ENTERPRISE_CANCELLATION = 3;
    
    //企业消息状态
    public interface ZQSW_MSG {
    	/** 待发布*/
    	public static final int STATUS_PUBLISHING = 0;
    	/** 发布*/
    	public static final int STATUS_PUBLISHED = 1;
    	/** 暂停*/
    	public static final int STATUS_PAUSE = 2;
    	/** 下线*/
    	public static final int STATUS_OFFLINE = 3; 
    	/** 停用*/
    	public static final int STATUS_DISABLE = 4;
    }
    
    //企业资讯状态
    public interface ZQSW_ENTERPRISE_INFO {
    	/** 待发布*/
    	public static final int STATUS_PUBLISHING = 0;
    	/** 发布*/
    	public static final int STATUS_PUBLISHED = 1;
    	/** 暂停*/
    	public static final int STATUS_PAUSE = 2;
    	/** 下线*/
    	public static final int STATUS_OFFLINE = 3;
    }
    
    //企业内刊状态
    public interface ZQSW_ENTERPRISE_MAGAZINE {
    	/** 待审核（已上传）*/
    	public static final int STATUS_CHECKING = 1; 
    	/** 制作中（审核通过）*/
    	public static final int STATUS_MAKING = 2; 
    	/** 上架*/
    	public static final int STATUS_PUBLISH = 3; 
    	/** 下架*/
    	public static final int STATUS_UNDERCARRIAGE = 4; 
    	/** 审核未通过*/
    	public static final int STATUS_UNAPPROVE = 5; 
    	/** 制作完成*/
    	public static final int STATUS_COMPLETED = 6; 
    }
    
    public interface MESSAGE_WRITESOURCE{
        public static final String ENTERPRIS = "1"; // 企业来源
        public static final String SYSTEM = "2";// 系统来源
    }
    
    //专题状态
    //状态 0-待发布 1-发布 2-暂停  3-下线 -停用
    public interface ZQSW_BANNER_STATUS{
    	/** 待发布*/
    	public static final int STATUS_PUBLISHING = 0;
    	/** 发布*/
    	public static final int STATUS_PUBLISHED = 1;
    	/** 暂停*/
    	public static final int STATUS_PAUSE = 2;
    	/** 下线*/
    	public static final int STATUS_OFFLINE = 3; 
    	/** 停用*/
    	public static final int STATUS_DISABLE = 4;
    }

}
