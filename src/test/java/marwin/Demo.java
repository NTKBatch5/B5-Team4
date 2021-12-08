package marwin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
 
	//MARVIN not MARWIN hahaha
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/nyumbani/Desktop/Selenium/chromedriver");

		String url = "http://demo.guru99.com/test/newtours/";
		
		//set system property
		System.setProperty("webdriver.chrome.driver", "/Users/nyumbani/Desktop/Selenium/chromedriver");

		//create WebDriver object
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get(url);
		
		//click register
		driver.findElement(By.linkText("REGISTER")).click();
		
		//verify "Register: Mercury Tours
		
		//first name
		driver.findElement(By.name("firstName")).sendKeys("Marvin");
		
		//last name
		driver.findElement(By.name("lastName")).sendKeys("Martian");
		
		
		//phone number
		driver.findElement(By.name("phone")).sendKeys("4438871234");
		
		//email
		driver.findElement(By.id("userName")).sendKeys("marvinthemartian@mars.net");
		
		//address
		driver.findElement(By.name("address1")).sendKeys("131 Mars Yard");
		
		//city
		driver.findElement(By.name("city")).sendKeys("Martia");
		
		//state
		driver.findElement(By.name("state")).sendKeys("Marsonia");
		
		//zipcode
		driver.findElement(By.name("postalCode")).sendKeys("12345");
		
		//usernname
		driver.findElement(By.id("email")).sendKeys("marvinthemartian");
		
		//password
		driver.findElement(By.name("password")).sendKeys("password");
		
		//confirm password
		driver.findElement(By.name("confirmPassword")).sendKeys("password");
		
		//click submit
		driver.findElement(By.name("submit")).click();
		
		//confirmation text
		Thread.sleep(10000);
		
		//close browser
		driver.quit();
		
		
		
	}
	
	
	
}
