package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComposeMail {
	
public WebDriver cdriver;
	
	public ComposeMail(WebDriver rdriver) {
		cdriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath = "//div[@class='T-I T-I-KE L3']")
	@CacheLookup
	WebElement btnCompose;
	
	@FindBy(xpath = "//input[@class='agP aFw']")
	@CacheLookup
	WebElement txtTo;
	
	@FindBy(xpath = "//input[@class='aoT']")
	@CacheLookup
	WebElement txtSubject;
	
	@FindBy(xpath = "//div[@class='Am aiL Al editable LW-avf tS-tW']")
	@CacheLookup
	WebElement txtBody;
	
	@FindBy(xpath = "//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")
	@CacheLookup
	WebElement btnSend;
	
	public void clickCompose() {
		btnCompose.click();
	}
	
	public void setTo(String remail) {
		txtTo.sendKeys(remail);
	}
	
	public void setSubject(String subject) {
		txtSubject.sendKeys(subject);
	}
	
	public void setBody(String body) {
		txtBody.sendKeys(body);
	}
	
	public void clickSend() {
		btnSend.click();
	}

}
