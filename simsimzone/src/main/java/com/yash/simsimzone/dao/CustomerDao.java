package com.yash.simsimzone.dao;

import java.util.List;

import com.yash.simsimzone.model.CustomerModel;

public interface CustomerDao {

	CustomerModel getCustomerById(int id);

	void createCustomer(CustomerModel customerModel);

	List<CustomerModel> getCustomers();

	CustomerModel updateCustomerDetails(CustomerModel customerModel, Integer customerId);

	void deleteCustomer(Integer customerId);

}
