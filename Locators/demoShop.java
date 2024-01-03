package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoShop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
	     Thread.sleep(2000);
		
		driver.findElement(By.className("forcheckbox")).click();
		driver.findElement(By.name("FirstName")).sendKeys("mahesh");
		driver.findElement(By.name("LastName")).sendKeys("ghule");
		driver.findElement(By.name("Email")).sendKeys("hello123@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("123456");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("123456");
		Thread.sleep(2000);
        driver.findElement(By.name("register-button")).click();
        Thread.sleep(2000);
     
		 driver.quit();
	}
}
