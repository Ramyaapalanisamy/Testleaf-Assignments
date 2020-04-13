package week2.day5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntraaasignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*1) Open https://www.myntra.com/
		2) Mouse over on WOMEN (Actions -> moveToElement
		3) Click Jackets & Coats
		4) Find the total count of item (top) -> getText -> String
			 String str = driver.findElementByClassName("title-count").getText();
			 split, 
			 String text = str.replaceAll("\\D","") -> String
			 Integer.parseInt(text) -> int
		5) Validate the sum of categories count matches
		6) Check Coats
		7) Click + More option under BRAND	
		8) Type MANGO and click checkbox
		9) Close the pop-up x
		10) Confirm all the Coats are of brand MANGO
		    findElements (brand) -> List<WebElement> 
		    foreach -> getText of each brand 
		    compare > if(condition)
		11) Sort by Better Discount
		12) Find the price of first displayed item
		     findElements (price) -> List<WebElement> 
		     get(0) -> WebElement -> getText -> String -> int
		13) Mouse over on size of the first item
		14) Click on WishList Now
		15) Close Browser*/
		
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		// new class to close web push notification
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--disable-notifications");
		
		//class created for webdriver
		ChromeDriver driver = new ChromeDriver(opt);
		
		
		// launch the url
		
		driver.get("http://www.myntra.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		
		//find the webelement
		WebElement ele = driver.findElementByXPath("(//a[text()='Women'])[1]");
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(ele).perform();
		
		driver.findElementByXPath("(//a[text()='Jackets & Coats'])[1]").click();
		
		String str = driver.findElementByClassName("title-count").getText();
		int text = Integer.parseInt(str.replaceAll("\\D",""));
	    
		System.out.println(text);
		
		
		
		String value1 = driver.findElementByXPath("(//span[@class='categories-num'])[1]").getText();
		String value2 = driver.findElementByXPath("(//span[@class='categories-num'])[2]").getText();
		
		System.out.println(value1);
		System.out.println(value2);
		
		int num1 = Integer.parseInt(value1.replaceAll("\\D",""));
		int num2 = Integer.parseInt(value2.replaceAll("\\D",""));
		
		int total = (num1+num2);
		System.out.println(total);
		
	if(total != text)
	{
		System.out.println("wrong");
		
	}else{
		System.out.println("right");

	} 
		
	
		
		driver.findElementByXPath("(//div[@class='common-checkboxIndicator'])[2]").click();
		
		driver.findElementByXPath("(//div[@class='brand-more'])").click();
		
		driver.findElementByXPath("(//input[@class='FilterDirectory-searchInput'])").sendKeys("MANGO");
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//span[@class='FilterDirectory-count']/following-sibling::div[1]").click();
		
		driver.findElementByXPath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']").click();
		
		
	
		List<WebElement> brand = driver.findElementsByXPath("//h3[@class='product-brand']");
		int size = brand.size();
			System.out.println(size);	
			
			Thread.sleep(3000);
		
		for (int loop = 0; loop < size; loop++) 
		{ 
		String brandname = brand.get(loop).getText();
						
				if (brandname.equalsIgnoreCase("MANGO")) 
				{
				String result = "PASS";	
					System.out.println("RESULT "+loop+": "+result);
				} 
				
			else 
				{
					String result = "FAIL";
					System.out.println("RESULT "+loop+": "+result);
				} 	
		}
		
			
		Thread.sleep(3000);
		
		WebElement sort = driver.findElementByXPath("//div[@class='sort-sortBy']");
	
		
		builder.moveToElement(sort).perform();
		driver.findElementByXPath("//input[@value='discount']").click();
		
		System.out.println("end");
		//(//label[@class='sort-label '])[3]/input
		//ul[@class='sort-list']//li
		
		
		List<WebElement> price = driver.findElementsByXPath("//div[@class='product-price']//span//span[@class='product-discountedPrice']");
		
	    // int i = price.size();
		System.out.println(price.size());
		System.out.println(price.get(0).getText());
		
		
		WebElement sizes = driver.findElementByXPath("(//h4[text()='Sizes: '])[1]");
		builder.moveToElement(sizes).perform();
		
		
		
		 driver.findElementByXPath("(//span[text()='wishlist now'])[1]").click();
	
		Thread.sleep(3000);

	
		driver.close();

		
	}
		
}

	

	
	
	
	


