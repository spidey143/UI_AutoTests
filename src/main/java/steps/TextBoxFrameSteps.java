package steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.BasePage;

public class TextBoxFrameSteps extends BasePage {

    @Step("Заполнение формы")
    public void fillForm(String name, String email, String currAddress, String permAddress) {
        elementsPage.textBoxFrame.fullName.setValue(name);
        elementsPage.textBoxFrame.email.setValue(email);
        elementsPage.textBoxFrame.currentAddress.setValue(currAddress);
        elementsPage.textBoxFrame.permanentAddress.setValue(permAddress);
    }

    @Step("Кликнуть на кнопку Submit")
    public void submitClick() {
        elementsPage.textBoxFrame.submitButton.buttonClick();
    }


    @Step("Проверить что выходные данные верны")
    public void checkOutputDataIsCorrect(String name, String email, String currAddress, String permAddress){
        elementsPage.textBoxFrame.outputName.shouldHave(Condition.text(name));
        elementsPage.textBoxFrame.outputEmail.shouldHave(Condition.text(email));
        elementsPage.textBoxFrame.outputCurrentAddress.shouldHave(Condition.text(currAddress));
        elementsPage.textBoxFrame.outputPermanentAddress.shouldHave(Condition.text(permAddress));
    }
}
