package Instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class login {

	public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.instagram.com");
	driver.manage().window().maximize();
    driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("7075345527");
    driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("Deepu@1227");
    driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button")).click();
    driver.findElement(By.xpath("//*[@id=\"mount_0_0_7D\"]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div/div/div/div[1]/div/span/div/a/div/div/div/div/svg")).click();
    
    //driver.findElement(By.xpath("//*[@id=\"mount_0_0_NU\"]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/section/main/div/div/div/div/div")).click();
	}

}
