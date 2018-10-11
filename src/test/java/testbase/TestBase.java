package testbase;

import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import java.io.IOException;
import org.apache.commons.logging.impl.Log4JLogger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import screens.ios.UICatalogScreen;
import utility.CommonUtils;
import utility.ExcelReader;


public class TestBase {
	public static AppiumDriver driver;
	public static UICatalogScreen ucs;
	public static String loadPropertyFile = "IOSTestApp.properties";
	
	
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"/src/test/resources/properties/testdata.xlsx");
	public static Logger log = Logger.getLogger("devpinoyLogger");
	
	@BeforeSuite
	public void setUp() throws IOException, InterruptedException{
		
		if(driver==null){
			
			log.debug("Appium server started");	
	
		if(loadPropertyFile.startsWith("IOS")){
			
			log.debug("Starting on IOS");
			CommonUtils.loadIOSConfigProp(loadPropertyFile);
			log.debug("Loading iOS property file");
			CommonUtils.setIOSCapabilities();			
			driver = CommonUtils.getIOSDriver();
		
		}else if(loadPropertyFile.startsWith("Android")){			
			log.debug("Starting on Android");
			CommonUtils.loadAndroidConfigProp(loadPropertyFile);
			log.debug("Loading Android property file");
			CommonUtils.setAndroidCapabilities();
			driver = CommonUtils.getAndroidDriver();
		}	
		
		}
		
	}
	
	@AfterSuite
	public void tearDown() throws IOException{		
		driver.quit();	
		log.debug("Driver is quiting ");
	}

}

