package com.yash.simsimzone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yash.simsimzone.dao.CustomerDao;
import com.yash.simsimzone.model.CustomerModel;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;

	@Override
	public CustomerModel findById(int id) {
		return customerDao.getCustomerById(id);
	}

	public void createCustomer(CustomerModel customerModel) {
		customerDao.createCustomer(customerModel);

	}

	@Override
	public List<CustomerModel> getCustomers() {
		return customerDao.getCustomers();
	}

	@Override
	public CustomerModel updateCustomer(CustomerModel customerModel, Integer customerId) {
		customerDao.updateCustomerDetails(customerModel,customerId);
		return customerDao.getCustomerById(customerId);
		
	}

	@Override
	public void deleteCustomer(Integer customerId) {
		customerDao.deleteCustomer(customerId);
	}

}
