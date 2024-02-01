package elements;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.SelenideElement;
import elements.base.BaseElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;

public class ToggleButton extends BaseElement {
    public ToggleButton(By by, String folderName) {
        super(by,"Кнопка переключения папки: " + folderName);
    }
    public ToggleButton(String folderName) {
        this(By.xpath("//label[contains(@for,'" + folderName + "')]//ancestor::span/button[@title='Toggle']"), folderName);
    }
    public void buttonClick() {
        element.click(ClickOptions.usingDefaultMethod());
    }
}
