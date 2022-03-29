package com.example.exeption;

public class PartException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public PartException()
	{
		super();
	}
	
	public PartException(final String message)
	{
		super(message);
	}
	public PartException(final String message, final Throwable cause)
	{
		super(message,cause);
	}

}
