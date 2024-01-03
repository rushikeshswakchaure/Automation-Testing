package com.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		Dimension a=new Dimension(400, 800);
		
		driver.manage().window().setSize(a);
	}
}
