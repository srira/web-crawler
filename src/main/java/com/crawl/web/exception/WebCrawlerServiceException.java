package com.crawl.web.exception;

import com.crawl.web.util.exception.ServiceException;
import com.crawl.web.util.messages.ErrorMessage;
import com.crawl.web.util.messages.ErrorMessages;

/*
 * ##############################$History Card$###################################
 * ### Latest changes description should be on the top of the history card list###
 * ###############################################################################
 *  Created Date	Updated Date	Author			Change Description
 *  ============	============	============	===================
 *  06/02/2015		06/02/2015		chandu-atina 	initial creation
 */

public class WebCrawlerServiceException extends ServiceException
{
	/**
	 * This is used in serialization
	 */
	private static final long serialVersionUID = 1L;	
	
	private ErrorMessages errors = new ErrorMessages();
	
	/**
	 * default constructor and calls super class default constructor
	 */
	public WebCrawlerServiceException() {
		super();
	}
	
	/**
	 * this builds the customer service exception
	 * with supplied customized message and exception
	 * 
	 * @param message
	 * @param cause
	 */
	public WebCrawlerServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * This builds the customer service exception using supplied
	 * customized error message
	 * 
	 * @param message
	 */
	public WebCrawlerServiceException(String message) {
		super(message);
	}

	/**
	 * this method is used to build the validation failure 
	 * exception using the cause 
	 * 
	 * @param cause
	 */
	public WebCrawlerServiceException(Throwable cause) {
		super(cause);
	}
	
	public WebCrawlerServiceException(ErrorMessages errors) {
		super(errors.toString());
		if(errors != null) {
			this.errors = errors;
		}
	}
	
	/**
	 * this builds the customer service exception using error
	 * message
	 * 
	 * @param error
	 */
	public WebCrawlerServiceException(ErrorMessage error) {
		super(error.toString());
		this.getErrors().addError(error);
	}
		
	
	/**
	 * This overrides the Object toString() method
	 * for uniqueness of this object
	 * @return string representation of Object
	 */
	@Override
	public String toString() {
		//return super.toString()+"\n"+this.getErrors().toString();
		return super.toString();
	}
	
}
