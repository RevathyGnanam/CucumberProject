package seleniumprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablesConcept {

	@Test
	public void launch() throws InterruptedException {

		WebDriver driver;
		String baseurl ="https://letcode.in/table";

		WebDriverManager.chromedriver().setup(); 
		driver =new ChromeDriver();
		driver.get(baseurl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		XpathObjects xpath =new XpathObjects(driver);
//find the table
		WebElement table = driver.findElement(By.id("simpletable"));
		//print the column names
		List<WebElement> allHeaders = table.findElements(By.tagName("th"));
		System.out.println("allHeaders size ---------" + allHeaders.size());
		for (WebElement headers : allHeaders) {
			System.out.println(headers.getText());

		}
		
		List<WebElement> allrows = table.findElements(By.cssSelector("tbody tr"));
		System.out.println("allrows size ---------" + allrows.size());
		//System.out.println("allrows size ---------" +allrows.get(0););
		
		for (WebElement rows : allrows) {
			 List<WebElement> column = rows.findElements(By.tagName("td"));
			WebElement firstcolumn = column.get(1);
			System.out.println(firstcolumn.getText());
			if((firstcolumn.getText()).equals("Raj")) {
				rows.findElement(By.tagName("input")).click();
				boolean checked = rows.findElement(By.tagName("input")).isEnabled();
				System.out.println("checked----"+ checked);
				Thread.sleep(10000);
				break;
			}
			
		}
driver.close();
	}

}
