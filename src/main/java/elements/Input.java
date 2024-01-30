package elements;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.SelenideElement;
import elements.base.BaseElement;

import static com.codeborne.selenide.Selenide.$x;

public class Input extends BaseElement {

    public Input(SelenideElement element, String inputName) {
        super(element.as("Текстовое полено: " + inputName));
    }
    public Input(String inputId) {
        this($x("//input[@id='" + inputId +"']"), inputId);
    }

    public void setValue(String value){
        element.setValue(value);
    }
}
