package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	//It is WebElement repository
	
		@FindBy(xpath="//*[@name='username']")private WebElement usnTB;
		
		@FindBy(xpath="//*[@name='pwd']") private WebElement pssTB;
		
		@FindBy(xpath="//*[@id='loginButton']") private WebElement loginButton;
		
		@FindBy(id="keepLoggedInLabel") private WebElement checkBox;
		
		@FindBy(partialLinkText="Actimind Inc.") private WebElement Actimindlink;
		
		
		//initialization 
		
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
		//utilization


		public WebElement getUsnTB() {
			return usnTB;
		}


		public WebElement getPssTB() {
			
			return pssTB;
		}


		public WebElement getLoginButton() {
			return loginButton;
			
		}


		public WebElement getCheckBox() {
			return checkBox;
		}


		public WebElement getActimindlink() {
			return Actimindlink;
		}
		//Operational Method
		public void validLoginMethod(String validUsername,String validPassword) {
			usnTB.sendKeys(validUsername);
			pssTB.sendKeys(validPassword);
			
			loginButton.click();
			
			
		}
		public void invalidLoginMethod(String invalidUsername,String invalidPassword) throws InterruptedException
		{
			usnTB.sendKeys(invalidUsername);
			pssTB.sendKeys(invalidPassword);
			
			loginButton.click();
			Thread.sleep(2000);
			
			usnTB.clear();
			
		}
		
	
}
