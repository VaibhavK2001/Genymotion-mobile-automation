package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class Clock {

    AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("VERSION", "13");
        capabilities.setCapability("deviceName","192.168.56.102:5555");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appPackage", " com.android.deskclock");
        capabilities.setCapability("appActivity","com.android.deskclock.DeskClock");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("Automation Started.......");
    }



}
