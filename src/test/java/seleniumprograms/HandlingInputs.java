package seleniumprograms;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingInputs {

	@Test
	public void launch() {

		WebDriver driver;
		String baseurl ="https://letcode.in/edit";

		WebDriverManager.firefoxdriver().setup(); 
		driver =new FirefoxDriver();
		driver.get(baseurl);

		XpathObjects xpath =new XpathObjects(driver);
		//entername
		xpath.fullnameTextBox.sendKeys("Revathy");
		//append the text
		xpath.appendnameTextBox.sendKeys("Samyu",Keys.TAB);
		//get text from textbox
		xpath.getnameTextBox.getAttribute("value");
		//clearvalue
		xpath.clearnameTextBox.clear();
		//textbox is enabled
		boolean noedittextbox = xpath.noEditnameTextBox.isEnabled();
		System.out.println(noedittextbox);
		//ready only box is enabled
		String isreadyonlybox = xpath.dontwritenameTextBox.getAttribute("This text is readonly");
		System.out.println(isreadyonlybox);
		boolean isEditable = (isreadyonlybox!=null && isreadyonlybox.equals(true));
		
		
		if(isEditable)
		{
			System.out.println("field is editable");
		}
		
		else
		{
			System.out.println("field is not editable");
		}
		driver.quit();




        }

}
