package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhishlistPage 
{
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement play;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pause;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement wishlist;
	
	@FindBy(xpath="//div[@class='fullscreen-icon']")
	private WebElement fullscreen;
	
	@FindBy(xpath="//div[@class='unfullscreen-icon']")
	private WebElement unfullscreen;
	
	public WhishlistPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	

	public void playbutton()
	{
		play.click();
	}
	public void pausebutton()
	{
		pause.click();
		
	}
	public void wishlist()
	{
		wishlist.click();
	}

	public void fullscreen()
	{
		fullscreen.click();
	}
	
	public void unfullscreen()
	
	{
		unfullscreen.click();
	}
}

