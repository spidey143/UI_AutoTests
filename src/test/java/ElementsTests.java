import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import service.BaseTest;
import utils.Generator;

public class ElementsTests extends BaseTest {
    @Test
    public void textBoxFormFillingTest() throws InterruptedException {
        MainPage mainPage = new MainPage();

        ElementsPage elementsPage = mainPage.goToElements();
        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(),"https://demoqa.com/elements");

        TextBoxPage textBoxPage = elementsPage.openTextBoxPage();
        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(),"https://demoqa.com/text-box");

        textBoxPage.sendValueToInputFullName(Generator.generateRandomString(5));
        textBoxPage.sendValueToInputEmail(Generator.generateRandomEmail(8));
        textBoxPage.sendValueToInputCurrAddress(Generator.generateRandomString(5));
        textBoxPage.sendValueToInputPermAddress(Generator.generateRandomString(5));
        textBoxPage.submitButtonClick();
        StringBuilder sb = new StringBuilder();
        textBoxPage.getOutputData()
                .forEach(selenideElement -> sb.append(selenideElement.getText()).append("\n"));
        System.out.println(sb);
        Thread.sleep(5000);
    }
}
