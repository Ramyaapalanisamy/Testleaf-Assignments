package week2.day3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtableassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
       driver.get("http://www.leafground.com/pages/table.html");

		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement table = driver.findElementByXPath("//td[text()='Learn Locators']");
		List<WebElement> Totalrows = table.findElements(By.tagName("tr"));
		System.out.println(Totalrows.size());
		
		
		
		
	}

}
