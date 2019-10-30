package testGet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1236 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriver driver ;

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
