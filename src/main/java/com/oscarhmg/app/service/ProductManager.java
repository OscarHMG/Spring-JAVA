package com.oscarhmg.app.service;
import com.oscarhmg.app.domain.Product;


import java.util.List;

import java.io.Serializable;



//Interface

public interface ProductManager extends Serializable {
	
	public void increasePrice(int percentage);
	
	public List<Product> getProducts();

}
