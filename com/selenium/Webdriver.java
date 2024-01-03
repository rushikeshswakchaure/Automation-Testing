package com.selenium;

import java.awt.Choice;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver {
	
	public static void main(String[] args) {

	    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a browser:");
        System.out.println("1. Chrome");
        System.out.println("2. Firefox");
        System.out.println("3. Edge");
       

        int choice = scanner.nextInt();
        		
        WebDriver driver = null;

        switch (choice) {
            case 1:
                driver = new ChromeDriver();
                break;

            case 2:
                driver = new	 FirefoxDriver();
                break;

            case 3:
                driver = new EdgeDriver();
                break;


            default:
                System.out.println("Invalid choice");
                
        }
	}
}



