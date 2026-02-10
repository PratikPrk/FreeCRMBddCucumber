//package stepDefinition;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class LoginStepDefinition {
//
//	WebDriver driver = Hooks.driver;
//	
//	@Given("^user is on Login Page$")
//	public void user_is_on_login_page()
//	{	
//		System.out.println("User is on Login Page");	
//	}
//	
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_free_crm()
//	{
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals(title, "Free CRM");
//	}
//	
////	@Then("^user enters username and password$")
////	public void user_enters_username_and_password()
////	{	
////		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
////		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']"))).sendKeys("pratik.naidu1@gmail.com");
////		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']"))).sendKeys("H@ck@3004");
////	}
//	
//	//Data Driven testing
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String username,String password)
//	{	
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']"))).sendKeys(username);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']"))).sendKeys(password);
//	}
//	
//	@Then("^user clicks on login button$")
//	public void user_clciks_on_login_button()
//	{
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Login')]"))).click();
//	}
//	
//	@Then("^user is on home page$")
//	public void user_is_on_home_page()
//	{
//		String title= driver.getTitle();
//		System.out.println("Home page title is : "+title);
//		Assert.assertEquals(title, "Free CRM");
//	}
//	
//}
