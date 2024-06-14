package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath = "//div[.='Use another account']")
	@CacheLookup
	WebElement btnUseAnotherAccount;
	
	@FindBy(id = "identifierId")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(xpath = "//span[.='Next']")
	@CacheLookup
	WebElement btnNextEmail;
	
	@FindBy(xpath = "//input[@name='Passwd']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath = "//span[.='Next']")
	@CacheLookup
	WebElement btnNextPassword;
	
	
	public void clickAnotherAccountLink() {
		btnUseAnotherAccount.click();
	}
	
	
	public void setUsername(String email) {
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	public void clickNextEmailButton() {
		btnNextEmail.click();
	}
	
	public void setPassword(String password) {
//		txtPassword.clear();
		txtPassword.sendKeys(password);
	}
	
	public void clickNextPwdButton() {
		btnNextPassword.click();
	}

}
