package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		@SuppressWarnings("unused")
		List<WebElement> CHK=driver.findElements(By.xpath("//*[@type='checkbox']"));
		
		//driver.findElement(By.id("vfb-6-0")).click();
	   

	}

}
