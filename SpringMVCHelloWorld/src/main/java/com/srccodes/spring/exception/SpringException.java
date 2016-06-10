package com.srccodes.spring.exception;

public class SpringException extends RuntimeException {
	
	private String exceptionMsg;
	
	public SpringException(String ExceptionMsg) {
		this.exceptionMsg = ExceptionMsg;
	}

	public String getExceptionMsg() {
		return exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
	

}
