import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SignUpPage {
    WebDriver driver ;
    public SignUpPage(WebDriver driver){
        this.driver=driver;
    }

    public void SignUp(String userName , String Password){
        WebElement element= driver.findElement(By.id("signin2"));
        element.click();
        WebElement element1= driver.findElement(By.id("sign-username"));
        element1.sendKeys(userName);
        WebElement element2= driver.findElement(By.id("sign-password"));
        element2.sendKeys(Password);
        WebElement element3= driver.findElement(By.xpath("//button[@onclick=\"register()\"]"));
        element3.click();
    }
}
