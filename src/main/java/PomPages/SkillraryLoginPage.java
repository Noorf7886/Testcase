package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage 
{
 
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearbtn;
	@FindBy(xpath="(//a[@class='ignorelink'])[16]")
	private WebElement skillrarydemoapp;
	
	@FindBy(name="q")
	private WebElement searchtb;
	@FindBy(xpath="//input[@value='go']")
	private WebElement gobtn;
	
	public SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void gearButton()
	{
		gearbtn.click();
	}
	
	public void skillraryDemoapp()
	{
		skillrarydemoapp.click();
	}
	 
	public void searchbox(String Name)
	{
		searchtb.sendKeys(Name);
	}
	public void gobtn()
	{
		gobtn.click();
	}
}
