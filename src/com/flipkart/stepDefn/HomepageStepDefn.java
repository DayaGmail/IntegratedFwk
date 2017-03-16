package com.flipkart.stepDefn;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomepageStepDefn {


@Given("^I navigate to Flipkart$")
public void i_navigate_to_Flipkart() {
    // Write code here that turns the phrase above into concrete actions
}

@When("^I search \"(.*?)\"$")
public void i_search(String arg1) {
    // Write code here that turns the phrase above into concrete actions
}

@When("^I search for \"(.*?)\" and select Ram as \"(.*?)\"$")
public void i_search_for_and_select_Ram_as(String arg1, String arg2) {
    // Write code here that turns the phrase above into concrete actions
}


}
