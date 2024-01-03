package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByName {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://rushi/login.do");
		
		//Enter user name
		driver.findElement(By.name("username")).sendKeys("admin");
		
		//Enter password 
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		
		//click login button
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(6000);
		String s=driver.getTitle();
		System.out.println(s);
		driver.quit();
	
		
		
		
	}
}
