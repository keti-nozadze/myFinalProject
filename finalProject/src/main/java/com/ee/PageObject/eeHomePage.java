package com.ee.PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class eeHomePage {
    protected SelenideElement
            geo = $(byText("geo")),
            eng = $(byText("eng")),
            registration = $(".btn-register"),
            it = $(".nav-link"),
            scrollText = $(byText("კორპორატიული")),
            call = $("#number");






}

