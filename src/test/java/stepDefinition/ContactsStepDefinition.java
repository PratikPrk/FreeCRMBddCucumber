package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactsStepDefinition {
	
	
WebDriver driver = Hooks.driver;
	
	@Given("^user is on Login Page$")
	public void user_is_on_login_page()
	{	
		System.out.println("User is on Login Page");	
	}
	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_free_crm()
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Free CRM");
	}
	
	//DataDriven Testing
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username,String password)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']"))).sendKeys(username);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']"))).sendKeys(password);
	}
	
	@Then("^user clicks on login button$")
	public void user_clciks_on_login_button()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Login')]"))).click();
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page()
	{
		String title= driver.getTitle();
		System.out.println("Home page title is : "+title);
		Assert.assertEquals(title, "Free CRM");
	}
	
	 @Then("^user clicks on Add button$")
     public void user_clicks_on_Add_button()
     {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		 WebElement addBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='/contacts']/following-sibling::button")));
		 
		 ((JavascriptExecutor) Hooks.driver)
       .executeScript("arguments[0].click();", addBtn);

     }
	 
	 @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
     public void user_enters_contacts_details(String firstname,String lastname,String position)
     {
    	WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(10));
    	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstname);
    	driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastname);
    	driver.findElement(By.xpath("//input[@name='position']")).sendKeys(position);
    	driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();

}
}