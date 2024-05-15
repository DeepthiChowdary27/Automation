package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		driver.manage().window().maximize();
		Select dropdown=new Select (driver.findElement(By.id("user_title")));
        dropdown.selectByIndex(2);
        Thread.sleep(2000);
        dropdown.selectByValue("Ms");
        Thread.sleep(2000);
        dropdown.selectByVisibleText("Doctor");
        // Firstname
        driver.findElement(By.id("user_firstname")).sendKeys("umasai");
        Select year=new Select(driver.findElement(By.id("user_dateofbirth_1i")));
        year.selectByValue("1980");
        Select month=new Select(driver.findElement(By.name("month")));
        month.selectByIndex(11);
        Select date=new Select(driver.findElement(By.id("user_dateofbirth_3i")));
        date.selectByValue("19");
	}

}
