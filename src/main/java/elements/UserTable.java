package elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import elements.base.BaseElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$x;

public class UserTable extends BaseElement {
    private SelenideElement firstName;
    private SelenideElement lastName;
    private SelenideElement email;
    private SelenideElement salary;
    private SelenideElement department;
    private SelenideElement action;

    public ElementsCollection rows;

    //div[contains(@class, 'rt-tr')]
    //div[@class='rt-tbody']//div[@role='row']

    public UserTable(By by) {
        super(by, "Таблица юзеров");
        ElementsCollection headers = $$x("//div[contains(@class, 'header-content')]");
        rows = $$x("//div[@class='rt-tbody']//div[@role='row']");
        firstName = headers.get(0).as("firstName");
        lastName = headers.get(1).as("lastName");
        email = headers.get(2).as("email");
        salary = headers.get(3).as("salary");
        department = headers.get(4).as("department");
        action = headers.get(5).as("action");

    }

    public void addRow() {
    }

    public void deleteRow() {
    }

    public void editRow() {
    }

}
