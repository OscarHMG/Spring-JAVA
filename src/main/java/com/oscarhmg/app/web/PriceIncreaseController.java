package com.oscarhmg.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oscarhmg.app.domain.PriceIncrease;
import com.oscarhmg.app.service.ProductManager;
import com.oscarhmg.app.service.SimpleProductManager;

@Controller
@RequestMapping(value="/priceincrease")
public class PriceIncreaseController {
	
	@Autowired
	private ProductManager productManager;
	
	//GET Method
	@RequestMapping(method = RequestMethod.GET)
	public PriceIncrease formBackObject(HttpServletRequest request){
		PriceIncrease priceIncrease = new PriceIncrease();
		priceIncrease.setPercentage(15);
		return priceIncrease;
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@Valid PriceIncrease priceIncrease, BindingResult result){
		if(result.hasErrors()){
			return "priceincrease";
		}
		
		int increase = priceIncrease.getPercentage();
		productManager.increasePrice(increase);
		
		return "redirect:/hello";
		}
	}


