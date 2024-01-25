package steps;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.impl.CollectionElement;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.OutputClickSubmitModel;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import pages.TextBoxPage;
import utils.Generator;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextBoxPageSteps {
    public void fillTextBoxForm(TextBoxPage textBoxPage){
        textBoxPage.sendValueToInputFullName(Generator.generateRandomString(5));
        textBoxPage.sendValueToInputEmail(Generator.generateRandomEmail(8));
        textBoxPage.sendValueToInputCurrAddress(Generator.generateRandomString(5));
        textBoxPage.sendValueToInputPermAddress(Generator.generateRandomString(5));
    }
    public void submitButtonClick(TextBoxPage textBoxPage){
        textBoxPage.submitButtonClick();
    }

    public void checkOutputDataIsCorrect(){
        String html = WebDriverRunner.getWebDriver().getPageSource();
        Document doc = Jsoup.parse(html).normalise();
        List<String> list = doc.selectXpath("//div[@id='output']//p").eachText();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Map<String,String> map = new HashMap<>();
        for (String s: list){
            String[] strings = s.split(":");
            map.put(strings[0].replace(" ", ""), strings[1]);
        }
        System.out.println(gson.toJson(map));
        OutputClickSubmitModel outputClickSubmitModel = gson.fromJson(gson.toJson(map), OutputClickSubmitModel.class);
        System.out.println(outputClickSubmitModel.getEmail() + " "+ outputClickSubmitModel.getName());
    }
}
