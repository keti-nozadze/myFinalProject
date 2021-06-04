package com.ee.PageObject;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$$;

public class eeProductsSearch {
    protected SelenideElement
    search_product = $("#search_list"),
    search_result = $(".fa", 0),
    compare_product = $(byText("შედარება")),
    clear = $(".comp-product-clear-btn"),
    addProduct = $$(".compare-content-b").findBy(Condition.text("პროდუქტის დამატება")),
    add_product_input = $(".p-search"),
    click_result = $(".result-set-wrapper", 0),
    compareProducts = $(".comp-product-start");
}
