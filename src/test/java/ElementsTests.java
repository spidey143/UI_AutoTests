import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import service.BaseTest;
import utils.Generator;

import static com.codeborne.selenide.Selenide.open;


public class ElementsTests extends BaseTest {

    private String name,email,currAddress,permAddress;
    @BeforeMethod
    public void generateData(){
        name = Generator.generateRandomString(5);
        email = Generator.generateRandomEmail(8);
        currAddress = Generator.generateRandomString(5);
        permAddress = Generator.generateRandomString(5);
    }

    @Test(testName = "Тестирование Text Box")
    public void textBoxesTest() {
        open("https://demoqa.com/");
        mainPage.elementsCard.cardClick();
        menu.openFrame("Text Box");
        TEXT_BOX_FRAME_STEPS.fillForm(name,email,currAddress,permAddress);
        TEXT_BOX_FRAME_STEPS.submitClick();
    }
}
