import org.testng.annotations.Test;

public class RegistrationTest extends TestBase{
    RegistrationPage registrationPage ;
    @Test
    public void registrationAction(){
        registrationPage= new RegistrationPage(driver);
        registrationPage.RegistrationFields("demo123","P@ssw0rd");

    }
}
