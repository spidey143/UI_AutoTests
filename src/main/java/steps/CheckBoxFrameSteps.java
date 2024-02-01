package steps;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import pages.BasePage;

import java.util.List;

public class CheckBoxFrameSteps extends BasePage {

    public String getResultText(){
        StringBuilder sb = new StringBuilder();
        for (SelenideElement element : elementsPage.checkBoxFrame.result) {
            sb.append(element.getText()).append(" ");
        }
        return sb.toString();
    }

    public void openAllCheckBoxes() {
        elementsPage.checkBoxFrame.toggleButtonHome.buttonClick();
        elementsPage.checkBoxFrame.toggleButtonDesktop.buttonClick();
        elementsPage.checkBoxFrame.toggleButtonDocuments.buttonClick();
        elementsPage.checkBoxFrame.toggleButtonWorkspace.buttonClick();
        elementsPage.checkBoxFrame.toggleButtonOffice.buttonClick();
        elementsPage.checkBoxFrame.toggleButtonDownloads.buttonClick();
    }

    public void selectCheckBoxes(List<String> checkBoxes){
        for (SelenideElement element: elementsPage.checkBoxFrame.allCheckBoxes) {
            for (String s:checkBoxes) {
                if (element.getText().equals(s)){
                    element.click();
                    break;
                }
            }
        }
    }

    public String getSelectedCheckBoxText(){
        StringBuilder sb = new StringBuilder();
        for (SelenideElement element : elementsPage.checkBoxFrame.selectedCheckBoxes) {
            if(element.getText().contains("File")){
                sb.append(element.getText().substring(0,1).toLowerCase())
                        .append(element.getText().substring(1)
                                .replace(".doc","")
                                .replace(" ", "")).append(" ");
            }else{
                sb.append(element.getText().toLowerCase()).append(" ");}
        }
        return sb.toString();
    }

    public void checkResult(){
        Assert.assertEquals(getSelectedCheckBoxText(),getResultText());
    }
}
