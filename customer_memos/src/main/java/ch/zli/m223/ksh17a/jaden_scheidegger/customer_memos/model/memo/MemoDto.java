package ch.zli.m223.ksh17a.jaden_scheidegger.customer_memos.model.memo;

import ch.zli.m223.ksh17a.jaden_scheidegger.customer_memos.model.customer.Customer;
/*
 * 
 * @author Jaden Scheidegger
 */
public class MemoDto {
	
	public long id;
	public Customer customer;
	public String note;
	public long date;
	
	public MemoDto() {} // for JPA only
	
	public MemoDto(Memo memo) {
		
		id = memo.getId();
		customer = memo.getCustomer();
		note = memo.getNote();
		date = memo.getDate();
	}
}