package com.automation.steps;

import com.automation.pages.MockPage;
import cucumber.api.java.en.Then;

public class MockPageSteps {
    MockPage mockpage = new MockPage();

    @Then("^Verify right count of values appear on the screen$")
    public void AllElementsPresent(){
        mockpage.VerifyAllElementsPresent();
    }
    @Then("^Verify values on the screen are greater than 0$")
    public void ValueGreaterThanZero(){
        mockpage.CheckValueGreaterThanZero();
    }
    @Then("^Verify Total balance field value is sum of all the values$")
    public void TotalBalance(){
        mockpage.CheckTotalBalance();
    }
    @Then("^Verify the values of all the fields are formatted as currency$")
    public void CurrencySymbol(){
        mockpage.CheckCurrencySymbol();
    }

}
