package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

import io.opentelemetry.api.trace.Span;

public class AutomateVistara {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.airvistara.com/");
		
	   // Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[contains(text(), 'Accept All')]")).click();
		
		Thread.sleep(4000);
		
		 driver.findElement(By.id("//input[@id='onewaytrip']")).click();
		 
		 
		
		
		
		
		
	}

}
