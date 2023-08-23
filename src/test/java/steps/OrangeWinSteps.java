package steps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeWinSteps {
	
	public String parent;
	WebDriver driver = new ChromeDriver();
	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   
	    String parent = driver.getWindowHandle();
	    
	}

	@Given("user clicks on the icons")
	public void user_clicks_on_the_icons() {
		driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
		driver.findElement(By.xpath("(//a[@target='_blank'])[2]")).click();
		driver.findElement(By.xpath("(//a[@target='_blank'])[3]")).click();
		driver.findElement(By.xpath("(//a[@target='_blank'])[4]")).click();    
		
		
		
	}

	@When("user should switch the windows")
	public void user_should_switch_the_windows() {
		Set<String> childs = driver.getWindowHandles();
		List<String> all= new ArrayList<String>(childs);
		
		for (String string : all) {
			if (string != parent ) {
				driver.switchTo().window(string);
				String url = driver.getCurrentUrl();
				System.out.println(url);
				
				driver.close();
			}
			
		} 
		
	    
	    
	}

	@When("user print the Titles")
	public void user_print_the_titles() {
		
	    
	    
	}

	@Then("user close the all taps expect parent window")
	public void user_close_the_all_taps_expect_parent_window() {
	    
	    
	}


}
