package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.WorkLib;

public class TaskPage {

	
	@FindBy(partialLinkText = "Projects & Customers") private WebElement Projects_CustomersLink;
	@FindBy(xpath="//input[@value='Create New Customer']")private WebElement createNewCustomerButton;
	@FindBy(xpath="//input[@value='Create New Project']")private WebElement createNewProjectButton;
	@FindBy(name="name")private WebElement customerNameTB;
	@FindBy(name="createCustomerSubmit")private WebElement createCustomerButton;
	@FindBy(name="customerId")private WebElement customerDropDown;
	@FindBy(name="name")private WebElement projectNameTB;
	@FindBy(name="createProjectSubmit")private WebElement createProjectButton;
	
	public   TaskPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}

	public WebElement getProjects_CustomersLink() {
		return Projects_CustomersLink;
	}

	public WebElement getCreateNewCustomerButton() {
		return createNewCustomerButton;
	}

	public WebElement getCreateNewProjectButton() {
		return createNewProjectButton;
	}

	public WebElement getCustomerNameTB() {
		return customerNameTB;
	}

	public WebElement getCreateCustomerButton() {
		return createCustomerButton;
	}

	public WebElement getCustomerDropDown() {
		return customerDropDown;
	}

	public WebElement getProjectNameTB() {
		return projectNameTB;
	}

	public WebElement getCreateProjectButton() {
		return createProjectButton;
	}
	
	
	
	public void createNewCutomerMethod(String customer_name)
	{
		Projects_CustomersLink.click();
		createNewCustomerButton.click();
		customerNameTB.sendKeys(customer_name);
		createCustomerButton.click();
	}

	public void  createProjectMethod(String text,String project_name)
	{
		createNewProjectButton.click();
		WorkLib wlb = new WorkLib();
		wlb.selectByVisibleTextMethod(customerDropDown, text);
		projectNameTB.sendKeys(project_name);
		createProjectButton.click();	
	}
	
	
	
}
