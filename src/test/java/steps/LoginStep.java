package steps;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStep {
	
	WebDriver driver;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   }

	@When("the user enters the valid username and password")
	public void the_user_enters_the_valid_username_and_password() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	   
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	}

	
	@Then("the user should be navigated to home page")
	public void the_user_should_be_navigated_to_home_page() {
		driver.quit();

	
		
		
	    
	}


}
