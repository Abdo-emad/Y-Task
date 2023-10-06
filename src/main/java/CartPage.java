import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    WebDriver driver;
    public CartPage(WebDriver driver){
        this.driver=driver;
    }
    public void ToCart(String name , String country , String city , String card , String month , String year){
        WebElement element11= driver.findElement(By.id("cartur"));
        element11.click();
        WebElement element12= driver.findElement(By.xpath("//button[@data-toggle=\"modal\"]"));
        element12.click();
        WebElement element13= driver.findElement(By.id("name"));
        element13.sendKeys(name);
        WebElement element14= driver.findElement(By.id("country"));
        element14.sendKeys(country);
        WebElement element15= driver.findElement(By.id("city"));
        element15.sendKeys(city);
        WebElement element16= driver.findElement(By.id("card"));
        element16.sendKeys(card);
        WebElement element17= driver.findElement(By.id("month"));
        element17.sendKeys(month);
        WebElement element18= driver.findElement(By.id("year"));
        element18.sendKeys(year);
        WebElement element19= driver.findElement(By.xpath("//button[@onclick=\"purchaseOrder()\"]"));
        element19.click();
         }
         public WebElement message(){
             WebElement element22 = driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your purchase!')]"));
return  element22;
         }
}
