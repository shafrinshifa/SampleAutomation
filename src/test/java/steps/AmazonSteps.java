package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSteps {
	
	WebDriver driver;
	
	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
	    
	}

	@Given("user give an username")
	public void user_give_an_username() {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9600282648");
		driver.findElement(By.id("continue")).click();
	   
	}

	@Given("user give an password")
	public void user_give_an_password() {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.id("signInSubmit")).click();
	    
	}

	@Then("the home page is showed")
	public void the_home_page_is_showed() {
		driver.quit();
	    
	}


}
