package stepDefinitions;

import config.configTarget;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class addAndRemoveOnCart extends configTarget {
    @And("user click remove on cart page")
    public void userClickRemoveOnCartPage() throws InterruptedException {
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
    }

    @Then("user don't see product on cart page")
    public void userDonTSeeProductOnCartPage() throws InterruptedException {
        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(
                ExpectedConditions.invisibilityOfElementLocated(By.id("remove-sauce-labs-backpack"))
        );
    }
}
