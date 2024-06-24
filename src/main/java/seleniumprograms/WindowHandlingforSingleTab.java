package seleniumprograms;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingforSingleTab{


	@Test
	public void launch() {

		WebDriver driver;
		String baseurl ="https://letcode.in/windows";

		WebDriverManager.chromedriver().setup(); 
		driver =new ChromeDriver();
		driver.get(baseurl);

		XpathObjects xpath =new XpathObjects(driver);

		//get parent window
		String parentwindow = driver.getWindowHandle();

		//click on the new tab
		xpath.hometextbox.click();
		
		//get ready to create a child window
		Set<String> childwindow = driver.getWindowHandles();
		System.out.println("child window size +" +childwindow.size());

		//parent window is not  equal to child window then switch to child window
		for (String child : childwindow) {

			if(!parentwindow.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}


		}

		driver.switchTo().window(parentwindow);
		System.out.println(driver.getCurrentUrl());
	}

}
