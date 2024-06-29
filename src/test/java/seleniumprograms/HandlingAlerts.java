package seleniumprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlerts{


	@Test
	public void launch() {

		WebDriver driver;
		String baseurl ="https://letcode.in/alert";

		WebDriverManager.edgedriver().setup(); 
		driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		driver.manage().window().minimize();

		XpathObjects xpath =new XpathObjects(driver);
		
		//simple Alert
		xpath.simpleAlert.click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		//prompt Alert
		xpath.promptAlert.click();
		driver.switchTo().alert();
		alert.sendKeys("Revathy");
		alert.accept();
		//alert.getText()
		//
		
		
		
		
		
		
		
		
		

		 driver.close();


	}

}
