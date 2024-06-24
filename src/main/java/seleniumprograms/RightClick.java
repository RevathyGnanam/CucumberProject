package seleniumprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick{


	@Test
	public void launch() {

		WebDriver driver;
		String baseurl ="https://demo.guru99.com/test/simple_context_menu.html";

		WebDriverManager.chromedriver().setup(); 
		driver =new ChromeDriver();
		driver.get(baseurl);
		
		WebElement ele = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions builder = new Actions(driver);
		builder.contextClick(ele).perform();
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Copy']"));
		ele2.click();
		Alert alert = driver.switchTo().alert();
		String text1 = alert.getText();
		System.out.println(text1);
		alert.accept();
		
		
		
		
		WebElement ele1 = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		builder.doubleClick(ele1).perform();
		Alert alert1 = driver.switchTo().alert();
		
		//String text = alert1.getText();
		//System.out.println(text);
		alert1.accept();
		
		driver.close();


	}

}
