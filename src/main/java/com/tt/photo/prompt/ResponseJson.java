package com.tt.photo.prompt;

import java.io.Serializable;
import java.util.Map;

/**
 * Json 返回状态信息类
 * @author liwen.luo
 *
 */
public class ResponseJson implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private Map<String,Object> body;
	
	public ResponseJson() {
		
	}
	
	/**
	 * @param status
	 * @param msg
	 */
	public ResponseJson(Integer status,String msg) {
		this.status=status;
		this.msg=msg;
	}
	
	/**
	 * @param status
	 * @param msg
	 * @param body
	 */
	public ResponseJson(Integer status,String msg,Map<String,Object> body) {
		this.status=status;
		this.msg=msg;
		this.body=body;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Map<String, Object> getBody() {
		return body;
	}

	public void setBody(Map<String, Object> body) {
		this.body = body;
	}

}
