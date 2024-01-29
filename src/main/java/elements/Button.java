package elements;

import com.codeborne.selenide.SelenideElement;
import elements.base.BaseElement;

import static com.codeborne.selenide.Selenide.$x;

public class Button extends BaseElement {

    public Button(SelenideElement element, String buttonName ) {
        super(element.as("Кнопка: " + buttonName));
    }
    public Button(String buttonName) {
        this($x("//button[text()='" + buttonName + "']"), buttonName);
    }

    public void buttonClick(){
        element.click();
    }
}
