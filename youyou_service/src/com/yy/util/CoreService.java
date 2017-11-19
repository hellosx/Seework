package com.yy.util;

import com.caucho.hessian.client.HessianProxyFactory;

/**
 * core接口 主要用于参数定义
 * 
 * @author zeer
 * 
 */
public interface CoreService {
	/**
	 * 获取一个HessianProxyFactory
	 */
	public static HessianProxyFactory HessianProxyFactory = new HessianProxyFactory();
	/**
	 * 接口执行结果（SUCCESS/FAIL/WAIT） RESULT = "RESULT"
	 */
	public static String RESULT = "RESULT";

	/**
	 * 接口执行成功 SUCCESS = "SUCCESS"
	 */
	public static String SUCCESS = "SUCCESS";

	/**
	 * 接口执行失败 FAIL = "FAIL"
	 */
	public static String FAIL = "FAIL";
	
	/**
	 * 接口执行错误 ERROR = "ERROR"
	 */
	public static String ERROR = "ERROR";

	/**
	 * 接口执行等待 WAIT = "WAIT"
	 */
	public static String WAIT = "WAIT";

	/**
	 * 提示信息 MESSAGE = "MESSAGE"
	 */
	public static String MESSAGE = "MESSAGE";

	/**
	 * 操作者 OPUSERID = "OP_USER_ID"
	 * 
	 */
	public static String OPUSERID = "OP_USER_ID";

	/**
	 * 返回结果MAP RESULTMAP = "RESULT_MAP"
	 */
	public static String RESULTMAP = "RESULT_MAP";

	/**
	 * 返回集合结果LIST RESULTMAPLIST = "RESULT_MAP_LIST"
	 */
	public static String RESULTMAPLIST = "RESULT_MAP_LIST";

	/**
	 * 返回集合结果总数,用于分页 RESULTCOUNT = "RESULT_COUNT"
	 */
	public static String RESULTCOUNT = "RESULT_COUNT";

	/**
	 * ORACLE 分页参数1 MINROWS = "MIN_ROWS"
	 */
	public static String MINROWS = "MIN_ROWS";

	/**
	 * ORACLE 分页参数2 MAXROWS = "MAX_ROWS"
	 */
	public static String MAXROWS = "MAX_ROWS";

	/**
	 * order by 列 ORDERBYTERM = "ORDER_BY_TERM"
	 */
	public static String ORDERBYTERM = "ORDER_BY_TERM";

	/**
	 * order by desc ORDERBYDESC = "ORDER_BY_DESC"
	 */
	public static String ORDERBYDESC = "ORDER_BY_DESC";
}
