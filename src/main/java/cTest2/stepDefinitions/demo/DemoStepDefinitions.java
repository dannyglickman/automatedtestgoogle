package cTest2.stepDefinitions.demo;

import cTest2.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DemoStepDefinitions extends BaseTest {
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Exception {
	    System.out.println("hello");
	    
	}

	@Given("^some other precondition$")
	public void some_other_precondition() throws Exception {
	    
	}

	@When("^I complete action$")
	public void i_complete_action() throws Exception {
	    
	}

	@When("^some other action$")
	public void some_other_action() throws Exception {
	    
	}

	@When("^yet another action$")
	public void yet_another_action() throws Exception {
	    
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Exception {
	    
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Exception {
	   
	}

	@Given("^I want to write a step with name(\\d+)$")
	public void i_want_to_write_a_step_with_name(int arg1) throws Exception {
	 
	}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) throws Exception {
	   
	}

	@Then("^I verify the success in step$")
	public void i_verify_the_success_in_step() throws Exception {
	    
	}

	   
}
