package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage 
{
@FindBy(id="course")
private WebElement coursetab;

@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
private WebElement seleniumtraining;

@FindBy(name="addresstype")
private WebElement dropdown;

public SkillraryDemoLoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getCoursetab() {
	return coursetab;
}

public WebElement getDropdown() {
	return dropdown;
}

public void setDropdown(WebElement dropdown) {
	this.dropdown = dropdown;
}

public void seleniumtrainingbtn()
{
	seleniumtraining.click();
}
}
