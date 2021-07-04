package com.v2soft.in.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.v2soft.in.model.Product;
import com.v2soft.in.repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductRestController {
	
	@Autowired
	private ProductRepository  repo;
	

	//PUt --> to udpate detasils
	//get  --> to get details
	//post  --> insert/save dat
	//patch  -->  partial update 
	//delete --> delete soem data 
	
	// insert data 
	@PostMapping("/save")
	public String   productSave(@RequestBody  Product   product){
		
		
		String msg="";
		try {
			repo.save(product);
			msg = "Detsils saved successfully";
		}
		catch(Exception e) {
			msg = " db not saved";
		}
				
		return msg;
		
		
		
		
	}
	
	
	

}
