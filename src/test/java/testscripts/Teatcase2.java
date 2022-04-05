package testscripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import PomPages.SkillraryDemoLoginPage;
import PomPages.SkillraryLoginPage;
import PomPages.TestingPage;
import genericLib.BaseClass;

public class Teatcase2 extends BaseClass
{

	@Test
	public void tc2() throws IOException
	{
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.gearButton();
		s.skillraryDemoapp();
		
		SkillraryDemoLoginPage sd= new SkillraryDemoLoginPage(driver);
		driverutitlities.switchtabs(driver);
		driverutitlities.dropdown(sd.getDropdown(), pdata.getPropertyData("coursename"));
		
		TestingPage t= new TestingPage(driver);
		driverutitlities.dragdrop(driver, t.getSeleniumtraining(), t.getCartarea());
		 Point loc = t.getFacebook().getLocation();
		 int x=loc.getX();
		 int y=loc.getY();
		 driverutitlities.scrollBar(driver,x,y);
		 t.Facebook();
		 
		
	}
	
}
