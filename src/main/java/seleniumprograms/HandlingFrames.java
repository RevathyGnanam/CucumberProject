package seleniumprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames{


	@Test
	public void launch() {

		WebDriver driver;
		String baseurl ="https://letcode.in/frame";

		WebDriverManager.chromedriver().setup(); 
		driver =new ChromeDriver();
		driver.get(baseurl);

		XpathObjects xpath =new XpathObjects(driver);
		driver.switchTo().frame(0);
		xpath.firstnametextbox.sendKeys("Revathy");
		driver.switchTo().frame(0);
		xpath.emailtextbox.sendKeys("Rev");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		xpath.lastnametextbox.sendKeys("G");

		 driver.close();


	}

}
