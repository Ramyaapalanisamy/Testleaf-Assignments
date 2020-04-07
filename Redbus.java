package week1.day5;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		Thread.sleep(500);
		WebElement che = driver.findElementById("src");
		che.sendKeys("Chennai");
		Thread.sleep(500);
		driver.findElementById("src").sendKeys(Keys.TAB);
		WebElement bang=driver.findElementById("dest");
		bang.sendKeys("Bangalore");
		Thread.sleep(500);
		driver.findElementById("dest").sendKeys(Keys.TAB);
		WebElement mydate = driver.findElementByXPath("//*[@id='rb-calendar_onward_cal']//table//tbody//tr[7]//td[4]");
		mydate.click();
		WebElement mysearch = driver.findElementById("search_btn");
		mysearch.click();
		WebElement myclick = driver.findElementByXPath("//*[@id='filter-block']//div//div[2]//ul[2]//li[4]//label[1]");
	     myclick.click();
	     WebElement mysleeper = driver.findElementByXPath("//*[@id='filter-block']//div//div[2]//ul[3]//li[2]//label[2]");
	     mysleeper.click();
	     WebElement myseat = driver.findElementByXPath("//*[@id='root']//div/div[2]//div[2]//div[1]//div[7]//a//text()");
	     myseat.click();


	}
}
