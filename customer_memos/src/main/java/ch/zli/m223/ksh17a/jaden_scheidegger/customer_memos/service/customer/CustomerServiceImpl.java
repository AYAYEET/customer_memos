package ch.zli.m223.ksh17a.jaden_scheidegger.customer_memos.service.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.zli.m223.ksh17a.jaden_scheidegger.customer_memos.model.customer.Customer;
import ch.zli.m223.ksh17a.jaden_scheidegger.customer_memos.model.customer.CustomerDto;
import ch.zli.m223.ksh17a.jaden_scheidegger.customer_memos.repository.customer.CustomerRepository;
import ch.zli.m223.ksh17a.jaden_scheidegger.customer_memos.service.exceptions.CustomerAlreadyExistsException;
import ch.zli.m223.ksh17a.jaden_scheidegger.customer_memos.service.exceptions.InvalidParamException;
/*
 * 
 * @author Jaden Scheidegger
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public List<CustomerDto> getAllCustomers() {
		
		List<Customer> oldList;
		List<CustomerDto> newList;
		
		oldList = customerRepository.findAllCustomers();
		
		newList = new ArrayList<>();
		
		for (Customer user : oldList) {
			newList.add(new CustomerDto(user));
		}
		
		return newList;
	}

	@Override
	public Customer getCustomerById(Long id) {
		
		if (id == null) {
			
		}
		
		return customerRepository.findById(id).orElseThrow(RuntimeException::new); // throw exception
	}

	@Override
	public Customer createCustomer(String name) {
		
		
		
		if (name == null) {
			throw new InvalidParamException(
				String.format("Name: %s", name)
			);
		}
		
		// customer exists
		
		Customer existingCustomer;
		
		existingCustomer = customerRepository.findCustomerByName(name);
		
		if (existingCustomer != null) {
			throw new CustomerAlreadyExistsException(
				String.format("Name: %s", name)
			);
		}
		
		return customerRepository.createCustomer(name);
	}

	@Override
	public void deleteCustomer(Long id) {
		
		customerRepository.deleteById(id);
	}
}