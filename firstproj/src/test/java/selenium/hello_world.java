package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hello_world {
	public static  void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Sindhu\\Sindhu Docs\\Numpy Ninja\\selenium\\firstproj\\src\\test\\resources\\drivers\\chromedriver.exe");
	WebDriver chromedriver=new ChromeDriver();
		chromedriver.get("https://shein.com");
		System.out.println("hello");
	
	}
}
