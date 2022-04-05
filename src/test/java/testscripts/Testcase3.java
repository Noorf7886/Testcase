package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import PomPages.SeleniumPage;
import PomPages.SkillraryLoginPage;
import PomPages.WhishlistPage;
import genericLib.BaseClass;

public class Testcase3 extends BaseClass
{
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		SkillraryLoginPage s= new SkillraryLoginPage (driver);
		s.searchbox(pdata.getPropertyData("Name"));
		s.gobtn();
		
		SeleniumPage sp=new SeleniumPage (driver);
		sp.corejava();
		
		
		driverutitlities.switchToframe(driver);
		WhishlistPage wp= new WhishlistPage  (driver);
		
		wp.fullscreen();
		
		wp.playbutton();
		
		Thread.sleep(3000);
		
		wp.pausebutton();
		
		wp.unfullscreen();
		
		driverutitlities.switchbackframe(driver);
		wp.wishlist();
		
		
		
	}

}
