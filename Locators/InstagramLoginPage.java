package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		/*
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("abhishek_216_25");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("abhi2005");
		*/
		driver.findElement(By.name("username")).sendKeys("abhishek_216_25");
		driver.findElement(By.name("password")).sendKeys("abhi2005");
		//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		driver.findElement(By.className("_acap")).click();
	
		String s=driver.getTitle();
		System.out.println(s);
		driver.quit();
       
	}

}
