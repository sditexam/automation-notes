package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class HomePage extends BasePage{

	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(xpath="//*[@id=\"cw-top-navbar\"]/li[1]/div[1]/span[1]")
	public WebElement newCars;
	
	@FindBy(xpath="//*[@id=\"cw-top-navbar\"]/li[1]/div[2]/div/div[1]/div[1]/ul/li[1]/a")
	public WebElement findNewCars;
	
	
	public NewCarsPage findNewCar() {
		
		new Actions(driver).moveToElement(newCars).perform();
		findNewCars.click();
		return new NewCarsPage(driver);
	}
	

}
