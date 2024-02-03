package steps;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.elementsPage.frames.WebTableFrame;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class WebTablesFrameSteps extends BasePage {


    @Step("Заполнить форму регистрации")
    public void fillRegForm(String firstName,
                            String lastName, String email,
                            String age, String salary,
                            String department) {
        elementsPage.webTableFrame.firstName.setValue(firstName);
        elementsPage.webTableFrame.lastName.setValue(lastName);
        elementsPage.webTableFrame.email.setValue(email);
        elementsPage.webTableFrame.age.setValue(age);
        elementsPage.webTableFrame.salary.setValue(salary);
        elementsPage.webTableFrame.department.setValue(department);
        elementsPage.webTableFrame.submitButton.buttonClick();
    }

    @Step("Добавить запись в таблицу")
    public void addUserToTable() {
        elementsPage.webTableFrame.addNewRecordButton.buttonClick();
        fillRegForm(
                "abc","abc",
                "example@mail.com","23",
                "20000", "newDep");
    }

    @Step("Изменить запись в таблице")
    public void editUserToTable(String rowName) {
        elementsPage.webTableFrame.userTable.editRow(rowName);
        fillRegForm("abc123","abc123",
                "example123@mail.com","23",
                "22000", "newDep123");
    }

    @Step("Удалить запись из таблицы")
    public void deleteUserToTable(String rowName) {
        elementsPage.webTableFrame.userTable.deleteRow(rowName);
    }
}
