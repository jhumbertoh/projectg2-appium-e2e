package com.company.projectg2appiume2e.features;

import com.company.projectg2appiume2e.base.BaseTest;
import com.company.projectg2appiume2e.pages.AndroidCalculatorPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidEmulatorNativeUITest extends BaseTest {

    private AndroidCalculatorPage androidCalculatorPage;

    @Test
    public void testCalculatorCalculatePlusTwoNumbersNexus5Android7(){

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "7.0");
        cap.setCapability("deviceName", "Nexus5Android7");



        cap.setCapability("avd", "Nexus5Android7");
        cap.setCapability("avdArgs", "-port 5557");

       /* "appPackage": "com.android.calculator2",
                "appActivity": "com.android.calculator2.Calculator",
                "appWaitActivity": "com.android.calculator2.Calculator",*/

        cap.setCapability("appPackage","com.android.calculator2");
        cap.setCapability("appActivity","com.android.calculator2.Calculator");
        cap.setCapability("appWaitActivity","com.android.calculator2.Calculator");

        configAppiumDriver(cap);

        androidCalculatorPage = new AndroidCalculatorPage(driver);
        androidCalculatorPage.calculate("120", "12", "PLUS");

        //Assert
        Assert.assertEquals("La suma es incorrecta","131",androidCalculatorPage.getResult());

    }
}
