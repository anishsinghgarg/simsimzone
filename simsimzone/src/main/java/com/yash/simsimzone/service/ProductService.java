package com.yash.simsimzone.service;

import java.util.List;

import com.yash.simsimzone.model.ProductModel;

public interface ProductService {

	ProductModel findById(int id);

	int createProduct(ProductModel productModel);

	List<ProductModel> getProducts();

	ProductModel updateCustomer(ProductModel currentProduct, Integer productId);

	void deleteCustomer(Integer productId);

}
