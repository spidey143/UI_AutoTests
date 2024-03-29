package service;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.PageLoadStrategy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.BasePage;
import pages.elementsPage.ElementsPage;
import steps.Steps;
import utils.Generator;

import static com.codeborne.selenide.FileDownloadMode.PROXY;
import static com.codeborne.selenide.Selenide.open;

public abstract class BaseTest extends BasePage implements Steps {
    private static final TestConfig CONFIG = ConfigFactory.create(TestConfig.class);

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.baseUrl = CONFIG.getBaseUrl();
        Configuration.pageLoadStrategy = String.valueOf(PageLoadStrategy.NONE);
        Configuration.timeout = 8000;
        Configuration.webdriverLogsEnabled = true;
        Configuration.fastSetValue = false;
        Configuration.headless = false;
        Configuration.proxyEnabled = true;
        Configuration.fileDownload = PROXY;
        Configuration.downloadsFolder = "src/tmp";
    }

    @BeforeMethod
    public void init(){
        open("https://demoqa.com/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterClass
    public void tearDown(){
        Selenide.webdriver().driver().close();
    }
}
