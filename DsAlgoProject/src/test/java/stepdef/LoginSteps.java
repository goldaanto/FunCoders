package stepdef;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver = null;

	@Given("when the browser is open")
	public void when_the_browser_is_open() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}


	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		driver.get("https://dsportalapp.herokuapp.com/login");
	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password() {
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("goldaanto@gmail.com");
		WebElement userPass = driver.findElement(By.name("password"));
		userPass.sendKeys("golda@123");
	}

	@When("Clicks on login button")
	public void clicks_on_login_button() {
		WebElement webclick = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[4]"));
		webclick.click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		driver.findElement(By.linkText("Get Started")).isDisplayed();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
