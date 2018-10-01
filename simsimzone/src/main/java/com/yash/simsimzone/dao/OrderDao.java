package com.yash.simsimzone.dao;

import com.yash.simsimzone.model.OrdersModel;

public interface OrderDao {

	OrdersModel getOrderDetailsById(Integer orderId);

	OrdersModel newOrderCreate(OrdersModel newOrdersModel);

}
