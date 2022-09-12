package actionDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClass {
	
	public static void scrollViewOfElement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", ele);
	}
	
	public static void clickElement(WebDriver driver,WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().build().perform();
	}
	public static void hoverElement(WebDriver driver,WebElement ele) {
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().build().perform();
	}
	
	public static boolean findElement(WebDriver driver,WebElement ele)
	{
		boolean find=false;
		try
		{
		ele.isDisplayed();
		find=true;
		}
		catch(Exception e)
		{
			find=false;
		}
		finally
		{
			if(find)
			{
				System.out.println("element found");
			}
			else
			{
				System.out.println("element not found");
			}
		}
		return find;
		
	}
	
	public static boolean isDisplayedElement(WebDriver driver,WebElement ele)
	{
		
		boolean flag=false;
		flag=findElement(	driver,ele);
		if(flag)
		{
			flag=ele.isDisplayed();
			if(flag)
			{
				System.out.println("element displayed successfully");
			}
			else
			{
				System.out.println("element not displayed");
			}
		}
		return flag;
	}
	
	public static boolean selectByIndex(WebElement ele,int index)
	{
		boolean flag=false;
		try
		{
			Select sel=new Select(ele);
			sel.selectByIndex(index);
			flag=true;
			return true;
		}
		catch(Exception e)
		{
			flag=false;
			return false;
		}
		finally
		{
			if(flag)
			{
				System.out.println("element selected by index");
			}
			else
			{
				System.out.println("element not selected by index");
			}
		}
	}
	
	public static boolean selectByValue(WebElement ele,String value)
	{
		boolean flag=false;
		try {
			Select sel=new Select(ele);
			sel.selectByValue("value");
			flag=true;
			return true;
		}
		catch(Exception e)
		{
			flag=false;
			return false;
		}
		finally
		{
			if(flag)
			{
				System.out.println("element selected by value");
			}
			else
			{
				System.out.println("element not selected by value");
			}
		}
	}
	
	public static boolean selectByVisibleText(WebElement ele,String text)
	{
		boolean flag=false;
		try {
			Select sel=new Select(ele);
			sel.selectByValue("text");
			flag=true;
			return true;
		}
		catch(Exception e)
		{
			flag=false;
			return false;
		}
		finally
		{
			if(flag)
			{
				System.out.println("element selected by visible text");
			}
			else
			{
				System.out.println("element not selected by visible text");
			}
		}
	}
	
	public static boolean JClick(WebDriver driver,WebElement ele)
	{
		boolean flag=false;
		try
		{
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("argument[0].click()", ele);
			flag=true;
		}
		catch(Exception e)
		{
			flag=false;
		}
		finally
		{
			if(flag)
			{
				System.out.println("element cliked using jse");
			}
			else
			{
				System.out.println("element not clicked using jse");
			}
		}
		return flag;
	}
	
	public static void implicitWait(WebDriver driver,int timeout)
	{
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	}
	
	public static void ExplicitlyWait(WebElement ele,Duration timeOut,WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static void pageLoadTime(WebDriver driver,int timeOut)
	{
		 
	}
	
	public static String takeScrenshot(WebDriver driver, String string) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source= ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("./Screenshots/Failed.png"));
		return string;
	}
	
	
	public static void sliderChange(WebDriver driver,WebElement ele) {
		Actions act=new Actions(driver);
		act.dragAndDropBy(ele, 30, 0).build().perform();
	}

}
