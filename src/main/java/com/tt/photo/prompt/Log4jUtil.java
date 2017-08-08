package com.tt.photo.prompt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4jUtil {
	
	//transient 修饰的变量不能序列化
	/**
	 * 调用TCP传输日志
	 */
	public static final transient Logger loggerTcpNotifications = LoggerFactory
			.getLogger("loggerTcpNotifications");
	/**
	 * TCP底层日志
	 */
	public static final transient Logger loggerTcp = LoggerFactory
			.getLogger("loggerTcp");
	/**
	 * 文件操作日志
	 */
	public static final transient Logger loggerFile = LoggerFactory
			.getLogger("loggerFile");
	/**
	 * 其他日志
	 */
	public static final transient Logger logger = LoggerFactory
			.getLogger(Log4jUtil.class);

}
