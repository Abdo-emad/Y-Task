import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogPage {
    WebDriver driver;
    public LogPage(WebDriver driver){
        this.driver=driver;
    }
    public void EnterLogPage( String Uname , String pass){

        WebElement element4 = driver.findElement(By.id("login2"));
        element4.click();
        WebElement element5 = driver.findElement(By.id("loginusername"));
        element5.sendKeys(Uname);
        WebElement element6 = driver.findElement(By.id("loginpassword"));
        element6.sendKeys(pass);
        WebElement element7= driver.findElement(By.xpath("//button[@onclick=\"logIn()\"]"));
        element7.click();
        WebElement element8 = driver.findElement(By.linkText("Phones"));
        element8.click();
        WebElement element9=driver.findElement(By.xpath("//body/div[@id='contcont']/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]"));
        element9.click();
        WebElement element10 = driver.findElement(By.xpath("//a[@onclick=\"addToCart(1)\"]"));
        element10.click();
    }
}
