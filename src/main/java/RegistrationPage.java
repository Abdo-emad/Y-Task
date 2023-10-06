import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends PageBase{
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    By signup_btn = By.id("signin2");
    By username_rg = By.id("sign-username");
    By pass_rg = By.id("sign-password");
    By register_btn =  By.xpath("//button[@onclick=\"register()\"]");
    public void RegistrationFields(String user_name , String pass){
        driver.findElement(signup_btn).click();
        driver.findElement(username_rg).sendKeys(user_name);
        driver.findElement(pass_rg).sendKeys(pass);
        driver.findElement(register_btn).click();
    }
}
