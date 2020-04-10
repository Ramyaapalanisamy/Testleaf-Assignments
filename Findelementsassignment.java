package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelementsassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//To Count how many images in the page
	List<WebElement> imgCount = driver.findElementsByTagName("img");
	System.out.println(imgCount.size());
		
	//Navigate back
	driver.navigate().to("http://leafground.com/pages/radio.html");
	
	
	
	// to count how many radio buttons
	List<WebElement> Radiobutton = driver.findElementsByXPath("//input[@type='radio']");
	
	System.out.println(Radiobutton.size());
	
	
	// navigate to
	driver.navigate().to("http://www.leafground.com/pages/checkbox.html");
	
	
	//CheckBox
			driver.findElement(By.xpath("(//h5[@class='wp-categories-title']/following::img)[7]")).click();
			
			//To uncheck the previously checked checkbox
			
			driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).click();
			driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
			
			Thread.sleep(1000);
		// check all the boxes	
			
	List<WebElement> CheckAllBoxes = driver.findElementsByXPath("//input[@type='checkbox']");
	 
	
	for (WebElement check :  CheckAllBoxes) {
		check.click();

	}	
	
	for (WebElement ischecked :  CheckAllBoxes) {
		
	
	
	if(ischecked.isSelected()) {
		
	}
	
	else
	{
		System.out.println("All checkbox are not checked");
		
		driver.close();
		break;
		
	}	
		
	}
	
	System.out.println("All checkbox are checked");
	driver.close();
	
	 
	
	}

}
