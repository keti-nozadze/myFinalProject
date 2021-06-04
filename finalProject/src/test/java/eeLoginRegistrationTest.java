import com.ee.StepObject.eeLogRegSteps;
import com.ee.Utils.Retry;
import com.ee.Utils.chrome_runner;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.ee.DataObject.eeLogReg.*;

@Listeners(com.ee.Utils.TestLister.class)
public class eeLoginRegistrationTest extends chrome_runner {

    @Test(retryAnalyzer = Retry.class, priority = 1)
    @Description("რეგისტრაციისა და ავტორიზაციის ქეისები")
    public void LoginSuccess(){
    eeLogRegSteps st = new eeLogRegSteps();
    st
            .GoLoginAccount()
            .Login(mail_address, lgPassword);
    }
    @Test(retryAnalyzer = Retry.class, priority = 2)
    public void LoginUnsuccessful(){
        eeLogRegSteps st = new eeLogRegSteps();
        st
                .GoLoginAccount()
                .UnsuccessfulLogin();
    }
    @Test(retryAnalyzer = Retry.class, priority = 3)
    public void createNewAccount() {
        eeLogRegSteps st = new eeLogRegSteps();
        st
                .GoLoginAccount()
                .GoToCreateAccount()
                .firstName(firstName)
                .lastName(lastName)
                .Email1(email)
                .password(password)
                .confirmPassword(confirmPassword)
                .SighUp()
                .smsCode(smsCode)
                .Registration();
    }
}
