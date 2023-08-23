package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

   
     
public class FacebookSteps {
	 WebDriver driver;
	@Given("user is now on the page")
	public void user_is_now_on_the_page() {
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		

	}
	@Given("user enter the {string} and {string}")
	public void user_enter_the_and(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	    
	}
	@When("user click the btn")
	public void user_click_the_btn() {
		driver.findElement(By.xpath("//button[@value='1']")).click();
	    
	}
	@Then("home page is displayed")
	public void home_page_is_displayed() {
		String msg = driver.findElement(By.xpath("(//div[@role='button'])[1]")).getText();
	    Assert.assertEquals(msg, true);
	    driver.quit();
	}
	
	
	@When("scenario is fail")
	public void scenario_is_fail() {
		driver.quit();
	    
	    
	}

}
