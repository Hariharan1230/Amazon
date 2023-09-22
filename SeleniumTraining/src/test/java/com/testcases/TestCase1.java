package com.testcases;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.genericUtility.BaseClass;
import com.pagerepository.HomePage;
import com.pagerepository.HomePage1;

public class TestCase1 extends BaseClass {
	@Test
	public void hari() throws InterruptedException {
		HomePage hp=new HomePage(driver);
        Actions action=new Actions(driver);
        action.click(hp.getMoblieSMenu()).perform();
		int count=0;
		List<WebElement> menu1 = hp.getMenuoptions();
		for(WebElement menu:menu1)
		{
			String allTexts = menu.getText();
			System.out.println(allTexts);
			count++;
		}
		System.out.println(count);
		
		action.moveToElement(hp.getLaptopAndAccessories()).pause(2000).perform();
			hp.getlaptopAndAccessoriesDell().click();
			hp.getMinValue().click();
			hp.getMinValue().sendKeys("40000");
			action.sendKeys(Keys.TAB);
			hp.getMaxValue().sendKeys("100000");
			action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER);
			hp.getSearchBar().click();
			hp.getSearchBar().sendKeys("Gaming Laptops");
			hp.getSearchClick().click();
			String mainWindow = driver.getWindowHandle();
				System.out.println(mainWindow);
				HomePage1 hp1= new HomePage1(driver); 
				hp.getLaptop().click();
				Set<String> newWindow = driver.getWindowHandles();
				for(String allWindow : newWindow) {
					
				if (!allWindow.equals(mainWindow)) {
				 driver.switchTo().window(allWindow);
				 String prize = hp1.getPrize().getText();
				int prizeInt = Integer.parseInt(prize.replace(",", ""));
				if (prizeInt > 40000) {
			     System. out.println("The Prize of The GamingLaptop is Greater Than 40000");
			     }else {
				  System. out.println("The Prize of The GamingLaptop is Lesser Than 40000");
			     }
				hp1.getLoc().click();
				hp1.getPinCode().click();
				hp1.getPinCode().sendKeys("560076");
				hp1.getApply().click();
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,500)", "");
				Thread.sleep(3000);
				hp1.getAddCart().click();
			    Thread.sleep(5000);
				String textMessage = hp1.getAddcartMessage().getText();
					System.out.println(textMessage);
					if (textMessage.equalsIgnoreCase("Added To Cart")) {
					System.out.println("Succesfully Added");	
	}
}
	}
}
}
