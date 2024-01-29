package elements.base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public abstract class BaseElement {
    protected SelenideElement element;

    public BaseElement(SelenideElement element) {
        this.element = element;
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
}
