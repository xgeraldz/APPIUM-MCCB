package com.appium.Appium_MCCB;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class LaunchApp {

  private AndroidDriver driver;

  @Before
  public void setUp() throws MalformedURLException {
	DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("appium:deviceName", "Android Emulator");
    desiredCapabilities.setCapability("appium:app", "C:\\\\Users\\\\xgE\\\\Downloads\\\\mccb-online.apk");
    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
  }

  @Test
  public void sampleTest() throws InterruptedException {
	  By buttonLocator = By.xpath("//android.widget.Button[contains(@text, 'LOGIN')]");
	  WebElement buttonElement = driver.findElement(buttonLocator);
	  buttonElement.click();

	  Thread.sleep(2000);

	 
	  By editTextLocator = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
	  WebElement element = driver.findElement(editTextLocator);
	  element.click(); //dev geraldqa email : gerald_navarro+022@hyperstacksinc.com
	  element.sendKeys("realmesmart");

	  driver.hideKeyboard();
	  
	  By passwordLocator = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText");
	  WebElement passwordElement = driver.findElement(passwordLocator);
	  passwordElement.click();
	  passwordElement.sendKeys("Password@123");
	  
	  driver.hideKeyboard();
	  // tap login
	  By loginButtonLocator = By.xpath("//android.widget.Button[contains(@text, 'LOGIN')]");
	  WebElement loginButtonElement = driver.findElement(loginButtonLocator);
	  loginButtonElement.click();
	  //tap modal register or no for new login if theres no modal can proceed to other page


	 // OTP press
	  By otplocator = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup");
WebElement otpelement = driver.findElement(otplocator);
otpelement.click();
((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_1));
((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_2));
((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_3));
((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_4));
((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_5));
((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_6));


By settingslocator = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.Button[2]");
WebElement esettings = driver.findElement(settingslocator);
esettings.click();












// enddddd

	    }



	    
	    
	  }

	        
	    
	    
	    

	        
	    
  


 
