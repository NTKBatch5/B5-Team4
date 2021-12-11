package nihal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		// Set System property for chromedrive
		System.setProperty("webdriver.chrome.driver", "/Users/nihalcelik/Desktop/Selenium/chromedriver");

		// Create an object of WebDriver
		WebDriver driver = new ChromeDriver();

		// Navigate to URL
		driver.get("https://noorteck.com/");

		Thread.sleep(5000);

		driver.quit();

	}
}