package screens.ios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import testbase.ScreenBase;

public class UICatalogScreen extends ScreenBase{

	public UICatalogScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Business logic 
	
public void handleSwitches(){
		
		driver.scrollTo("Switches").click();
	    
	    WebElement switches = (WebElement) driver.findElements(By.className("UIASwitch")).get(0);
	    
	    System.out.println(switches.getAttribute("value"));
	    
	    //Turn on the Switch
	    if(switches.getAttribute("value").equals("1")){
	    	
	    	switches.click();
	    	
	    }
	    
	    System.out.println(switches.getAttribute("value"));

	    //Turn off
	    if(switches.getAttribute("value").equals("0")){
	    	
	    	switches.click();
	    	
	    }
	    
	    System.out.println(switches.getAttribute("value"));
	    
	    driver.findElement(By.name("UICatalog")).click();
	    
	}
	
	
	public void handleSteppers(){		
		
		driver.scrollTo("Steppers").click();
	    
	    List<MobileElement> text = driver.findElements(By.className("UIAStaticText"));
	   
	    
	    for(WebElement staticText : text){
	    	
	    	System.out.println(staticText.getAttribute("name"));
	    	
	    }
	    
	    System.out.println(driver.findElements(By.className("UIAButton")).size());
	    
	    //increment
	    while(!((WebElement) driver.findElements(By.className("UIAStaticText")).get(1)).getAttribute("name").equals("10")){
	    	
	    	((WebElement) driver.findElements(By.name("Increment")).get(0)).click();
	    	
	    	
	    }
	    
	    //decrement
	    
    while(!((WebElement) driver.findElements(By.className("UIAStaticText")).get(1)).getAttribute("name").equals("0")){
	    	
	    	((WebElement) driver.findElements(By.name("Decrement")).get(0)).click();
	    	
	    	
	    }
		
    driver.findElement(By.name("UICatalog")).click();
	}
	
	
	public void handleSliders(){
		driver.scrollTo("Sliders").click();		    
	    System.out.println(driver.findElements(By.className("UIASlider")).size());  
	    
	    WebElement slider = (WebElement) driver.findElements(By.className("UIASlider")).get(0);
	    
	    slider.sendKeys("0.8");
	    
	   System.out.println(slider.getAttribute("value"));
	    
	    slider = (WebElement) driver.findElements(By.className("UIASlider")).get(1);
	    
	    slider.sendKeys("0.2");
	    System.out.println(slider.getAttribute("value"));
	    
	    slider = (WebElement) driver.findElements(By.className("UIASlider")).get(2);
	    
	    slider.sendKeys("0.5");
	    System.out.println(slider.getAttribute("value"));
		
	    driver.findElement(By.name("UICatalog")).click();
		
	}
	//Control +shift +o
	
}