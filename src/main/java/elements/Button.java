package elements;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import elements.base.BaseElement;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.*;

public class Button extends BaseElement {

    public Button(By by, String name) {
        super(by, name);
    }

    public void buttonClick(){
        element.click();
    }

    public void doubleClick(){
        element.doubleClick(ClickOptions.usingDefaultMethod());
    }

    public void rightClick(){
        actions().contextClick(element).perform();
    }

    public File downloadFile() throws FileNotFoundException {
        return element.download();
    }
}
