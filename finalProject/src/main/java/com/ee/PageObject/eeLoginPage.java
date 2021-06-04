package com.ee.PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class eeLoginPage {
    protected SelenideElement
            create_Account = $(byText("რეგისტრაცია")),
            firstName_input = $("#firstName"),
            lastName_input = $("#lastName"),
            email_input = $("#email"),
            password_input = $("#password"),
            confirmPassword_input = $("#confirmPassword"),
            sigh_up = $("#singup"),
            smsCode_input = $("#tokenPassword"),
            registration = $$(".btn-darkred").findBy(Condition.text("რეგისტრაცია")),
            mail_address_input = $(byName("userName")),
            lg_pas_input = $(byName("password")),
            loginClick = $(".btn-darkred"),
            profile = $(byText("ჩემი პროფილი")),
            signOut = $(byText("გამოსვლა")),
            login = $(byText("ავტორიზაცია"));
}


