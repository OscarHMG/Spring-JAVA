package com.oscarhmg.app.web;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.oscarhmg.app.service.ProductManager;

@Controller
public class InventoryController {
	
	@Autowired
	ProductManager productManager;
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping(value="/hello")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response){
		String now = (new Date()).toString();
		logger.info("Showing Index page.");
		
		
		//Passing values to the view ModelView(VIEW, KEY, VALUE)
		//Before, we set  view resolver in app-config.xml to avoid to set the whole directory. 

		
		//Put objects to map to handle render in the view 
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("now", now);
        myModel.put("products", this.productManager.getProducts());		
        
        
        return new ModelAndView("hello", "result", myModel);
	}

}
