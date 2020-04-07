package com.jse.swing;

public class ProductService {
	private ProductBean[] products;
	
	public ProductService() {
		products = new ProductBean[10];
	}
	
	public void setProductBean(ProductBean[] products) {
		this.products = products;
	}
	public ProductBean[] getProductBean() {
		return products;
	}
}
