package elements;

import com.codeborne.selenide.SelenideElement;
import elements.base.BaseElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckBox extends BaseElement {

    public CheckBox(By by, String checkBoxName) {
        super(by, checkBoxName);
    }
}
