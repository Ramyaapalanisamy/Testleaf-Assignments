package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartassingment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		driver.findElementByXPath("//button[text()='✕']").click();
		
		WebElement elec = driver.findElementByXPath("//span[text()='Electronics']");
		
		
		// to mouse over on a webelement
		
		Actions builder = new Actions(driver);
		builder.moveToElement(elec).perform();
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("(//a[text()='Mi'])[1]").click();
		
	 WebElement title = driver.findElementByXPath("//h1[text()='Mi Mobiles']");
	 String text = title.getText();
	 String title1 ="Mi Mobiles";
		
		if (text.equalsIgnoreCase(title1)) {
			
			System.out.println("Title contains Mi Mobiles");
			
		} else {
			
            System.out.println("Title doesnot contains Mi Mobiles");
		}
		

	}

}
