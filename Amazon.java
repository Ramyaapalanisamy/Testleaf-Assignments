package week1.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("http://amazon.in");
		Thread.sleep(5000);	
driver.findElementByXPath("//div[@id='nav-xshop']/a[9]").click();
Thread.sleep(1000);
driver.findElementByLinkText("Fiction").click();
Thread.sleep(5000);	
driver.findElementByXPath("(//div[contains(@class,'a-section a-spacing-none')]//div)[1]").click();
driver.findElementByXPath("(//div[contains(@class,'a-section octopus-pc-item-image-section')]//div)[1]").click();
Thread.sleep(5000);	
WebElement author = driver.findElementByXPath("(//div[contains(@class,'a-column a-span4')]//a)[1]");
Thread.sleep(5000);	
String authorName= author.getText();
System.out.println(authorName);
Thread.sleep(5000);	
WebElement bookPrice = driver.findElementByXPath("(//td[contains(@class,'a-color-price a-size-medium')]//span)[1]");
String price = bookPrice.getText();
System.out.println(price);
driver.close();


	
	
	
	
	
	}

}
