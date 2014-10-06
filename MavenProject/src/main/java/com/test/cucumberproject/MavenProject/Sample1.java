package com.test.cucumberproject.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample1 
{
static WebDriver driver;
	@Given ("^User is navigated to \"([^\"]*)\" application$")
	public void LaunchApp(String URL) throws Exception
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get(URL);
		System.out.println(URL);
		driver.manage().window().maximize();
		//navigate(URL);
//		System.out.println(URL);
//		System.out.println("I am a tester");
	}
//	@Given ("^Value \"([^\"]*)\" entered in Username Text field$")
//	public void EnterCredentials_Email(String UN) throws Exception
//	{
//		driver.findElement(By.xpath(OR.getProperty("EmialID_TextField"))).clear();
//		Click("EmialID_TextField");
//		SendKeys("EmialID_TextField",UN);
//		System.out.println("'"+UN+"' entered in UserName Edit Field");
//		//driver.findElement(By.xpath(OR.getProperty("EmialID_TextField"))).sendKeys(UN);
//	}
	@When ("^Value \"([^\"]*)\" is entered in Username Text field$")
	public void EnterCredentials_Email(String UN) throws Exception
	{
		driver.findElement(By.xpath("//input[@id='username']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UN);
		//SendKeys("EmialID_TextField",UN);
		System.out.println("'"+UN+"' entered in UserName Edit Field");
		//driver.findElement(By.xpath(OR.getProperty("EmialID_TextField"))).sendKeys(UN);
	}
	@When ("^Value \"([^\"]*)\" is entered in Password Text field$")
	public void EnterCredentials_Password(String Password) throws Exception
	{
		driver.findElement(By.xpath("//input[@id='password']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
		//SendKeys("Password_TextField",Password);
		System.out.println("'"+Password+"' entered in Password Edit Field");
	}
	@When ("^Click on Login button$")
	public void ClickLoginButton() throws Exception
	{
		driver.findElement(By.xpath("//input[@id='loginButton']")).click();
		//Click("Login_btn");
		System.out.println("Login Button Clicked.");
		//Thread.sleep(4000);
	}
	@Then ("^User is navigated to the application homepage$")
	public void imessupwithit() throws Exception
	{
		WebDriverWait DW= new WebDriverWait(driver,30);
		DW.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='logo']")));
		if(driver.findElements(By.xpath(".//*[@id='logo']")).size()!=0)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}	
		System.out.println("User is successfully logged into the application");
	}
	
	
	
}
