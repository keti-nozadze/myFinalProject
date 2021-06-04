package com.ee.StepObject;

import com.codeborne.selenide.Condition;
import com.ee.DataObject.eeLogReg;
import com.ee.PageObject.eeLoginPage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.ee.DataObject.eeLogReg.mail_address;


public class eeLogRegSteps extends eeLoginPage {
    @Step("ავტორიზაციის ფანჯარაზე დაკლიკება")
    public eeLogRegSteps GoLoginAccount(){
        login.click();
        Assert.assertTrue(login.is(Condition.visible));
        return this;
    }
    @Step("ავტორიზაციის გავლა")
    public eeLogRegSteps Login(String mailAddress, String lgPassword){
        mail_address_input.setValue(mailAddress);
        mail_address_input.shouldNotBe(Condition.empty);
        lg_pas_input.setValue(lgPassword);
        lg_pas_input.shouldNotBe(Condition.empty);
        loginClick.click();
        profile.waitUntil(Condition.visible,3000).click();
        signOut.click();
        $(byText("წარმატებით გამოხვედით პროფილიდან")).waitUntil(Condition.visible, 3000);
        Assert.assertEquals(create_Account.getText(),"რეგისტრაცია");
        return this;
    }
    @Step("წარუმატებელი ავტორიზაცია")
    public eeLogRegSteps UnsuccessfulLogin(){
        mail_address_input.setValue("n");
        lg_pas_input.setValue("n");
        loginClick.click();
        Assert.assertFalse(profile.is(Condition.visible));
        return this;
    }
    @Step("რეგისტრაციის ფანჯარაზე დაკლიკება")
    public eeLogRegSteps GoToCreateAccount() {
        create_Account.click();
        $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible);
        return this;
    }
    @Step("სახელის შეყვანა - {Name}")
    public eeLogRegSteps firstName(String Name) {
        firstName_input.setValue(Name);
        firstName_input.shouldNotBe(Condition.empty);
        Assert.assertNotEquals(firstName_input.getText(), "სახელი სავალდებულოა");
        return this;
    }
    @Step("გვარის შეყვანა")
    public eeLogRegSteps lastName(String last) {
        lastName_input.setValue(last);
        lastName_input.shouldNotBe(Condition.empty);
        Assert.assertNotEquals(lastName_input.getText(),"გვარი სავალდებულოა");
        return this;
    }
    @Step("email შეყვანა - {email}")
    public eeLogRegSteps Email1(String email) {
        email_input.setValue(email);
        email_input.shouldNotBe(Condition.empty);
        Assert.assertNotEquals(email_input.getText(), "ელ. ფოსტა სავალდებულოა");
        return this;
    }

    @Step("password შეყვანა - {password}")
    public eeLogRegSteps password(String password) {
        password_input.setValue(password);
        password_input.shouldNotBe(Condition.empty);
        Assert.assertNotEquals(password_input.getText(),"პაროლი სავალდებულოა.");
        return this;
    }
    @Step("confirmPassword შეყვანა - {confirmPassword}")
    public eeLogRegSteps confirmPassword(String confirmPassword) {
        confirmPassword_input.setValue(confirmPassword);
        confirmPassword_input.shouldNotBe(Condition.empty);
        Assert.assertNotEquals(confirmPassword_input.getText(),"პაროლის გამეორება სავალდებულოა");
        return this;
    }
    @Step("SighUp click")
    public eeLogRegSteps SighUp() {
        sigh_up.click();
        Assert.assertFalse(sigh_up.is(Condition.disabled));
        return this;
    }

    @Step("sms კოდის შეყვანა - {smsCode}")
    public eeLogRegSteps smsCode(String smsCode) {
        $(byText("მიუთითეთ კოდი")).waitUntil(Condition.visible,5000);
        smsCode_input.setValue(smsCode);
        smsCode_input.shouldNotBe(Condition.empty);
        return this;
    }
    @Step("საბოლოო რეგისტრაციის ღილაკზე დაკლიკება")
    public eeLogRegSteps Registration() {
        registration.click();
        $(byText("გთხოვთ შეიყვანოთ მართებული კოდი")).waitUntil(Condition.visible, 300);
        return this;
    }





}
