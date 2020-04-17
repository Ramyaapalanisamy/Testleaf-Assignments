package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Basicauth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// add system property -> webdriver.chrome.driver
				System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
				
				// Open the chrome browser
				// ChromeDriver (C) -> Written by Selenium Team
				ChromeDriver driver = new ChromeDriver();

				// Wait (for the element to appear for the max time: 30)
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				// Load the URL :: get ->
				driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
				
				// syntax for URL: https://username:password@url 
	}

}
