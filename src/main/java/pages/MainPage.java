package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import service.BaseTest;

import static com.codeborne.selenide.Selenide.*;

public class MainPage extends BaseTest {
    private final SelenideElement elementsPage = $x("//div[@class='category-cards']/div[1]");
    public MainPage() {
        open("https://demoqa.com/");
    }

    public ElementsPage openElementsPage() {
         elementsPage.click();
         return new ElementsPage();
    }
}