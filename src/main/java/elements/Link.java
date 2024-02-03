package elements;

import com.codeborne.selenide.Condition;
import elements.base.BaseElement;
import org.openqa.selenium.By;

public class Link extends BaseElement {
    public Link(By by, Integer statusCode) {
        super(by, "Ссылка на статус код " + statusCode);
    }

    public Link(By by, String name) {
        super(by, name + " cсылка");
    }

    public void click(){
        element.shouldBe(Condition.visible).click();
    }
    public String getLinkHref(){
        return element.getAttribute("href");
    }
}
