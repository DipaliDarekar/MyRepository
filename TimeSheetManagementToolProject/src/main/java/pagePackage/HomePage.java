package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//staore all the home page module
	
		@FindBy(xpath="//A[@class='content tt_selected selected']/descendant::IMG") private WebElement timeTrackModule;
		@FindBy(xpath="//A[@class='content tasks']/descendant::IMG[@class='sizer']") private WebElement taskModule;
		@FindBy(xpath="//A[@class='content reports']/descendant::IMG[@class='sizer']") private WebElement reportsModule;
		@FindBy(xpath="//A[@class='content users']/descendant::IMG[@class='sizer']") private WebElement userModule;
		@FindBy(xpath="//A[@class='content calendar']/descendant::IMG[@class='sizer']") private WebElement workScheduleModule;
		@FindBy(xpath="//A[@class='content administration']/descendant::IMG[@class='sizer']") private WebElement settingModule;
		@FindBy(xpath="//a[.='Logout']") private WebElement logoutLink;
		
		public HomePage(WebDriver driver) {
			PageFactory.initElements( driver,this);
			
		}

		public WebElement getTimeTrackModule() {
			return timeTrackModule;
		}

		public WebElement getTaskModule() {
			return taskModule;
		}

		public WebElement getReportsModule() {
			return reportsModule;
		}

		public WebElement getUserModule() {
			return userModule;
		}

		public WebElement getWorkScheduleModule() {
			return workScheduleModule;
		}

		public WebElement getSettingModule() {
			return settingModule;
		}

		public WebElement getLogoutLink() {
			return logoutLink;
		}
		
		
		 public void clickOnTimeTrackModule() {
			 timeTrackModule.click();
		 }
		
		 public void clickOnTaskModule() {
			 taskModule.click();
		 }
		 
		 public void clickOnReportsModule() {
			 reportsModule.click();
		 }
		 
		 public void cliclOnUserModule() {
			 userModule.click();
		 }
		 
		 public void clickOnWorkScheduleModule() {
			 workScheduleModule.click();
		 }
		 
		 public void clickOnSettingModule() {
			 settingModule.click();
		 }
		public void clickOnLogoutLink() {
			logoutLink.click();
			
		}

	  
	
}
