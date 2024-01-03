package Locators;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium.newProject;

public class Actitime {
	
	public static void main(String[] args) throws InterruptedException {
		
		Random r=new Random();
		
		int no=r.nextInt(10000);
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://rushi/login.do");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("mahesh kumar"+no,Keys.ENTER);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
