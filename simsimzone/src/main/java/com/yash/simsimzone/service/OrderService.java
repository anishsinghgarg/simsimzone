package com.yash.simsimzone.service;

import java.util.List;

import com.yash.simsimzone.model.OrdersModel;

public interface OrderService {

	OrdersModel findById(Integer orderId);

	List<OrdersModel> bookOrder(List<OrdersModel> orders, int customerId);

}
