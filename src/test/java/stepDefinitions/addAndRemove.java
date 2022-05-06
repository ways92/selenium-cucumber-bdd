package stepDefinitions;

import config.configTarget;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class addAndRemove extends configTarget {
    @And("user click remove")
    public void userClickRemove() {
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
    }

    @Then("user don't see in cart list")
    public void userDonTSeeInCartList() throws Throwable {
        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.or(
                ExpectedConditions.invisibilityOfElementLocated(By.id("item_4_title_link"))
        ));

//        WebElement act = driver.findElement(By.id("item_4_title_link"));
//        Assert.assertFalse(act.isDisplayed());
    }
}
