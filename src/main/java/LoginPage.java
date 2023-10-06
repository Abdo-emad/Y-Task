import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage  extends PageBase{

    By logBtn = By.id("login2");
    By username = By.id("loginusername");
    By password = By.id("loginpassword");
    By loginButton = By.xpath("//button[@onclick=\"logIn()\"]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public  void enterUsername(String usernameText)
    {
driver.findElement(logBtn).click();
        driver.findElement(username).sendKeys(usernameText);
    }
    public  void enterPassword(String passwordText)
    {

        driver.findElement(password).sendKeys(passwordText);
    }
    public HomePage clickOnLoginButton()
    {

        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }
}
