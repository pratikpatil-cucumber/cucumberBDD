package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.ComposeMail;
import pageObject.LoginPage;

public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;
	public ComposeMail cm;
	
	
	@Given("User launches browser")
	public void user_launches_browser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		lp = new LoginPage(driver);
		
		cm = new ComposeMail(driver);
		
	    
	}
	
	
	@When("User visits gmail login page {string}")
	public void user_visits_gmail_login_page(String url) { 
	
		driver.get(url);
		
	    
	}
	
	
//	@When("User click on use another account")
//	public void user_click_on_use_another_account() {
//	    
//		lp.clickAnotherAccountLink();
//		
//	}
	
	
	@When("user enters email {string}")
	public void user_enters_email(String email) throws Throwable {
	    
		lp.setUsername(email);
		Thread.sleep(2000);
	}
	
	
	@When("User click on next button on email text field page")
	public void user_click_on_next_button_on_email_text_field_page() throws Throwable {
		
		lp.clickNextEmailButton();
	    Thread.sleep(2000);
	}
	
	
	@When("user enters password {string}")
	public void user_enters_password(String password) throws Throwable  {
		
		lp.setPassword(password);
		Thread.sleep(2000);
	    
	}
	
	
	@When("User click on next button on password text field page")
	public void user_click_on_next_button_on_password_text_field_page() throws Throwable {
		
		lp.clickNextPwdButton();
		Thread.sleep(2000);
	    
	}
	
	
	@When("user sends an email to {string} with subject {string} and body {string}")
	public void user_sends_an_email_to_with_subject_and_body(String receipient, String sub, String body) throws Throwable {
		
		cm.clickCompose();
		Thread.sleep(2000);
		
		cm.setTo(receipient);
		Thread.sleep(2000);
		
		cm.setSubject(sub);
		Thread.sleep(2000);
		
		cm.setBody(body);
		Thread.sleep(2000);
		
		cm.clickSend();
		Thread.sleep(2000);
	    
	}
	
	
	@Then("Close the browser")
	public void close_the_browser() {
		
		driver.quit();
	    
	}

}
