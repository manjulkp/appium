package testcases.ios;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screens.ios.UICatalogScreen;
import testbase.TestBase;


public class UICatalogTest extends TestBase {
	
	@BeforeTest
	public void init(){
		
		ucs = new UICatalogScreen(driver);
		
	}
	
	@Test(priority=1)
	public void SwitchTest() throws InterruptedException{
	
		ucs.handleSwitches();
		log.debug("Successfully executed SwitchTest");
		
	}
	
	@Test(priority=2)
	public void SliderTest() throws InterruptedException{	
		ucs.handleSliders();
		log.debug("Successfully executed SliderTest");
	}
	
	
	@Test(priority=3)
	public void SteppersTest() throws InterruptedException{	
		ucs.handleSteppers();
		log.debug("Successfully executed SteppersTest");
		
	}
	
	

}
