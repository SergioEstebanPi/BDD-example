package org.service;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DiscountServiceTest {

    DiscountService discountService = null;
    String percentage = "";

    @Given("Execute DiscountService")
    public void execute_discount_service() {
        discountService = new DiscountService();
    }
    @When("if I will enter {int}")
    public void if_i_will_enter(Integer int1) {
        percentage = discountService.getDiscount(int1);
    }
    @Then("we should get ten percentage discount")
    public void we_should_get_ten_percentage_discount() {
        Assert.assertEquals("10%", percentage);
    }

    @Then("we should get fifteen percentage discount")
    public void we_should_get_fifteen_percentage_discount() {
        Assert.assertEquals("15%", percentage);
    }
}
