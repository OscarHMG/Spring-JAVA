package com.oscarhmg.app.service;

import java.util.List;

import com.oscarhmg.app.domain.Product;

public class SimpleProductManager implements ProductManager {
	private List<Product> products;
	
	
	
	public void increasePrice(int percentage) {
		// TODO Auto-generated method stub
		if(products!= null){
			for(Product p: products){
                double newPrice = p.getPrice().doubleValue() * (100 + percentage)/100;
                p.setPrice(newPrice);
            }
			
		}
		
	}

	public List<Product> getProducts() {
		return products;
	}
	
    public void setProducts(List<Product> products) {
        this.products = products;        
    }

    
}
