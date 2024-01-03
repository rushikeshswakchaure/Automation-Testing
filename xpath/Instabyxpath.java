package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instabyxpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("rushikesh");
		
		driver.findElement(By.xpath("//span[contains(@class,'_ap3a')]")).click();
		
		driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
	}

}
