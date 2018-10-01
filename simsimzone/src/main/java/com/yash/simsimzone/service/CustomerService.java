package com.yash.simsimzone.service;

import java.util.List;

import com.yash.simsimzone.model.CustomerModel;

public interface CustomerService {

	CustomerModel findById(int id);

	void createCustomer(CustomerModel customerModel);

	List<CustomerModel> getCustomers();

	CustomerModel updateCustomer(CustomerModel customerModel, Integer customerId);

	void deleteCustomer(Integer customerId);

}
