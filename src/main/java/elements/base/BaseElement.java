package elements.base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

import static com.codeborne.selenide.Selenide.$;

public abstract class BaseElement {
    protected SelenideElement element;

    public BaseElement(By by) {
        this.element = $(by);
    }

    protected BaseElement(By by, String name) {
        this.element = $(by).as(name);
    }

    public boolean isVisibility() {
        return element.is(Condition.visible);
    }
    public String getText() {
        return element.text();
    }
    public String getValue() {
        return element.getValue();
    }
    public Boolean isEnabled(){
        return element.is(Condition.enabled);
    }

    public String getAttribute(String attribute) {
        return element.getAttribute(attribute);
    }

    public String getCssValue(String value) {
        return element.getCssValue(value);
    }
}
