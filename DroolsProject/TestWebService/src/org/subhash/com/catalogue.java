package org.subhash.com;

import java.util.List;

import javax.jws.WebService;

import org.subhash.businessLogic.ValidateRules;
import org.subhash.businessLogic.productServiceImpl;


@WebService
public class catalogue {
	
	productServiceImpl productServiceImpl = new productServiceImpl();
	ValidateRules validateRules = new ValidateRules();
	
	public List<String> getProductCategories(){
		return productServiceImpl.getProductCategories();
		
	}
	
	public List<String> getProducts(String category){
		return productServiceImpl.getProducts(category);
		
	}
	
	public String getValidation(String inputMessage) throws Exception{
		return validateRules.getRulesValidated(inputMessage);
	}


}
