package seleniumprograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotsWithoutCasting {

	@Test
	public void launch() throws IOException {
		
		//Without casting we need to take screenshot means we need to create webdriver for particular driver like chrome.
		
		ChromeDriver driver;
		String baseurl ="https://letcode.in/";

		WebDriverManager.chromedriver().setup(); 
		driver =new ChromeDriver();
		driver.get(baseurl);

		XpathObjects xpath =new XpathObjects(driver);

		//Takescreenshot without casting
		File srcfile = driver.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./Snaps/img1.png");
		FileHandler.copy(srcfile, destfile);
		
		//take screenshot for particular element
		WebElement logButton = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
		File srcfile2 = logButton.getScreenshotAs(OutputType.FILE);
		File destfile2 = new File("./Snaps/img2.png");
		FileHandler.copy(srcfile2, destfile2);
		
		//takescreenshot for particular section
		WebElement section = driver.findElement(By.xpath("(//div[@class='hero-body'])[1]"));
		File srcfile3 = section.getScreenshotAs(OutputType.FILE);
		File destfile3 = new File("./Snaps/img3.png");
		FileHandler.copy(srcfile3, destfile3);
		driver.quit();


		


	}

}
