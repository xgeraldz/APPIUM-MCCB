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

public class LG_002 {

  private AndroidDriver driver;
//  adb uninstall io.appium.uiautomator2.server
// adb uninstall io.appium.uiautomator2.server.test
// adb uninstall io.appium.unlock
// adb uninstall io.appium.settings



  @Before
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("appium:deviceName", "Pixel_4_API_30_3");
	desiredCapabilities.setCapability("noReset", true);
    desiredCapabilities.setCapability("appium:app", "C:\\\\Users\\\\xgE\\\\Downloads\\\\mccb_new1 - Copy.apk");
    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
    desiredCapabilities.setCapability("appium:newCommandTimeout", 1000);
    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
  }

  @Test
  public void sampleTest() throws InterruptedException {
	Thread.sleep(5000);
	
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
Thread.sleep(7000);
// tap transfer
By taptransfer = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView[1]");
	  WebElement tansfertap = driver.findElement(taptransfer);
	  tansfertap.click();
	  Thread.sleep(3000);
// tap select account
	  By selectaccounttap = By.xpath("//android.widget.TextView[contains(@text, 'Select account')]");
	  WebElement dropdownelement = driver.findElement(selectaccounttap);
	  dropdownelement.click();

	  
// tap specific account
By selectspecific = By.xpath("//android.widget.TextView[contains(@text, 'Savings Account | 00000210000173')]");
WebElement specificelement = driver.findElement(selectspecific);
specificelement.click();

//Select recipient

By Selectrecipient = By.xpath("//android.widget.TextView[contains(@text, 'Select recipient')]");
WebElement elementSelectrecipient = driver.findElement(Selectrecipient);
elementSelectrecipient.click();

//Selectmyaccount
Thread.sleep(2000);
By Selectmyaccount = By.xpath("//android.widget.TextView[contains(@text, 'My Accounts')]");
WebElement elementSelectmyaccount = driver.findElement(Selectmyaccount);
elementSelectmyaccount.click();


//selectdropdown transfer

By selectdropdown = By.xpath("//android.widget.TextView[contains(@text, 'Select')]");
WebElement elementselectdropdown = driver.findElement(selectdropdown);
elementselectdropdown.click();
Thread.sleep(1000);
//select specific other account
By selectotheracc = By.xpath("//android.widget.TextView[contains(@text, 'Savings Account | 00000210000286')]");
WebElement eselectotheracc = driver.findElement(selectotheracc);
eselectotheracc.click();
Thread.sleep(1000);
//selectamount
By selectamount = By.xpath("//android.widget.EditText[contains(@text, '0.00')]");
WebElement eselectamount = driver.findElement(selectamount);
eselectamount.click();

//inputamount

Thread.sleep(1000);
((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_1));
((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_2));
((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_3));
driver.hideKeyboard();
Thread.sleep(2000);
// tapsubmit
By tapsubmit = By.xpath("//android.widget.Button[contains(@text, 'SUBMIT')]");
WebElement etapsubmit = driver.findElement(tapsubmit);
etapsubmit.click();

Thread.sleep(2000);
// tapconfirm
By tapconfirm = By.xpath("//android.widget.Button[contains(@text, 'CONFIRM')]");
WebElement etapconfirm = driver.findElement(tapconfirm);
etapconfirm.click();

Thread.sleep(2000);

// otp FT

By otplocator1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup");
WebElement otpelementt = driver.findElement(otplocator1);
otpelementt.click();
((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_1));
((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_2));
((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_3));
((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_4));
((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_5));
((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_6));
Thread.sleep(2000);
// Validate the presence of the image on the other page
By imageLocator = By.xpath("//android.widget.TextView[contains(@text, 'Thank you for using MCCB Online!')]");
WebElement imageElement = driver.findElement(imageLocator);

if (imageElement.isDisplayed()) {
    System.out.println("QA Passed!Fund Transfer success!");
} else {
    System.out.println("QA Failed!");
}








// enddddd

	    }



	    
	    
	  }

	        
	    
	    
	    

	        
	    
  


 
