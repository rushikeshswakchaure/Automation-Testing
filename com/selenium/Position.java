package com.selenium;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Position {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		//Point  M=new Point(100, 200);
	
		driver.manage().window().setPosition(new Point (400, 200));
	}

}
