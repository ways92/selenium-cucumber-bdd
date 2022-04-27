package stepDefinitions;

import config.configTarget;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class checkOutStep extends configTarget {

    @When("user click checkout")
    public void user_click_checkout() {
        driver.findElement(By.id("checkout")).click();
    }
    @When("user input first name , last name, and postal code")
    public void user_input_first_name_last_name_and_postal_code() {
        driver.findElement(By.id("first-name")).sendKeys("ini");
        driver.findElement(By.id("last-name")).sendKeys("itu");
        driver.findElement(By.id("postal-code")).sendKeys("passed");

    }
    @When("user click continue")
    public void user_click_continue() {
        driver.findElement(By.id("continue")).click();
    }
    @Then("user see product will checkout")
    public void user_see_product_will_checkout() {
        WebElement act = driver.findElement(By.id("item_4_title_link"));
        Assert.assertTrue(act.isDisplayed());
    }
    @When("user click finish")
    public void user_click_finish() {
        driver.findElement(By.id("finish")).click();
    }
    @Then("user see pony express")
    public void user_see_pony_express() {
        WebElement act = driver.findElement(By.className("complete-header"));
        Assert.assertTrue(act.isDisplayed());
    }


}
