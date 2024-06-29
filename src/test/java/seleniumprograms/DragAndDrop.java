package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop{


	@Test
	public void launch() throws InterruptedException {

		WebDriver driver;
		String baseurl ="https://letcode.in/dropable";

		WebDriverManager.chromedriver().setup(); 
		driver =new ChromeDriver();
		driver.get(baseurl);



		driver.manage().window().maximize();
		WebElement frames = driver.findElement(By.xpath("(//html[@lang='en']//iframe)[1]"));
		driver.switchTo().frame(frames);

		WebElement dragtextbox = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droptextbox = driver.findElement(By.xpath("//div[@id='droppable']"));

		Actions builder = new Actions(driver);

		builder.dragAndDrop(dragtextbox, droptextbox).perform();
		Thread.sleep(3000);
		driver.close();


	}

}
