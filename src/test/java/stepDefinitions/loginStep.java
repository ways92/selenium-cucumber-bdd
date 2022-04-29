package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import util.operation;

import config.configTarget;

public class loginStep extends configTarget{

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");

    }

    @After
    public void tearDown(){
        driver.close();
    }


    @Given("user on login page")
    public void user_on_login_page() throws Exception {
        String url = operation.getPropertyValue("url");
        driver = new ChromeDriver();
        driver.get(url);


    }

    @When("^user enter (.*) username$")
    public void user_enter_username(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);

    }

    @And("^user enter (.*) password$")
    public void user_enter_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);

    }

    @And("user click button login")
    public void user_click_button_login() {
        driver.findElement(By.id("login-button")).click();

    }

    @Then("user is navigated in homepage")
    public void user_is_navigated_in_homepage() {
        WebElement actual = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[1]"));
        Assert.assertTrue(actual.isDisplayed());
    }

    @When("user input valid username")
    public void user_input_valid_username() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

    }

    @When("user input valid password")
    public void user_input_valid_password() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

    }

//    @When("user click add to cart")
//    public void user_click_add_to_cart() throws Exception {
//        addToCart = new addToCartPage(driver);
//        addToCart.clickAddToCart();
//    }
//
//    @Then("user see cart list")
//    public void user_see_cart_list(){
//        addToCart.iconCart();
//        addToCart.verifyProduct();
//        tearDown();
//
//    }
}
