package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		
		//open chrome browser
		
		ChromeDriver driver = new ChromeDriver();
		
		
				driver.get("http://www.leafground.com/pages/Link.html");
				
		//how many links are available?
				
				
			List<WebElement> links =	driver.findElementsByTagName("a");
			
			System.out.println(links.size());
			
		// click on the first link
			
			links.get(0).click();
			
			
	    // print title
			
			System.out.println(driver.getTitle());
			
		// click on the last ' go to home page ' link
			
		List<WebElement>	eles = driver.findElementsByLinkText("Go to Home Page");
		System.out.println(eles.size());
		eles.get(eles.size()-1).click();
		
		WebElement ele = driver.findElementByXPath("(//a{text()='Go to Home Page'])[last()]/following-sibling::label");
				System.out.println(ele.getText());
				
	}


	}


