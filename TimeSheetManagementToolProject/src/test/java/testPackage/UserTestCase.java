package testPackage;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.UserPage;



public class UserTestCase extends BaseTest{
  @Test
  public void createUserMethod() throws IOException, EncryptedDocumentException, InterruptedException
  {
	   LoginPage lp = new LoginPage(driver);
	   Flib flib = new Flib();
	   lp.validLoginMethod(flib.readPropertyData(PROP_PATH1, "Username"), flib.readPropertyData(PROP_PATH1, "Password"));
       
	  HomePage hp = new HomePage(driver);
	  hp.cliclOnUserModule();
	  UserPage up = new UserPage(driver);
	  up.createManager(flib.readExcelData(EXCEL_PATH, MANAGERSHEET_NAME,1, 0), flib.readExcelData(EXCEL_PATH, MANAGERSHEET_NAME, 1, 1), flib.readExcelData(EXCEL_PATH, MANAGERSHEET_NAME, 1, 2),flib.readExcelData(EXCEL_PATH,  MANAGERSHEET_NAME, 1,3));
	  
  hp.clickOnLogoutLink();
  }
}
