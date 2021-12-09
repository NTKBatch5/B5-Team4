package myriam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
public static void main(String[] args) throws InterruptedException {
		
		
		//1. Set system properties
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\15718\\Desktop\\Selenium\\chromedriver.exe");
		 
		
		//2. Create WebDriver object
		 WebDriver driver = new ChromeDriver();
		
		
		//3. Maximize windows
		 driver.manage().window().maximize();
		 
		 
		
		//4. Navigate to url
		 driver.get("http://demoqa.com/text-box/");
		 
		 
		//5. Enter name in full name field
		 driver.findElement(By.id("userName")).sendKeys("Myriam Khalil");
		
		
		//6. Enter email in the email field
		driver.findElement(By.id("userEmail")).sendKeys("k.myriamkhalil@gmail.com");
		
		
	
		//7. Enter address in the 1st current address field
		driver.findElement(By.id("currentAddress")).sendKeys("111 NorthPole St");
		
		
		
		//8. Enter address in the 2nd current address field
		driver.findElement(By.id("permanentAddress")).sendKeys("222 NorthPole St");
		
		
		// Click submit
				driver.findElement(By.id("submit")).click();
				
				
				
		// Wait 5 seconds
			 Thread.sleep(5000);
				
				
		// Close the browser
			  driver.quit();
				
	}			
	
}


