package StepDefination;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import util.hooks;

public class RegMail {

WebDriver driver = hooks.driver;
	
	@Given("^launch the browser and hit the URL$")
	public void user_should_be_on_the_home_page() throws Throwable  {
	    driver.get("http://elearningm1.upskills.in/");
	    Thread.sleep(1000);
	}

	@When("^User hit the Signup$")
	public void clickSignup() throws Throwable {
		
	    driver.findElement(By.xpath("//*[@id='login-block']/div/ul/li[1]/a")).click();
	    
	}
	
	@And("^Fill the form and submit \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void registerUser(String firstName, String lastName, String email, String userName, String password, String phone, String language, String code, String skype, String linkedURI) throws Throwable {
		
		System.out.println("firstname"+firstName);
		
	    driver.findElement(By.id("registration_firstname")).sendKeys(firstName);
	    driver.findElement(By.id("registration_lastname")).sendKeys(lastName);
	    driver.findElement(By.id("registration_email")).sendKeys(email);
	    driver.findElement(By.name("username")).sendKeys(userName);
	    driver.findElement(By.name("pass1")).sendKeys(password);
	    driver.findElement(By.name("pass2")).sendKeys(password);
	    driver.findElement(By.id("registration_phone")).sendKeys(phone);
	    //driver.findElement(By.xpath(""));
	    driver.findElement(By.id("registration_official_code")).sendKeys(code);
	    driver.findElement(By.id("extra_skype")).sendKeys(skype);
	    driver.findElement(By.id("extra_linkedin_url")).sendKeys(linkedURI);
	    driver.findElement(By.id("registration_submit")).click();
	    Thread.sleep(1000);
	    
	}
	
	@Then("^Verify user successfully resgistered$")
	public void verifyUser() throws Throwable {
		
	    /*String name = driver.findElement(By.xpath("//*[@id='cm-content']/div/div[2]/div/p[1]/text()[1]")).getText();
	    System.out.println("Name : "+name);
	    String message = driver.findElement(By.xpath("//*[@id='cm-content']/div/div[2]/div/p[1]/text()[2]")).getText();
	    System.out.println("Message : "+message);*/
		
		String name = driver.findElement(By.xpath("//*[@id='cm-content']/div/div[2]/div/p[1]")).getText();
		System.out.println("Message : "+ name);
		
	    Thread.sleep(1000);
	}
	
	@When("^Click on Inbox$")
	public void clickInbox() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/ul/li[3]/a")).click();
		
	    Thread.sleep(1000);
	}
	
	@And("^Compose a message$")
	public void composeMessage() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id='toolbar']/div/div[1]/a[1]/img")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='compose_message']/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")).sendKeys("pranjal7a");
		driver.findElement(By.xpath("//*[@id='select2-compose_message_users-results']/li")).click();
		driver.findElement(By.id("compose_message_title")).sendKeys("newEMail");
		//driver.findElement(By.xpath("//*[@id='cke_14']/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.tagName("iframe")).click();
		 driver.switchTo().frame(0);
		 driver.findElement(By.xpath("/html/body")).sendKeys("newEMail");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("compose_message_compose")).click();
		System.out.println("mail sent");
		
	    Thread.sleep(3000);
	}
	
	
	
}
