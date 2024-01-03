package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByTagname {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.tagName("input")).sendKeys("phones");
		
		WebElement textbox = driver.findElement(By.tagName("input"));
		textbox.sendKeys(Keys.ENTER);
		
		Thread.sleep(4000);
		
		driver.quit(); 
	}

}
