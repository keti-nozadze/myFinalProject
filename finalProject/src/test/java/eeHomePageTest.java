import com.ee.StepObject.eeHomePageSteps;
import com.ee.Utils.chrome_runner;
import com.sun.net.httpserver.Authenticator;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static com.ee.DataObject.eeHomepageData.HomePageMenuContact;

public class eeHomePageTest extends chrome_runner {
    @Test(retryAnalyzer = Authenticator.Retry.class, priority = 1)
    @Description("მთავარი გვერდის ქეისები")
    public void changeLanguage(){
        eeHomePageSteps st = new eeHomePageSteps();
        st
                .changeToEng()
                .changeToGEO();
    }
    @Test(retryAnalyzer = Authenticator.Retry.class, priority = 2)
    public void contact(){
        eeHomePageSteps st = new eeHomePageSteps();
        for (String Contact: HomePageMenuContact){
            st.checkContact(Contact);
        }
    }
    @Test(retryAnalyzer = Authenticator.Retry.class, priority = 3)
    public void Call(){
        eeHomePageSteps st = new eeHomePageSteps();
        st
                .Call();
    }
}
