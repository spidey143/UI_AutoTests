package elements;

import com.codeborne.selenide.SelenideElement;
import elements.base.BaseElement;

import static com.codeborne.selenide.Selenide.$x;

public class ToggleButton extends BaseElement {
    public ToggleButton(SelenideElement element, String folderName) {
        super(element.as("Кнопка Переключения папки: " + folderName));
    }

    public ToggleButton(String folderName) {
        this($x("//label[contains(@for,'" + folderName + "')]//ancestor::span/button[@title='Toggle']"), folderName);
    }

    public void buttonClick() {
        element.click();
    }
}
