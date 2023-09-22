package com.genericUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	public FileUtility fileutils=new FileUtility();
	
	@BeforeMethod
	//@Parameters("browserName")
	public void configBeforeMethod() throws IOException {
	String browserName = fileutils.readCommondata("browser");

	if(browserName.equals("chrome")) {
	   driver=new ChromeDriver();
	}
	else if(browserName.equals("edge")) {
	driver=new EdgeDriver();
	}
	else if(browserName.equals("firefox")) {
	driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get(fileutils.readCommondata("url"));
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void configAfterMethod() {
		driver.manage().window().minimize();
	


}}
