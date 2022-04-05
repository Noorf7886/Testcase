package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage
{
	@FindBy(id="cartArea")
	private WebElement cartarea;
	
	@FindBy(id="Selenium Training")
	private WebElement seleniumtraining;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCartarea() {
		return cartarea;
	}

	public void setCartarea(WebElement cartarea) {
		this.cartarea = cartarea;
	}

	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}

	public void setSeleniumtraining(WebElement seleniumtraining) {
		this.seleniumtraining = seleniumtraining;
	}
	
	public void Facebook()
	{
		facebook.click();
	}

	public WebElement getFacebook() {
		return facebook;
	}

	public void setFacebook(WebElement facebook) {
		this.facebook = facebook;
	}
	

}
