package pages.elementsPage.frames;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import elements.Link;
import elements.base.BaseElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LinksFrame {
    //Following links will open new tab
    public Link simpleLink = new Link(By.id("simpleLink"), "Простая ссылка");
    public Link dynamicLink = new Link(By.id("dynamicLink"), "Динамическая ссылка");

    //Following links will send an api call
    public Link createdLink = new Link(By.id("created"), 201);
    public Link noContentLink = new Link(By.id("no-content"), 204);
    public Link movedLink = new Link(By.id("moved"),  301);
    public Link badRequestLink = new Link(By.id("bad-request"), 400);
    public Link unautorizedLink = new Link(By.id("unauthorized"), 401);
    public Link forbiddenLink = new Link(By.id("forbidden"), 403);
    public Link notFoundLink = new Link(By.id("invalid-url"), 404);

    //Result text
    public SelenideElement linkResponse = $(By.id("linkResponse"));

}
