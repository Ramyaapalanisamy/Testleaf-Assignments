package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElementById("email").sendKeys("poykamaltemp@gmail.com");
		driver.findElementById("pass").sendKeys("Testing123#");
		driver.findElementByLinkText("Log In").click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.close();
		
	}

}
