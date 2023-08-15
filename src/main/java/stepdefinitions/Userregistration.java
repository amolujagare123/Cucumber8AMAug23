package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Userregistration {
    WebDriver driver;
    @Given("I am on user registration form")
    public void i_am_on_user_registration_form() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");
    }
    @When("I enter below data")
    public void i_enter_below_date(DataTable dataTable) {

        List<List<String>> data = dataTable.asLists();

        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys(data.get(0).get(0));
        driver.findElement(By.id("email")).sendKeys(data.get(0).get(1));
        driver.findElement(By.id("pass")).sendKeys(data.get(0).get(2));


    }
    @When("I click on submit button")
    public void i_click_on_submit_button() {
        driver.findElement(By.name("submit")).click();
    }
    @Then("User should be added")
    public void user_should_be_added() {

    }


}
