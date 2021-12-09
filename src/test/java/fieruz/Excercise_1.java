package fieruz;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise_1 {

	public static void main(String[] args) throws InterruptedException {

		String url = "http://demoqa.com/text-box/";

		//Set the System property
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fieruz\\Desktop\\Selenium\\chromedriver.exe");

		//create webDriver object
		WebDriver driver= new ChromeDriver();
		//maximize
		driver.manage().window().maximize();	
		//url 
		driver.get(url);
		//name of user
		driver.findElement(By.id("userName")).sendKeys("Fieruz");
		//email 
		driver.findElement(By.id("userEmail")).sendKeys("fie@gmail");
		//address
		driver.findElement(By.id("currentAddress")).sendKeys("123 Flower St.");
		//permanent address
		driver.findElement(By.id("permanentAddress")).sendKeys("452 EastWest Ave.");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).sendKeys(Keys.RETURN);
		//wait
		Thread.sleep(7000);		
		driver.quit();		
	}
}
