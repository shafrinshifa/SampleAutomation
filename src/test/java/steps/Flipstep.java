package steps;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.MultiResolutionImage;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Flipstep {
	WebDriver driver = new ChromeDriver();


	@Given("user should be home page")
	public void user_should_be_home_page() {
		driver.get("https://www.flipkart.com/");
		
		

		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Set<String> first = driver.getWindowHandles();
		ArrayList<String> am = new ArrayList<String>(first);
		//driver.switchTo().window(am.get(0));

	}

	@Given("user should search product")
	public void user_should_search_product() {
		driver.findElement(By.name("q")).sendKeys("mobile");
	}

	@When("user search mobile")
	public void user_search_mobile() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	}

	@When("user  click add to cart")
	public void user_click_add_to_cart() throws AWTException, IOException {
		
		
		
		
		driver.findElement(By.xpath("//div[contains(text(),'POCO C51 (Royal Blue, 64 GB)')]")).click();
		
		Set<String> np = driver.getWindowHandles();
		List<String>win= new ArrayList<String>(np);
		driver.switchTo().window(win.get(1));
		
		driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")).click();
		//driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")).click();
		
       // driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/div[3]/div[2]/div[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/div[3]/div[2]/div[2]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Remove')]")).click();

         
	}

	@Then("cancel the add to cart")
	public void cancel_the_add_to_cart() {
		

System.out.println("done");

	}
}
