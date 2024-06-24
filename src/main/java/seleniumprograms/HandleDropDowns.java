package seleniumprograms;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDowns{


	@Test
	public void launch() {

		WebDriver driver;
		String baseurl ="https://letcode.in/dropdowns";
		

		WebDriverManager.chromedriver().setup(); 
		driver =new ChromeDriver();
		driver.get(baseurl);

		//select the single dropdown
		WebElement myfruits = driver.findElement(By.id("fruits"));
		Select fruits = new Select(myfruits);
		fruits.selectByValue("1");
		WebElement fruit1 = fruits.getFirstSelectedOption();
		System.out.println(fruit1.getText());
		fruits.selectByIndex(0);
		fruits.selectByVisibleText("Apple");

		//print the value from multiple drop down
		WebElement mysuperheros = driver.findElement(By.id("superheros"));
		Select superheros = new Select(mysuperheros);
		System.out.println(superheros.isMultiple());
		superheros.selectByValue("ta");
		superheros.selectByVisibleText("Black Panther");
		List<WebElement> allheros = superheros.getAllSelectedOptions();
		/*
		 * for(int i=0;i<allheros.size();i++) {
		 * System.out.println(allheros.get(i).getText()); }
		 */
for (WebElement allhero : allheros) {
	System.out.println(allhero.getText());
	
}
		driver.close();


	}

}
