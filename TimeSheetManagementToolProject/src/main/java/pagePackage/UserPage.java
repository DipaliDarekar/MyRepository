package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

	
	
	@FindBy(xpath="//input[@value='Create New User']") WebElement userListCreateNewUserButton;
	@FindBy(name="username") private WebElement usnTB;
	@FindBy(xpath="//*[@name='passwordText']") private WebElement pssTB;
	@FindBy(xpath="//*[@name='passwordTextRetype']") private WebElement retypePassTB;
	@FindBy(name="firstName") private WebElement firstNameTB;
	@FindBy(name="lastName") private WebElement lastNameTB;
	@FindBy(xpath="//label[contains(normalize-space(.),'Modify')]") private WebElement modifyEnterTimeTrackCheckBox;
    @FindBy(xpath ="//*[@id='right2']") private WebElement manageCust_projectCheckBox;
    @FindBy(xpath ="//*[@id='right1']") private WebElement generatesReportsCheckBox;
    @FindBy(xpath ="//*[@id='right5']") private WebElement manageUserCheckBox;
    @FindBy(xpath ="//*[@id='right7']") private WebElement manageBillingTypesCheckBox;
    @FindBy(xpath ="//input[@type='submit']") private WebElement CreateUserButton;
    @FindBy(xpath ="/HTML/BODY/DIV/FORM/TABLE/TBODY/TR[4]/TD/INPUT[2]") private WebElement cancelButton;
    @FindBy(xpath ="//a[text()='Darekar, Dipa (manager)']") private WebElement userLink;
    @FindBy(xpath ="//input[@value='Delete This User']") private WebElement deleteThisUserButton;
    
    //initialize value
    public UserPage(WebDriver driver) {
    	PageFactory.initElements( driver,this);
    }

	public WebElement getUserListCreateNewUserButton() {
		return userListCreateNewUserButton;
	}

	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPssTB() {
		return pssTB;
	}

	public WebElement getRetypePassTB() {
		return retypePassTB;
	}

	public WebElement getFirstNameTB() {
		return firstNameTB;
	}

	public WebElement getLastNameTB() {
		return lastNameTB;
	}

	public WebElement getModifyEnterTimeTrackCheckBox() {
		return modifyEnterTimeTrackCheckBox;
	}

	public WebElement getManageCust_projectCheckBox() {
		return manageCust_projectCheckBox;
	}

	public WebElement getGeneratesReportsCheckBox() {
		return getGeneratesReportsCheckBox();
	}

	public WebElement getManageUserCheckBox() {
		return manageUserCheckBox;
	}

	public WebElement getManageBillingTypesCheckBox() {
		return manageBillingTypesCheckBox;
	}

	public WebElement getCreateUserButton() {
		return CreateUserButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getUserLink() {
		return userLink;
	}

	public WebElement getDeleteThisUserButton() {
		return deleteThisUserButton;
	}
	public void createManager(String username,String password,String fn,String ln) throws InterruptedException 
	{
	Thread.sleep(1000);
	userListCreateNewUserButton.click();
	
	usnTB.sendKeys(username);
	pssTB.sendKeys(password);
	retypePassTB.sendKeys(password);
	firstNameTB.sendKeys(fn);
	lastNameTB.sendKeys(ln);
	Thread.sleep(1000);
	modifyEnterTimeTrackCheckBox.click();
	manageCust_projectCheckBox.click();
	generatesReportsCheckBox.click();
	manageUserCheckBox.click();
	manageBillingTypesCheckBox.click();
	Thread.sleep(1000);
	CreateUserButton.click();
	
	
	}
	public void deleteManager() {
		userLink.click();
		deleteThisUserButton.click();
	}
    
}
