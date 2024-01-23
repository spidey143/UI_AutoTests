package service;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.impl.DurationFormat;
import org.aeonbits.owner.ConfigFactory;
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
    private static WebDriver driver;

    @BeforeMethod
    public void setUp(){
        List<String> arguments = new ArrayList<>(
                Arrays.asList
                        ("start-maximized", "disable-extensions",
                        "disable-infobars", "disable-plugins",
                         "disable-translate", "no-sandbox"
                        )
        );
        ChromeOptions options = new ChromeOptions();
        options.addArguments(arguments);
        driver = new ChromeDriver(options);
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        driver.get(CONFIG.getBaseUrl());
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
