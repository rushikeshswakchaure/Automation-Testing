package Locators;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartDynamicPrice {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
        driver.findElement(By.xpath("//span[text()='✕']")).click();
        
    	driver.findElement(By.xpath("//input[contains(@class,'Pke')]")).sendKeys("iphone",Keys.ENTER);
    	
    	List<WebElement>  ProductName=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
    	
    	//List<WebElement> ProductPrice=driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant ::div[@class='_30jeq3 _1_WHN1']"));
	
    	/*
	   for(int i=0;i<ProductName.size();i++)
	   {
		   String name=ProductName.get(i).getText();
	   
	   for(int j=i;j<=i;j++)
	   {
		   String price=ProductPrice.get(j).getText();
	   }
	   */
	   for(WebElement name:ProductName)
	   {
		   String iphoneName=name.getText();
		   
		   String price=driver.findElement(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant ::div[@class='_30jeq3 _1_WHN1']")).getText();
	   }
	}
}

