package com.ee.StepObject;

import com.codeborne.selenide.Condition;
import com.ee.PageObject.eeProductsSearch;
import io.qameta.allure.Step;
import org.testng.Assert;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class eeProductsSearchSteps extends eeProductsSearch {
    @Step("პროდუქტის ძიება - {ProductName}")
    public eeProductsSearchSteps SearchProduct(String ProductName) {
        search_product.setValue(ProductName);
        search_product.shouldNotBe(Condition.empty);
        search_result.click();
        return this;
    }
    @Step("მეორე პროდუქტის დამატება- {PrName}")
    public eeProductsSearchSteps productAdd(String PrName){
        addProduct.click();
        add_product_input.setValue(PrName);
        add_product_input.shouldNotBe(Condition.empty);
        click_result.click();
        return this;
    }
    @Step("პროდუქტების შედარება")
    public eeProductsSearchSteps compareList(){
        compare_product.click();
        $(byText("ნივთი დამატებულია შედარების სიაში")).shouldBe(Condition.visible);
        return this;
    }
    @Step("შედარების სიის გასუფთავება")
    public eeProductsSearchSteps Clear() {
        clear.click();
        return this;
    }
    @Step("მოძებნილი პროდუქტების შედარება")
    public eeProductsSearchSteps CompareProducts(){
        compareProducts.click();
        return this;
    }
}
