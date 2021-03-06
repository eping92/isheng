package com.isheng.common.constant;

/**
 * 系统常量定义
 *
 *
 * @author Administrator
 * @version $Id: SysConstants.java 2018年8月26日 下午10:56:28 $
 */
public class Global {
	
	/** 系统默认字符编码 */
	public static final String CHARSET = "UTF-8";
	/** 系统跳转参数名 */
	public static final String GOTO_KEY = "gto";
	/** http请求头UA参数 */
	public static final String AGENT_UA = "user-agent";
	
	public static final String CLIENT_WEB = "Web";
	
	public static final String CLIENT_ANDORID = "andorid";
	
	public static final String CLIENT_IOS = "ios";
	
	/** 用户初始密码 */
	public static final String USER_INIT_PWD = "123456";
	
	/** 异常处理页面获取状态码key名称 */
	public static final String EXCEPTION_CODE_KEY = "errCode";
	
	/** 异常处理页面获取错误提示信息key名称 */
	public static final String EXCEPTION_MSG_KEY = "errMsg";
	
	/** 错误视图页面， 如： error.html*/
	public static final String ERR_VIEW = "err";
	
	/** 登录用户存储在session中的key */
	public static final String SESSION_USER_KEY = "sessionUser";
	
	/** header中设置的session状态key */
	public static final String SESSION_STATUS_KEY = "sessionStatus";
	
	/** 用户的根目录key */
	public static final String MENU_ROOT_KEY = "menu_root_key";
	
	/** 用户的所有目录 */
	public static final String MENU_ALL_KEY = "menu_all_key";
	
	public static final String PERMISSIONS = "permissions";

}
