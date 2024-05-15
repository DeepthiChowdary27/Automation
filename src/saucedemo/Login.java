package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("user-name")).sendKeys("standard_user");
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
    
	//dropdown
	Select filter=new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
    filter.selectByIndex(0);
    
    //addtocart
    driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();Thread .sleep(1000);
    
    //Open Cart
    driver.findElement(By.id("shopping_cart_container")).click();Thread.sleep(1000);
    
  //continue shopping
    driver.findElement(By.id("continue-shopping")).click();Thread.sleep(1000);
    
  //addtocart onemore item
    driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();Thread.sleep(1000);
    
    //Open Cart
    driver.findElement(By.id("shopping_cart_container")).click();Thread.sleep(1000);
    
    //checkout
    driver.findElement(By.id("checkout")).click();Thread.sleep(1000);
    driver.findElement(By.id("first-name")).sendKeys("Lakshmi");Thread.sleep(1000);
    driver.findElement(By.id("last-name")).sendKeys("M");Thread.sleep(1000);
    driver.findElement(By.id("postal-code")).sendKeys("500073");Thread.sleep(1000);
    
    //continue
    driver.findElement(By.id("continue")).click();Thread.sleep(1000);
    driver.findElement(By.id("finish")).click();Thread.sleep(1000);
    
    //BackHome
    driver.findElement(By.id("back-to-products")).click();Thread.sleep(1000);
    
    
	//logout
    driver.findElement(By.id("react-burger-menu-btn")).click();Thread.sleep(1000);
    
    driver.findElement(By.id("logout_sidebar_link")).click();Thread.sleep(1000);
    
	}

}
