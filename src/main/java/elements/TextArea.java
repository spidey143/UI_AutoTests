package elements;

import com.codeborne.selenide.SelenideElement;
import elements.base.BaseElement;

import static com.codeborne.selenide.Selenide.$x;

public class TextArea extends BaseElement {
    public TextArea(SelenideElement element, String textAreaName) {
        super(element.as("Текстовое полено(растягивающееся): " + textAreaName));
    }

    public TextArea(String textAreaId) {
        this($x("//textarea[@id='" + textAreaId + "']"), textAreaId);
    }

    public void setValue(String value) {
        element.setValue(value);
    }
}
