package com.ee.StepObject;

import com.codeborne.selenide.Condition;
import com.ee.PageObject.eeHomePage;
import io.qameta.allure.Step;
import org.testng.Assert;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class eeHomePageSteps extends eeHomePage {
    @Step("ენის ცვლილებისას ზოგიერთი ველი როგორ გამოიყურება")
    public eeHomePageSteps changeToEng() {
        eng.click();
        Assert.assertEquals(registration.getText(),"Registration");
        Assert.assertEquals(it.getText(),"IT");
        return this;
    }
    @Step("ისევ ენის ცვლილება")
    public eeHomePageSteps changeToGEO() {
        geo.click();
        Assert.assertEquals(registration.getText(),"რეგისტრაცია");
        Assert.assertEquals(it.getText(),"კომპიუტერული ტექნიკა");
        return this;
    }
    @Step("მენიუ კორპორატიულამდე ჩასქროლვა")
    public eeHomePageSteps Call (){
    scrollText.scrollIntoView(false);
    call.click();
        return this;
    }
    @Step("მენიუ კონტაქტის კატეგორიები")
    public eeHomePageSteps checkContact(String Contact) {
        $(byText(Contact)).waitUntil(Condition.visible, 500);
        return this;
    }
}
