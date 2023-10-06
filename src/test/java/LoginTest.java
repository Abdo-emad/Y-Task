

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase{

    LoginPage loginPage;
    SoftAssert softAssert;
    @Test
    public void validLogin()
    {
        loginPage= new LoginPage(driver);
        loginPage.enterUsername("demo123");
        loginPage.enterPassword("P@ssw0rd");
        loginPage.clickOnLoginButton();
        softAssert.assertTrue(true);
        softAssert.assertAll();


    }}