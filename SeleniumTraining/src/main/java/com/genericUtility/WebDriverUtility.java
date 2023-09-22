package com.genericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WebDriverUtility {
   public void implicitlyWait(WebDriver driver) {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
   }
}
