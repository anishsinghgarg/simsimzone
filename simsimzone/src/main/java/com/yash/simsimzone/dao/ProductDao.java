package com.yash.simsimzone.dao;

import java.util.List;

import com.yash.simsimzone.model.ProductModel;

public interface ProductDao {

	ProductModel getProductById(int id);

	int addNewProduct(ProductModel productModel);

	List<ProductModel> getAllProducts();

	void deleteProduct(Integer productId);

	void updateProductDetails(ProductModel currentProduct, Integer productId);

}
