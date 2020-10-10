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


        configCapabilitiesNexus5Android7();

        androidCalculatorPage = new AndroidCalculatorPage(driver);
        androidCalculatorPage.calculate("120", "12", "PLUS");

        Assert.assertEquals("La suma es incorrecta","132",androidCalculatorPage.getResult());

    }

    @Test
    public void testCalculatorCalculateSubtractionTwoNumbersNexus5Android7(){


        configCapabilitiesNexus5Android7();

        androidCalculatorPage = new AndroidCalculatorPage(driver);
        androidCalculatorPage.calculate("1570", "750", "SUBTRACTION");

        Assert.assertEquals("La resta es incorrecta","820",androidCalculatorPage.getResult());

    }

    @Test
    public void testCalculatorCalculateMultiplicationTwoNumbersNexus5Android7(){


        configCapabilitiesNexus5Android7();

        androidCalculatorPage = new AndroidCalculatorPage(driver);
        androidCalculatorPage.calculate("2500", "5", "MULTIPLICATION");

        Assert.assertEquals("La multiplicación es incorrecta","12500",androidCalculatorPage.getResult());

    }

    @Test
    public void testCalculatorCalculateDivisionTwoNumbersNexus5Android7(){


        configCapabilitiesNexus5Android7();

        androidCalculatorPage = new AndroidCalculatorPage(driver);
        androidCalculatorPage.calculate("120000", "16", "DIVISION");

        Assert.assertEquals("La división es incorrecta","7500",androidCalculatorPage.getResult());

    }


    private void configCapabilitiesNexus5Android7(){

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "7.0");
        cap.setCapability("deviceName", "Nexus5Android7");



        cap.setCapability("avd", "Nexus5Android7");
        cap.setCapability("avdArgs", "-port 5557");


        cap.setCapability("appPackage","com.android.calculator2");
        cap.setCapability("appActivity","com.android.calculator2.Calculator");
        cap.setCapability("appWaitActivity","com.android.calculator2.Calculator");

        configAppiumDriver(cap);
    }

}
