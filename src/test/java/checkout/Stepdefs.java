package checkout;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class Stepdefs {

    int bananaPrice = 0;
    Checkout checkout;

    @Given("​the price of a ​{string}​ is {int}c​​")
    public void thePriceOfAIsC​​(String name, int price) {
        bananaPrice = price;
    }

    @When("​I checkout {int} ​{string}​​​")
    public void iCheckout​​​(int itemCount, String itemName) {
        checkout = new Checkout();
        checkout.add(itemCount, bananaPrice);
    }

    @Then("​the total price should be {int}c")
    public void theTotalPriceShouldBeC(int total) {
        assertEquals(total, checkout.total());
    }
}
