package Dropdown;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.selenium.newProject;

public class Eliminatevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/wakch/Documents/dropdown.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement dropdown = driver.findElement(By.id("movies"));
		
         Select s = new Select(dropdown);
		
         List<WebElement> allDuplicateOptions = s.getOptions();
         
		TreeSet<String> set=new TreeSet<String>();
		
		for(int i=0;i<allDuplicateOptions.size();i++)
		{
			String alloptions = allDuplicateOptions.get(i).getText();
			
			set.add(alloptions);
		}
		
		for(String opt:set)
		{
			System.out.println(opt);
		} 
	}
	

}
