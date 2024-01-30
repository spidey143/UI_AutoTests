package elements;

import com.codeborne.selenide.SelenideElement;
import elements.base.BaseElement;

import static com.codeborne.selenide.Selenide.$x;

public class Card extends BaseElement {
    public Card(SelenideElement element, String cardName) {
        super(element.as("Карточка страницы: " + cardName));
    }
    public Card(String cardName) {
        this($x("//h5[text()='" + cardName + "']//ancestor::div[@class='card mt-4 top-card']")
                , cardName);
    }

    public void cardClick(){
        element.click();
    }
}
