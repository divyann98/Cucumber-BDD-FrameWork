package Cucumber.CucumberFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRM
{
	WebDriver driver;
	@Given("OpenURL")
	public void open_url() 
	{
		System.setProperty("webdriver.chrome.driver","/home/qq379/Selenium/Driver/chromedriver");

		driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("Enter Credentials")
	public void enter_credentials()
	{
		driver.manage().window().maximize();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	}

	@Then("Login Application")
	public void login_application() 
	{
		driver.findElement(By.className("button")).click();
	}

	@Then("Close Application")
	public void close_application() 
	{
		driver.close();
		driver.quit();
	}
}
