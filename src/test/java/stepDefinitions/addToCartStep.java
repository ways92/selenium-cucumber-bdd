package stepDefinitions;

import config.configTarget;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class addToCartStep extends configTarget {

    @When("user click add to cart")
    public void user_click_add_to_cart(){
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @Then("user see cart list")
    public void user_see_cart_list(){
        driver.findElement(By.className("shopping_cart_link")).click();
        WebElement act = driver.findElement(By.id("item_4_title_link"));
        Assert.assertTrue(act.isDisplayed());
    }
}
