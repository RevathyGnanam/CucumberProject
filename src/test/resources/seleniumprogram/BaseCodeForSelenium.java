package seleniumprogram;
import org.openqa.selenium.chrome.ChromeDriver;
import programs.CountDuplicateArrays;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCodeForSelenium  {

	@Test
	public void launch() {
		
		String baseurl ="https://letcode.in/";

		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver(); 
		driver.get(baseurl); 

	}

}
