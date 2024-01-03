package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Zomato {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/india");
		
		String s=driver.getTitle();
		System.out.println(s);
		
	    String u=driver.getCurrentUrl();
	    System.out.println("Zomato current url :"+u);
		
		driver.quit();
	}

}
