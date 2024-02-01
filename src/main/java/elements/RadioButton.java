package elements;

import com.codeborne.selenide.ClickOptions;
import elements.base.BaseElement;
import org.openqa.selenium.By;

public class RadioButton extends BaseElement {

    public RadioButton(By by, String radioName) {
        super(by,radioName);
    }

    public void buttonClick(){
        element.click(ClickOptions.usingDefaultMethod());
    }
}
