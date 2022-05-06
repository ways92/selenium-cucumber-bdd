package stepDefinitions;

import config.configTarget;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class addAndRemove extends configTarget {
    @And("user click remove")
    public void userClickRemove() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
    }

    @Then("user don't see button remove on product")
    public void userDonTSeeInCartList() throws Throwable {
        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.or(
                ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-sauce-labs-backpack"))
        ));

    }
}
