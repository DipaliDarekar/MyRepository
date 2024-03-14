package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.TaskPage;

public class TaskTestCase extends BaseTest{
  @Test
  public void project_customerMethod() throws IOException {
	 LoginPage lp = new LoginPage(driver);
	 Flib flib = new Flib();
	 lp.validLoginMethod(flib.readPropertyData(PROP_PATH1, "Username"), flib.readPropertyData(PROP_PATH1, "Password"));
	 HomePage hp = new HomePage(driver);
	 hp.clickOnTaskModule();
	TaskPage ts = new TaskPage(driver);
	//createCustomer
	ts.createNewCutomerMethod(flib.readExcelData(EXCEL_PATH, CUST_PROSHEET_NAME, 1, 0));
  //CreateProject
	ts.createProjectMethod(flib.readExcelData(EXCEL_PATH, CUST_PROSHEET_NAME, 1, 0), flib.readExcelData(EXCEL_PATH, CUST_PROSHEET_NAME, 1, 1));
	
  }
}
