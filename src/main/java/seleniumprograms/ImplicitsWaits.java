package seleniumprograms;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitsWaits{


	@Test
	public void launch() {

		WebDriver driver;
		String baseurl ="https://letcode.in/";

		WebDriverManager.chromedriver().setup(); 
		driver =new ChromeDriver();
		driver.get(baseurl);

		XpathObjects xpath =new XpathObjects(driver);

		xpath.loginButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		xpath.emailTextBox.sendKeys("revathygovindasamy241193@gmail.com");
		
		driver.close();


	}

}
