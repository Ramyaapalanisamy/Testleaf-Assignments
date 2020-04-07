package week1.day2;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//locate browser execute file
		
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		
		//open chrome browser
		
		ChromeDriver driver = new ChromeDriver();
		
		// open google home page
		
		driver.get("http://google.com/");
		
	}

}
