package elements;

import com.codeborne.selenide.SelenideElement;
import elements.base.BaseElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;

public class TextArea extends BaseElement {
    public TextArea(By by, String textAreaName) {
        super(by, textAreaName);
    }

    public void setValue(String value) {
        element.setValue(value);
    }
}
