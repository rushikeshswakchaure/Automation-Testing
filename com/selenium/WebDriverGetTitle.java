package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverGetTitle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		String actual_title=driver.getTitle();
		
		System.out.println("The title is"+actual_title);
		driver.manage().window().minimize();
		
		/*driver.get("https://www.amazon.com/");

		String title=driver.getTitle();
		
		System.out.println("The title is"+title);
		driver.manage().window().minimize();
		*/
		
		
		
		
	}

}
