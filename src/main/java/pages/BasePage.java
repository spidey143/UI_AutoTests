package pages;
import com.codeborne.selenide.WebDriverRunner;
import elements.Menu;
import org.openqa.selenium.By;
import pages.elementsPage.ElementsPage;

import static com.codeborne.selenide.Selenide.$x;

public class BasePage {
    public Menu menu = new Menu(By.xpath("//div[@class='accordion'"));
    public MainPage mainPage = new MainPage();
    public ElementsPage elementsPage = new ElementsPage();

    public String getTitle() {
        return WebDriverRunner.getWebDriver().getTitle();
    }

    public String getCurrentUrl() {
        return WebDriverRunner.getWebDriver().getCurrentUrl();
    }
}
