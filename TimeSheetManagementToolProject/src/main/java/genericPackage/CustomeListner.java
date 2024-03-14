package genericPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomeListner extends BaseTest implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		Reporter.log("Test started",true);
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Executed Successfully !!!",true);
	}

	public void onTestFailure(ITestResult result) {
		String failedMethod = result.getMethod().getMethodName();
		Reporter.log("This method failed taken Screenshot : "+failedMethod, true);
		failedMethod(failedMethod);
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test skipped ",true);
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		Reporter.log("Test actual started",true);
	}

	public void onFinish(ITestContext context) {
		Reporter.log("Test Finished !!!",true);
	}

	
	

}
