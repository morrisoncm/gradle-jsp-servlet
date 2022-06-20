package com.demo.web.exception;

public class HelloServletException extends RuntimeException {

	private static final long serialVersionUID = -9081956571728383968L;
	
	public HelloServletException(String message, Exception cause) {
		super(message, cause);
	}

}
