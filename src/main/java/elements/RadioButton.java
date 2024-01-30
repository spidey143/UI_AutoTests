package elements;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import elements.base.BaseElement;

import static com.codeborne.selenide.Selenide.$x;

public class RadioButton extends BaseElement {

    public RadioButton(String radioButtonId) {
        this($x("//input[@type='radio' and @id='" + radioButtonId + "']"), radioButtonId);
    }

    public RadioButton(SelenideElement element, String radioButtonId) {
        super(element.as("Радио кнопка: " + radioButtonId));
    }

    public void buttonClick(){
        element.click(ClickOptions.usingDefaultMethod());
    }
}
