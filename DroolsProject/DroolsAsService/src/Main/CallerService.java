package Main;

import javax.jws.WebService;

import BusinessLogic.BusinessClass;

@WebService
public class CallerService {
	
	public String getValidation(String inputMessage) throws Exception{
		BusinessClass businessClass = new BusinessClass();
		String test =  businessClass.getRulesValidated("Hello World");
		return test;
	}

}
