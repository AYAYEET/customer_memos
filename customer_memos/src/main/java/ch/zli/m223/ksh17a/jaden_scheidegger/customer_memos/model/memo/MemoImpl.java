package ch.zli.m223.ksh17a.jaden_scheidegger.customer_memos.model.memo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import ch.zli.m223.ksh17a.jaden_scheidegger.customer_memos.model.customer.Customer;
import ch.zli.m223.ksh17a.jaden_scheidegger.customer_memos.model.customer.CustomerImpl;
/*
 * 
 * @author Jaden Scheidegger
 */
@Entity(name = "Memo")
public class MemoImpl implements Memo {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private CustomerImpl customer;
	
	private String note;
	private long date;
	
	protected MemoImpl() {} // for JPA only
	
	public MemoImpl(CustomerImpl customer, String note) {
		
		this.customer = customer;
		this.note = note;
		this.date = new Date().getTime();
	}
	
	@Override
	public Long getId() {
		
		return id;
	}
	
	@Override
	public Customer getCustomer() {
		
		return customer;
	}
	
	@Override
	public String getNote() {
		
		return note;
	}
	
	@Override
	public long getDate() {
		
		return date;
	}
}