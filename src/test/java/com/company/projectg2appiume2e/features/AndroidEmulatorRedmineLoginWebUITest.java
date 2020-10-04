package com.company.projectg2appiume2e.features;

import com.company.projectg2appiume2e.base.BaseTest;
import com.company.projectg2appiume2e.pages.RedmineHomePage;
import com.company.projectg2appiume2e.pages.RedmineLoginPage;
import com.company.projectg2appiume2e.util.Urls;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidEmulatorRedmineLoginWebUITest extends BaseTest {

    private static RedmineLoginPage redmineLoginPage;


    @Test
    public void testLoginRedmineEmulatorNexus5Android7() {

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

        driver.get(Urls.REDMINE_LOGIN);

        redmineLoginPage = new RedmineLoginPage(driver);
        RedmineHomePage redmineHomePage = redmineLoginPage.login("user", "bitnami1");

        redmineHomePage.clickOnMobileMenu();

        Assert.assertEquals("Usuario incorrecto", "user",redmineHomePage.getUserLoggedMobileEmulation());
    }


}
