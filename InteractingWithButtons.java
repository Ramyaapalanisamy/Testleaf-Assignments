package week1.day4;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractingWithButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement mylogin = driver.findElementById("login");
		Point location = mylogin.getLocation();
		System.out.println(location);
		
		
	String mycolor = driver.findElementById("color").getCssValue("background-color");
	System.out.println(mycolor);
		
		
	}

}
