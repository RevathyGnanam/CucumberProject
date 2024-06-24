package projectspecific;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LetCodeBase {

	public void launch() {

		WebDriver driver;
		String baseurl ="https://letcode.in/";

		WebDriverManager.chromedriver().setup(); 
		driver =new ChromeDriver();
		driver.get(baseurl);


	}
}
