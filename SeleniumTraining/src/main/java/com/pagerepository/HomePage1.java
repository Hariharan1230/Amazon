package com.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 {
	WebDriver driver;
	public HomePage1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[text()='Select delivery location']") 
	private WebElement loc;
	
	public WebElement getLoc() {
	   return loc;
	}
	@FindBy(xpath ="(//span[@class='a-price-whole'])[6]")
	private WebElement prize;
	public WebElement getPrize () {
	  return prize;
	}
	@FindBy(id="GLUXZipUpdateInput") 
	private WebElement pinCode;
	
	public WebElement getPinCode() {
	return pinCode;
	}
	@FindBy(xpath="//input[@aria-labelledby=\"GLUXZipUpdate-announce\"]")
	private WebElement apply;
	
	public WebElement getApply() {
		return apply;
	}
	@FindBy(xpath="//input[@title=\"Add to Shopping Cart\"]")
	private WebElement addCart;
	
	public WebElement getAddCart() { 
		return addCart;
	}
	@FindBy(xpath="(//h4[text()='Added to Cart'])[2]")
	private WebElement addcartMessage;
	
	public WebDriver getDriver() { 
		return driver;
	}
	public WebElement getAddcartMessage() {
	    return addcartMessage; 
	
	}
}

