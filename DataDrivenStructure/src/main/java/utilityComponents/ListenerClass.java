

package utilityComponents;



import java.io.IOException;

import org.openqa.selenium.interactions.Action;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import actionDriver.ActionClass;

public class ListenerClass extends ExtentManager implements ITestListener{
	ActionClass action=new ActionClass();
	
	public void onStart() {
		System.out.println("test started");
	}
	
	public void onTestStart(ITestResult result) {
		test=extent.createTest(result.getName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, "Pass test case is: "+result.getName());
		}
	}
	
	public void onTestFailure(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			try {
				test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"- Test case failed",ExtentColor.RED));
				test.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable()+"- Test case failed",ExtentColor.RED));
				String imgPath=action.takeScrenshot(BaseClass.driver,result.getName());
				test.fail("Screenshot is attached",MediaEntityBuilder.createScreenCaptureFromPath(imgPath).build());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void onTestSkipped(ITestResult result) {
		if(result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP, "Skipped Test Case is: "+result.getName());
		}
	}
	
	
	public void OnTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	public void OnTestFinish(ITestResult result) {
		System.out.println("Name of test method finish"+result.getName());
	}
	public void onFinish() {
		System.out.println("test finish");
	}
}

