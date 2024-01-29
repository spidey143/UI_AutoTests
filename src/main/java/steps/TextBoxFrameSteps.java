package steps;

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
}
