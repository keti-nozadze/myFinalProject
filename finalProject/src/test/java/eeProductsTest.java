import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.ee.StepObject.eeProductsSearchSteps;
import com.ee.Utils.Retry;
import com.ee.Utils.chrome_runner;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static com.ee.DataObject.eeProductsData.Notebook1;
import static com.ee.DataObject.eeProductsData.Notebook2;

@Listeners(com.ee.Utils.TestLister.class)
public class eeProductsTest extends chrome_runner {
    @Test(retryAnalyzer = Retry.class, priority = 1)
    @Description("პროდუქტების შედარების ქეისები")
    public void addTwoProductCompare() {
        eeProductsSearchSteps st = new eeProductsSearchSteps();
        st
                .SearchProduct(Notebook1)
                .compareList()
                .productAdd(Notebook2)
                .CompareProducts()
                .Clear();
    }
    @Test(retryAnalyzer = Retry.class, priority = 2)
    public void addSameProductCompare(){
        eeProductsSearchSteps st = new eeProductsSearchSteps();
        st
                .SearchProduct(Notebook2)
                .compareList()
                .productAdd(Notebook2)
                .CompareProducts()
                .Clear();
    }
}
