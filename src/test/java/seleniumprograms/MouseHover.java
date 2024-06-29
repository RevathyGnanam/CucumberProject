package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover{


	@Test
	public void launch() {

		WebDriver driver;
		String baseurl ="https://www.flipkart.com/";

		WebDriverManager.chromedriver().setup(); 
		driver =new ChromeDriver();
		driver.get(baseurl);

		XpathObjects xpath =new XpathObjects(driver);
		
		WebElement ele = driver.findElement(By.xpath("//div[@class='_1wE2Px']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).perform();
		WebElement ele1 = driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']"));
		ele1.click();
		WebElement ele2 = driver.findElement(By.xpath("//h1[text() ='Women Ethnic Wear']"));
		String title = ele2.getText();
		SoftAssert tit = new SoftAssert();
		tit.assertAll(title);
		
		driver.close();


	}

}
