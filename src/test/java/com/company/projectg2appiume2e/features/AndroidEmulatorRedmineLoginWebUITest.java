package com.company.projectg2appiume2e.features;

import com.company.projectg2appiume2e.base.BaseTest;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidEmulatorRedmineLoginWebUITest  extends BaseTest {


    @Test
    public void testLoginRedmineEmulatorNexus5Android7(){

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "7.0");
        cap.setCapability("deviceName", "Nexus5Android7");
        cap.setCapability("browserName", "Chrome");
        cap.setCapability("chromedriverExecutableDir", "/Users/jhumbertoh/webinar/projectg2-appium-e2e/resources/drivers/chrome/mac");

        cap.setCapability("avd", "Nexus5Android7");
        cap.setCapability("avdArgs", "-port 5557");

        configAppiumDriver(cap);



    }


}
