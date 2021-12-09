package fieruz;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

public class Excercise_2 {

	public static void main(String[] args) throws InterruptedException {
          //url
		String url = "http://demo.guru99.com/test/newtours/";
		//Set system property for chrome// driverpath
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fieruz\\Desktop\\Selenium\\chromedriver.exe");
		//create an object of webdriver
		WebDriver driver = new ChromeDriver();
        // maximize window
		driver.manage().window().maximize();
		//navigate to url
		driver.get(url);
		//REGISTER
		driver.findElement(By.linkText("REGISTER")).click();		

		//RETRIVE TITLE
		String actualTitle = driver.getTitle();
		String expectedTitle = "Register: Mercury Tours";
          //check if pass or
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("TITLE VERIFICATION PASSED");
		} else {
			System.out.println("TITLE VERIFICATION FAILED");
		}
		//first name
		driver.findElement(By.name("firstName")).sendKeys("Fieruz");
		// enter last name
		driver.findElement(By.name("lastName")).sendKeys("s");
		// phone number
		driver.findElement(By.name("phone")).sendKeys("45222");
		// email
		driver.findElement(By.id("userName")).sendKeys("fs@yahoo.com");
		// address
		driver.findElement(By.name("address1")).sendKeys("Flower Ave");
		// city
		driver.findElement(By.name("city")).sendKeys("Alexandria");
		// state
		driver.findElement(By.name("state")).sendKeys("VA");
         //postal code
		driver.findElement(By.name("postalCode")).sendKeys("22215");
		// country
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ERITREA");
		//wait 2 sec
		Thread.sleep(2000);
         // username
		driver.findElement(By.id("email")).sendKeys("fs@yahoo.com");
		//  password
		driver.findElement(By.name("password")).sendKeys("kl12355");
		// confirm password 
		driver.findElement(By.name("confirmPassword")).sendKeys("kl12355");
		Thread.sleep(2000);
		// click submit
		driver.findElement(By.name("submit")).click();
		// get the confirmation text message and check if the confirmation text me Thank you for registering
		Thread.sleep(2000);
		String actualMessage = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).getText();
		String expectedMessage = "Thank you for registering.";
		//check if pass
		if (actualMessage.contains(expectedMessage)) {
			System.out.println("the testcase has passed");
		} else {
			System.out.println("the testcase failed");
		}
		//wait
		Thread.sleep(6000);
		driver.quit();
		}

}
