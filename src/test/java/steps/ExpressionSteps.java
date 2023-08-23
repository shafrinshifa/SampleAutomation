package steps;

import io.cucumber.java.en.Given;

public class ExpressionSteps {
	
	@Given("I have {int} laptop")
	public void i_have_laptop(Integer count) {
		System.out.println("laptop count"+count);
	   
	}

	@Given("I have {double} CGPA")
	public void i_have_cgpa(Double num) {
		System.out.println("CGPA is"+num);
	    
	}

	@Given("{string} is elder to {string} and {string}")
	public void is_elder_to_and(String name, String name1, String name2) {
		System.out.println(name +" elder  to " + name1 + " and " + name2);
	   
	}


}
