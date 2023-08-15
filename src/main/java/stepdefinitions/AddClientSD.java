package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static stepdefinitions.LoginSD.driver;

public class AddClientSD {

    @Given("I am on add client page")
    public void i_am_on_add_client_page() {
       driver.findElement(By.linkText("Add Customer")).click();
    }
   @When("I enter details on the page")
    public void i_enter_details_on_the_page() {
        driver.findElement(By.name("name")).sendKeys("sundarmala");
        driver.findElement(By.name("address")).sendKeys("xyz");
        driver.findElement(By.name("contact1")).sendKeys("545454");
        driver.findElement(By.name("contact2")).sendKeys("454545");
    }
    @When("I click on add button")
    public void i_click_on_add_button() {
        driver.findElement(By.name("Submit")).click();
    }
    @Then("user should be added")
    public void user_should_be_added() {

    }

    @When ("^I enter (.+) , (.+) , (.+) , (.+)$")
    public void enterDetails(String name,String address,String cont1,String cont2)
    {
        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys(address);
        driver.findElement(By.name("contact1")).sendKeys(cont1);
        driver.findElement(By.name("contact2")).sendKeys(cont2);
    }
}
