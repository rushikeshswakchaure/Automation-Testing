package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WrappedAllElement {
	
	public static void main(String[] args) {
		

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/wakch/Documents/dropdown.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement dropdown = driver.findElement(By.id("movies"));
		
         Select s = new Select(dropdown);
         
         WebElement alloptions = s.getWrappedElement();
         
         System.out.println(alloptions.getText());
         
         driver.quit();
		
	}

}
