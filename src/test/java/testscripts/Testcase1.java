package testscripts;

import org.testng.annotations.Test;

import PomPages.AddtocartPage;
import PomPages.SkillraryDemoLoginPage;
import PomPages.SkillraryLoginPage;
import genericLib.BaseClass;

public class Testcase1 extends BaseClass
{

	@Test
	public void tc1()
	{
		SkillraryLoginPage s =new SkillraryLoginPage(driver);
		s.gearButton();
		s.skillraryDemoapp();
		
		SkillraryDemoLoginPage sd= new SkillraryDemoLoginPage(driver);
		driverutitlities.switchtabs(driver);
		driverutitlities.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtrainingbtn();
		
		AddtocartPage a=new AddtocartPage(driver);
		driverutitlities.doubleClick(driver, a.getPlusbtn());
		a.addtocart();
		driverutitlities.alertPopup(driver);
	}
}
