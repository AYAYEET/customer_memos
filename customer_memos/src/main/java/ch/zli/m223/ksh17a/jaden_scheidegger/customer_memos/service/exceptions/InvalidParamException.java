package ch.zli.m223.ksh17a.jaden_scheidegger.customer_memos.service.exceptions;

@SuppressWarnings("serial")
public class InvalidParamException extends RuntimeException {
	
	public InvalidParamException(String message) {
		
		super(message);
	}
}