package com.pagerepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	    }
		@FindBy(xpath="//a[contains(text(),\"Mobiles\")]")
		private WebElement mobliesMenu;
		
		public WebElement getMoblieSMenu() { 
			return mobliesMenu;
		}
		
		@FindBy(xpath="//div[@id='nav-xshop']/child::a")
		private List<WebElement> menuOptions;
		
		public List<WebElement> getMenuoptions() {
		   return menuOptions;
		}
		
		@FindBy(xpath="//a[text() ='Dell']") 
		private WebElement laptopAndAccessoriesDell;
		
		public WebElement getlaptopAndAccessoriesDell() {
		   return laptopAndAccessoriesDell; 
        }
		
		@FindBy(xpath="//span[contains(text(),'Laptops & Accessories')]")
		private WebElement laptopAndAccessories;
		
		public WebElement getMinValue() {
		   return minValue;
		}
		public WebElement getLaptopAndAccessories() {
		   return laptopAndAccessories;
		}
		@FindBy (id="low-price") 
		private WebElement minValue;
		
		@FindBy (id="high-price") 
		private WebElement maxValue;
		
		public WebElement getMaxValue() {
		   return maxValue;
		}
		@FindBy (xpath="(//input[@type='submit'])[2]")
		private WebElement go;
		
		public WebDriver getDriver () {
		   return driver;
		}
		public WebElement getLaptopAndAccessoriesDell() {
		   return laptopAndAccessoriesDell;
		}
		public WebElement getGo() {
		   return go;
		}
	    @FindBy (id ="twotabsearchtextbox")
		 private WebElement searchBar;
	    
		public WebElement getSearchBar() {
		   return searchBar;
		}
	    @FindBy(id="nav-search-submit-button")
		 private WebElement searchClick;
				
	    public WebElement getLaptop() { 
	       return laptop;
	    }
	    public WebElement getSearchClick() {
	       return searchClick;
	    }
	    @FindBy(xpath="(//span[contains(text(),\"Dell G15 5520 Gaming Laptop, Intel i5-12500H,16GB \")])[1]")
	    private WebElement laptop;
}
