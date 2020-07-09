package ch.zli.m223.ksh17a.jaden_scheidegger.customer_memos.model.customer;
/*
 * 
 * @author Jaden Scheidegger
 */
public class CustomerDto {
	
	public long id;
	public String name;
	
	public CustomerDto() {} // for JPA only
	
	public CustomerDto(Customer customer) {
		
		id = customer.getId();
		name = customer.getName();
	}
}