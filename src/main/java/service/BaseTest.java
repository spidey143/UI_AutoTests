package service;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.impl.DurationFormat;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.Steps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class BaseTest implements Steps{
    private static final TestConfig CONFIG = ConfigFactory.create(TestConfig.class);

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.baseUrl = CONFIG.getBaseUrl();
        Configuration.pageLoadStrategy = String.valueOf(PageLoadStrategy.NONE);
        Configuration.browserSize = "1920x1080";
    }

    @AfterMethod
    public void tearDown(){
        Selenide.webdriver().driver().close();
    }
}
