package Amzon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
	    driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	    driver.findElement(By.name("email")).sendKeys("durgaprinters123@gmail.com");
	    driver.findElement(By.id("continue")).click();
	    driver.findElement(By.name("password")).sendKeys("adwaitha.123");
	    driver.findElement(By.id("signInSubmit")).click();
	    driver.findElement(By.className("a-button-input")).click();
	    driver.get("https://www.amazon.in//");
	    driver.findElement(By.name("field-keywords")).click();
	    
	    	
	}

}
