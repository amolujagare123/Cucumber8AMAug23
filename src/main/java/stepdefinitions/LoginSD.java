package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSD {
    WebDriver driver;
    @Given("I am on login page")
    public void i_am_on_login_page() {
        System.out.println("I am on login page");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

    }
    @When("I enter correct username and password")
    public void i_enter_correct_username_and_password() {
        System.out.println("I enter correct username and password");
        driver.findElement(By.id("login-username")).sendKeys("admin");
        driver.findElement(By.id("login-password")).sendKeys("admin");
    }
    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");
        driver.findElement(By.name("submit")).click();
    }
    @Then("I should reach to the dashboard")
    public void i_should_reach_to_the_dashboard() {
        System.out.println("I should reach to the dashboard");
        Assert.assertEquals("this is not a dashboard",
                "POSNIC - Dashboard",driver.getTitle());

    }

    @When("I enter incorrect username and password")
    public void iEnterIncorrectUsernameAndPassword() {
        driver.findElement(By.id("login-username")).sendKeys("ddd");
        driver.findElement(By.id("login-password")).sendKeys("fgfgfg");

    }

    @Then("I should get an error")
    public void iShouldGetAnError() {

        Assert.assertEquals("wrong or no error message",
                "http://stock.scriptinglogic.org/index.php?msg=Wrong%20Username%20or%20Password&type=error"
        ,driver.getCurrentUrl());
    }

    @When("I enter blank username and password")
    public void iEnterBlankUsernameAndPassword() {
        driver.findElement(By.id("login-username")).sendKeys("");
        driver.findElement(By.id("login-password")).sendKeys("");

    }

    @Then("I should get an Another error error")
    public void iShouldGetAnAnotherErrorError() {
        Assert.assertEquals("wrong or no error message",
                "http://stock.scriptinglogic.org/"
                ,driver.getCurrentUrl());
    }
}
