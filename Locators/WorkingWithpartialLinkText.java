package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithpartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.partialLinkText("Sig")).click();
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
