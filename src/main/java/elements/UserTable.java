package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import elements.base.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$$x;

public class UserTable extends BaseElement {

    public ElementsCollection rows;
    public ElementsCollection headers;

    public UserTable(By by) {
        super(by, "Таблица юзеров");
        headers = $$x("//div[contains(@class, 'header-content')]");
        rows = $$(".rt-tr-group");
    }

    public void deleteRow(String rowName){
        rows.findBy(Condition.text(rowName)).shouldBe(Condition.visible)
                .findElement(By.cssSelector(".action-buttons :nth-child(2)")).click();
        rows.find(Condition.text(rowName)).shouldNotBe();
    }

    public void editRow(String rowName){
        rows.find(Condition.text(rowName)).shouldBe(Condition.visible)
                .findElement(By.cssSelector(".action-buttons :nth-child(1)")).click();
    }

    public void findRow(String rowName){
        rows.find(Condition.text(rowName)).shouldBe();
    }
}
