package steps;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonAddTotheCard {

	WebDriver driver;



	@Given("user should on the login pages")
	public void user_should_on_the_login_pages() {
		driver =new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();


	}

	@Given("user giving username and password correctly")
	public void user_giving_username_and_password_correctly() {
		//		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("shafrinshifa64@gmail.com");
		//		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		//		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Shifa1995");




	}

	@When("user clicks the login btn")
	public void user_clicks_the_login_btn() {
		//	driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();


	}
	@When("user clicks the search btn and search the product")
	public void user_clicks_the_search_btn_and_search_the_product() {
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone 14");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

	}

	@When("user place the order")
	public void user_place_the_order() throws AWTException, IOException {


		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click(); 
		String page1 = driver.getWindowHandle();  
		Set<String> allWindows = driver.getWindowHandles();
		ArrayList<String> am = new ArrayList<String>(allWindows);
		driver.switchTo().window(am.get(1));

		driver.findElement(By.xpath("//span[@id='submit.add-to-cart']")).click();
		

		driver.findElement(By.xpath("//*[@id=\"productTitle\"]")).click();



	} 
	@Then("user cancel the product from the order")
	public void user_cancel_the_product_from_the_order() throws AWTException, IOException {

		driver.findElement(By.xpath("//body/div[10]/div[3]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/form[1]/span[1]/span[1]/input[1]")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		

		Robot robot= new Robot();
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(screensize);
		BufferedImage source=robot.createScreenCapture(rectangle);
		File destinationfile = new File("D://Robotsnap.png");
		ImageIO.write(source, "png", destinationfile);
		

		driver.quit();

	}






}
