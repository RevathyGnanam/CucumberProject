package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCodeForSelenium{


	@Test
	public void launch() {

		WebDriver driver;
		String baseurl ="https://letcode.in/";

		WebDriverManager.chromedriver().setup(); 
		driver =new ChromeDriver();
		driver.get(baseurl);

		XpathObjects xpath =new XpathObjects(driver);

		xpath.loginButton.click();
		xpath.emailTextBox.sendKeys("revathygovindasamy241193@gmail.com");
		xpath.passwordTextBox.sendKeys("Revathyg@123"); 
		xpath.submitButton.click();
		xpath.forgotButton.isDisplayed(); 
		String title = driver.getTitle();
		System.out.println(title); driver.close();


	}

}
