package elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import elements.base.BaseElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$x;

public class Menu extends BaseElement {
    ElementsCollection items;

    public Menu(By by) {
        super(by);
        items = $$x("//div[contains(@class,'show')]//ul//li");
    }

    public void openFrame(String frameName) {
        for (SelenideElement item : items) {
            if (item.text().equals(frameName)) item.click();
        }
    }
}
