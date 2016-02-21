package Main;


import BusinessLogic.BusinessClass;

public class MainClass2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BusinessClass businessClass = new BusinessClass();
		String test = businessClass.getRulesValidated("Hello World");
		System.out.println(test);
		
	}

}
