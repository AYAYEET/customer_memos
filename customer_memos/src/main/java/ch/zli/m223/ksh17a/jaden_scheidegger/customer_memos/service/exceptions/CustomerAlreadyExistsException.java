package ch.zli.m223.ksh17a.jaden_scheidegger.customer_memos.service.exceptions;

@SuppressWarnings("serial")
public class CustomerAlreadyExistsException extends RuntimeException {
	
	public CustomerAlreadyExistsException(String message) {
		
		super(message);
	}
}