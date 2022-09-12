package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityComponents.BaseClass;

public class OrderComformationPage extends BaseClass{
		@FindBy(xpath="//p[@class=\"alert alert-success\"]")
		WebElement orderComformMsg;
		
		public OrderComformationPage() {
			PageFactory.initElements(driver, this);
		}
		
		public String orderComformationMsg() {
			String textMsg=orderComformMsg.getText();
			return textMsg;
		}
}
