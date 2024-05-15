package Instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Signup {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		WebElement Signupbutton=driver.findElement(By.cssSelector("span._ap3a._aaco._aacw._aad0._aad7"));
		Signupbutton.click();
		

	}

}
