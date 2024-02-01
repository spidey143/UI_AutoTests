package elements;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.SelenideElement;
import elements.base.BaseElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;

public class Input extends BaseElement {


    public Input(By by, String name) {
        super(by, name);
    }

    public void setValue(String value){
        element.setValue(value);
    }
}
