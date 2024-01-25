package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import service.BaseTest;

import static com.codeborne.selenide.Selenide.*;

public class MainPage extends BaseTest {
    public MainPage() {
        open("https://demoqa.com/");
    }

    public ElementsPage goToElements() {
         $x("//div[@class='category-cards']/div[1]").click();
         return new ElementsPage();
    }
}