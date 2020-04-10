package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class learnflipkart {

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
		
		driver.findElementByLinkText("Apple").click();
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		 WebElement tv = driver.findElementByXPath("(//span[@class='_1QZ6fC _3Lgyp8'])[2]");
		builder.moveToElement(tv).perform();
		
		driver.findElementByXPath("(//a[text()='LG'])[1]").click();
		
		
		WebElement title = driver.findElementByXPath("//div[text()='LG All-in-One 80cm (32 inch) HD Ready LED Smart TV']");
		System.out.println(title.getText());
		
	}
}

    
