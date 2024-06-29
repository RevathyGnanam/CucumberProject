package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements{


	@Test
	public void launch() {

		WebDriver driver;
		String baseurl ="https://google.com/";

		WebDriverManager.chromedriver().setup(); 
		driver =new ChromeDriver();
		driver.get(baseurl);

		XpathObjects xpath =new XpathObjects(driver);

		xpath.googletextbox.sendKeys("cricket",Keys.ENTER);
		
		 List<WebElement> crickets = driver.findElements(By.xpath("//*[contains(text(),'Crick') or contains(text(),'crick')]"));
		 int cricketssize = crickets.size();
		//int lastvalue = cricketssize-1;
		
		 System.out.println("cricket size------------- "+ cricketssize );
		 for (WebElement cricket : crickets) {
			System.out.println(cricket.getText());
			
			
		}
		 
		 driver.close();


	}

}
