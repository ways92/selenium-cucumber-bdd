package stepDefinitions;

import config.configTarget;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class loginStepNegative extends configTarget {
    @When("^user enter username invalid (.*)$")
    public void userEnterUsernameInvalidUsername(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @And("^user enter password invalid (.*)$")
    public void userEnterPasswordInvalidPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @Then("^appear error message (.*)$")
    public void appearErrorMessageMsg(String errorMSG) {
        WebElement act = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));

//        Assert.assertTrue(act.isDisplayed());
        Assert.assertEquals(act.getText(), errorMSG);
    }
}
