package stepDefinitions;

import config.configTarget;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class continueAndLogout extends configTarget {


    @And("user click continue on cart page")
    public void userClickContinueOnCartPage() {
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("continue-shopping")).click();
    }

    @Then("user on inventory page")
    public void userOnInventoryPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("remove-sauce-labs-backpack"))
        );
    }

    @When("user click button logout")
    public void userClickButtonLogout() throws InterruptedException {
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("logout_sidebar_link")).click();
    }

    @Then("user navigated login page")
    public void userNavigatedLoginPage() throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("login-button"))
        );
        WebElement btnLogin = driver.findElement(By.id("login-button"));
        Assert.assertTrue(btnLogin.isDisplayed());
    }
}
