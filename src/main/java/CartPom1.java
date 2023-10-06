import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPom1 extends PageBase{

    public CartPom1(WebDriver driver) {
        super(driver);
    }
    By element1= By.id("cartur");
    By element2 = By.xpath("//button[@data-toggle=\"modal\"]");
    By element3= By.id("name");
    By element4= By.id("country");
    By element5=By.id("city");
    By element6= By.id("card");
    By element7=By.id("month");
    By element8=By.id("year");
    By element9=By.xpath("//button[@onclick=\"purchaseOrder()\"]");
   By successMsg = By.xpath("//h2[contains(text()");
   public void click12(String name , String country , String city, String card, String month , String year){
      driver.findElement(element1).click();
      driver.findElement(element2).click();
      driver.findElement(element3).sendKeys(name);
      driver.findElement(element4).sendKeys(country);
      driver.findElement(element5).sendKeys(city);
      driver.findElement(element6).sendKeys(card);
      driver.findElement(element7).sendKeys(month);
      driver.findElement(element8).sendKeys(year);
      driver.findElement(element9).click();
   }
   public String Msg(){
      String Msg1= driver.findElement(successMsg).getText();
       return Msg1;
   }
}
