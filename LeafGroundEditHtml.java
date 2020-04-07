package week1.day3;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.util.List;
//import java.util.concurrent.TimeUnit;


public class LeafGroundEditHtml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		
		//open chrome browser
		//chromedrive(c)-written by selenium team
		ChromeDriver driver = new ChromeDriver();
		
		
				driver.get("http://leafground.com/pages/Edit.html");
				driver.findElementById("email").sendKeys("ramyaapalanisamy@gmail.com");
				driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input").sendKeys("test");
	 //WebElement textBox =  driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input");
	 //textBox.sendKeys("ramyaapalanisamy@gmail.com",Keys.TAB);
	 
    
	 
				
				
			WebElement attribute = driver.findElementByName("username");
			attribute.getAttribute("value");
			System.out.println(attribute);
			
			WebElement mytextBox = driver.findElementByXPath("(//input[@name='username'])[2]");
			mytextBox.clear();
			
			boolean enabled = driver.findElementByXPath("//input[@disabled='true']").isEnabled();
			System.out.println(enabled);
			if (enabled == false)
			{
				System.out.println("This field is disabled");
			}
			
	}

	//private static void getattribute(String string) {
		// TODO Auto-generated method stub
		
	}


