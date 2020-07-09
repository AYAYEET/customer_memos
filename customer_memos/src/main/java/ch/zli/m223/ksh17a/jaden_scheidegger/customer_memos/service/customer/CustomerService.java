package ch.zli.m223.ksh17a.jaden_scheidegger.customer_memos.service.customer;

import java.util.List;

import ch.zli.m223.ksh17a.jaden_scheidegger.customer_memos.model.customer.Customer;
import ch.zli.m223.ksh17a.jaden_scheidegger.customer_memos.model.customer.CustomerDto;
/*
 * 
 * @author Jaden Scheidegger
 */
public interface CustomerService {

	public List<CustomerDto> getAllCustomers();

	public Customer getCustomerById(Long id);

	public Customer createCustomer(String name);

	public void deleteCustomer(Long id);
}