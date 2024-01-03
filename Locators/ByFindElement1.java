package Locators;

import java.awt.desktop.QuitEvent;
import java.io.Closeable;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByFindElement1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
        driver.findElement(By.xpath("//span[text()='✕']")).click();
		
		
		//driver.findElement(By.xpath("//input[contains(@class,'Pke')]")).sendKeys("redmi",Keys.ENTER);
		
		//WebElement iphone = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
		
		//System.out.println(iphone.getText());
		
		
		
		Thread.sleep(3000);
		
	     driver.quit();
		
	}

}
