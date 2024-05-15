package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizeable {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement Resizeable=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions Act=new Actions(driver);
		Act.dragAndDropBy(Resizeable, -20, -20).perform();

	}

}
