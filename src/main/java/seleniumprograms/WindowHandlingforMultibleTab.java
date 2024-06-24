package seleniumprograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingforMultibleTab{


	@Test
	public void launch() {

		WebDriver driver;
		String baseurl ="https://letcode.in/windows";

		WebDriverManager.chromedriver().setup(); 
		driver =new ChromeDriver();
		driver.get(baseurl);

		XpathObjects xpath =new XpathObjects(driver);
		
		//handle single window
		String parentWindow = driver.getWindowHandle();

		xpath.homemultitextbox.click();
		
		//get ready for multiple window
		Set<String> childWindow = driver.getWindowHandles();
		
		List<String> myList = new ArrayList<String>(childWindow);
		System.out.println(myList.size());
		driver.switchTo().window(myList.get(2));
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(myList.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(myList.get(0));
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
		
		


	}

}
