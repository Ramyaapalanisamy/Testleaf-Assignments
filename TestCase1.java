package week1.day5;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://acme-test.uipath.com/account/login");
		WebElement myemail = driver.findElementById("email");
		myemail.sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		WebElement ele = driver.findElementByXPath("//button[text()[normalize-space()='Vendors']]");
		Actions vendor = new Actions(driver);
		vendor.moveToElement(ele).perform();
		driver.findElementByLinkText("Search for Vendor").click();
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		driver.findElementById("buttonSearch").click();
		WebElement countryName = driver.findElementByXPath("//td[text()='France']");
		System.out.println(countryName);
		driver.findElementByXPath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a").click();
		driver.close();
		
		

	}

}
