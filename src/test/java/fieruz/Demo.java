
package fieruz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		String url = "http://demoqa.com/text-box/";

		//Set the System property
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fieruz\\Desktop\\Selenium\\chromedriver.exe");

		//create webDriver object
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();


		driver.get(url);
		driver.findElement(By.id("userName")).sendKeys("Fieruz");

		driver.findElement(By.id("userEmail")).sendKeys("email");

		driver.findElement(By.id("currentAddress")).sendKeys("address");

		driver.findElement(By.id("permanentAddress")).sendKeys("different address");

		driver.findElement(By.id("submit")).clear();

		Thread.sleep(3000);

		driver.quit();


	}


