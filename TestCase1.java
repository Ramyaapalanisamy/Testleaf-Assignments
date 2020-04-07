package week1.day5;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase1 {

	//public static void main(String[] args) 
	public static void main(String[] args) {
	//O Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://acme-test.uipath.com/account/login");
		
		WebElement myemail = driver.findElementById("email");
		
		myemail.sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		
		driver.findElementById("password").sendKeys("leaf@12");
		
		driver.findElementById("buttonLogin").click();

		
		WebElement ele = driver.findElementByXPath("//button[text()[normalize-space()='Vendors']]");
				
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).perform();
		
		driver.findElementByLinkText("Search for Vendor").click();

		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		
		driver.findElementById("buttonSearch").click();
		
		WebElement wb = driver.findElementByXPath("(//table[@class='table']//td)[4]");
		String myCity = wb.getText();
		//String myCity = driver.findElementByXPath("(//table[@class='table']//td)[4]").getText();
		System.out.println(myCity);
		String countryName = driver.findElementByXPath("(//table[@class='table']//td)[5]").getText();
		System.out.println("Value is "+countryName);
				//System.out.println(countryName.getText());
		
		
		driver.findElementByLinkText("Log Out").click();
		driver.close();
		
		

	}

}
