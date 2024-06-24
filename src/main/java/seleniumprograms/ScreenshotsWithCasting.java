package seleniumprograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotsWithCasting {

	@Test
	public void launch() throws IOException {
		
		//Without casting we need to take screenshot means we need to create webdriver for particular driver like chrome.
		
		WebDriver driver;
		String baseurl ="https://letcode.in/edit";

		WebDriverManager.chromedriver().setup(); 
		driver =new ChromeDriver();
		driver.get(baseurl);
		
		TakesScreenshot scrnshot = ((TakesScreenshot)driver);
		File srcfile = scrnshot.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./Snaps/img1.png");
		FileUtils.copyFile(srcfile, destfile);
		//FileHandler.copy(srcfile, destfile);
		
		
		driver.quit();


		


	}

}
