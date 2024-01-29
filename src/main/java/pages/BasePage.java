package pages;
import elements.menu.Menu;
import pages.elementsPage.ElementsPage;

import static com.codeborne.selenide.Selenide.$x;

public class BasePage {
    public Menu menu = new Menu($x("//div[@class='accordion'"));
    public MainPage mainPage = new MainPage();
    public ElementsPage elementsPage = new ElementsPage();
}
