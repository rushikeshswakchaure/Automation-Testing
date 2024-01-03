package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoShopLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		   driver.findElement(By.className("ico-login")).click();
	        driver.findElement(By.name("Email")).sendKeys("hello123@gmail.com");
			driver.findElement(By.name("Password")).sendKeys("123456");
			driver.findElement(By.id("RememberMe")).click();
			Thread.sleep(3000);
			driver.findElement(By.className("login-button")).click();
			Thread.sleep(3000);
			driver.quit();
		
	} 

}
