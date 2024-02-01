package steps;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import elements.Link;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.apache.hc.core5.http.HttpStatus;
import org.testng.Assert;
import pages.BasePage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LinksFrameSteps extends BasePage {


    @Step
    public void switchToNewTab(String url) {
        String homeTab = WebDriverRunner.getWebDriver().getWindowHandle();
        for (String tab : WebDriverRunner.getWebDriver().getWindowHandles()) {
            if(!tab.equals(homeTab)){
                WebDriverRunner
                        .getWebDriver()
                        .switchTo()
                        .window(tab);
                Assert.assertEquals(getCurrentUrl(), url);
                WebDriverRunner.getWebDriver().close();
            }
        }
        WebDriverRunner.getWebDriver().switchTo().window(homeTab);
    }

    @Step("Кликнуть на простую ссылку")
    @Description("Кликнуть на простую ссылку и проверить что был осуществлен переход на новую вкладку")
    public void clickSimpleLink(){
        elementsPage.linksFrame.simpleLink.click();
        Selenide.sleep(400);
        switchToNewTab("https://demoqa.com/");
    }
    @Step("Кликнуть на динамическую ссылку")
    @Description("Кликнуть на динамическую ссылку, проверить что был осуществелн переход на новую вкладку " +
            "и проверить что у нее изменилость название")
    public void clickDynamicLink(){
        elementsPage.linksFrame.dynamicLink.click();
        String oldDynamicLinkName = elementsPage.linksFrame.dynamicLink.getText();

        Selenide.sleep(400);
        switchToNewTab("https://demoqa.com/");

        Selenide.refresh();
        String newDynamicLinkName = elementsPage.linksFrame.dynamicLink.getText();
        Assert.assertNotEquals(newDynamicLinkName,oldDynamicLinkName);
    }

    @Step("Кликнуть на ссылку которая отправляет вызов Api")
    @Description("Кликнуть на ссылку которая отправляет вызов Api и проверить что результирующий текс корректен")
    public void clickApiLink(Link link, Integer expectedStatusCode){
        link.click();
        Selenide.sleep(100);
        String linkText = link.getText();
        if(expectedStatusCode.equals(301)) linkText += " Permanently";
        Assert.assertEquals(
                elementsPage.linksFrame.linkResponse.getText(),
                "Link has responded with staus " + expectedStatusCode + " and status text " + linkText
        );
    }

    @Step("Кликнуть на все ссылки с Api")
    public void clickAllApiLink(){
        clickApiLink(elementsPage.linksFrame.createdLink, HttpStatus.SC_CREATED);
        clickApiLink(elementsPage.linksFrame.noContentLink, HttpStatus.SC_NO_CONTENT);
        clickApiLink(elementsPage.linksFrame.movedLink, HttpStatus.SC_MOVED_PERMANENTLY);
        clickApiLink(elementsPage.linksFrame.badRequestLink, HttpStatus.SC_BAD_REQUEST);
        clickApiLink(elementsPage.linksFrame.unautorizedLink, HttpStatus.SC_UNAUTHORIZED);
        clickApiLink(elementsPage.linksFrame.forbiddenLink, HttpStatus.SC_FORBIDDEN);
        clickApiLink(elementsPage.linksFrame.notFoundLink, HttpStatus.SC_NOT_FOUND);
    }
}
