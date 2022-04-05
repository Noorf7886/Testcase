package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPage 
{
@FindBy(xpath="//img[@title='Core Java for Selenium']")
private WebElement corejava;

public SeleniumPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void corejava()
{
	corejava.click();
}

}
