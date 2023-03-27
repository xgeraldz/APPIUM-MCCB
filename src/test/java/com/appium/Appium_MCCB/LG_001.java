package com.appium.Appium_MCCB;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LG_001 {






  private AndroidDriver driver;

  @Before
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("appium:deviceName", "Android Emulator");
    desiredCapabilities.setCapability("appium:app", "C:\\\\Users\\\\xgE\\\\Downloads\\\\mccb_new1.apk");
    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
  }

  @Test
  public void sampleTest() throws InterruptedException {
	// Click the LOGIN button
By buttonLocator = By.xpath("//android.widget.Button[contains(@text, 'LOGIN')]");
WebElement buttonElement = driver.findElement(buttonLocator);
buttonElement.click();

// Wait for the other page to load
Thread.sleep(5000);

// Validate the presence of the image on the other page
By imageLocator = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageView");
WebElement imageElement = driver.findElement(imageLocator);

if (imageElement.isDisplayed()) {
    System.out.println("QA Passed! Button is clickable after proceeding to next page");
} else {
    System.out.println("QA Failed!");
}

	 




	    }

  public void myMethod() {
  }



	    
	    
	  }

	        
	    
	    
	    

	        
	    
  


 

    

