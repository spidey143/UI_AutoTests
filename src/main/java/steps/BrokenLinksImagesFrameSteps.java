package steps;

import elements.Image;
import elements.Link;
import io.qameta.allure.Step;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import pages.BasePage;

public class BrokenLinksImagesFrameSteps extends BasePage {
    @Step("Проверить что ссылка валидна")
    public Boolean checkLinkIsValid(Link link){
        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(link.getLinkHref());
            HttpResponse response = client.execute(request);
            return response.getStatusLine().getStatusCode() == 200;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Step("Проверить что картинка валидна")
    public boolean checkImageIsValid(Image image) {
        return image.checkImgIsCorrect();
    }

    @Step("Проверить ссылки на валидность")
    public void checkLinksIsValid() {
        Assert.assertTrue(checkLinkIsValid(elementsPage.brokenLinksImagesFrame.validLink));
        Assert.assertFalse(checkLinkIsValid(elementsPage.brokenLinksImagesFrame.invvalidLink));
    }
    @Step("Проверить картинки на валидность")
    public void checkImagesIsValid() {
        Assert.assertTrue(checkImageIsValid(elementsPage.brokenLinksImagesFrame.validImage));
        Assert.assertFalse(checkImageIsValid(elementsPage.brokenLinksImagesFrame.invalidImage));
    }
}
