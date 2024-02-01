package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import elements.base.BaseElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;

public class Card extends BaseElement {
    public Card(By by, String cardName) {
        super(by, cardName);
    }
    public Card(String cardName) {
        this(By.xpath("//h5[text()='" + cardName + "']//ancestor::div[@class='card mt-4 top-card']")
                , cardName);
    }

    public void cardClick(){
        element.shouldBe(Condition.visible).click();
    }
}
