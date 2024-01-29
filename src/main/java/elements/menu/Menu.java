package elements.menu;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import elements.base.BaseElement;

import static com.codeborne.selenide.Selenide.$$x;

public class Menu extends BaseElement {
    ElementsCollection items;

    public Menu(SelenideElement element) {
        super(element);
        items = $$x("//div[contains(@class,'show')]//ul//li");
    }

    public void openFrame(String frameName) {
        for (SelenideElement item : items) {
            if (item.text().equals(frameName)) item.click();
        }
    }
}
