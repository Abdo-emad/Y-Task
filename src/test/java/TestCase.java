import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class TestCase {
    WebDriver driver;
    SignUpPage signUpPage ;
    LogPage logPage ;
    CartPage cartPage;
    SoftAssert softAssert;
    @BeforeMethod
    public  void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
        signUpPage = new SignUpPage(driver);
        logPage=new LogPage(driver);
        cartPage= new CartPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test (priority=1)
    public void RegistrationPage() {
       /* WebElement element= driver.findElement(By.id("signin2"));
        element.click();
        WebElement element1= driver.findElement(By.id("sign-username"));
        element1.sendKeys("Abdelrahman");
        WebElement element2= driver.findElement(By.id("sign-password"));
        element2.sendKeys("P@ssw0rd");
        WebElement element3= driver.findElement(By.xpath("//button[@onclick=\"register()\"]"));
        element3.click();*/
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         signUpPage.SignUp("demo123","P@ssw0rd");
        softAssert.assertTrue(true);
        softAssert.assertAll();


    }
    @Test (priority=2)
    public void LoginPageTest(){
      /*  WebElement element4 = driver.findElement(By.id("login2"));
        element4.click();
        WebElement element5 = driver.findElement(By.id("loginusername"));
        element5.sendKeys("Abdelrahman");
        WebElement element6 = driver.findElement(By.id("loginpassword"));
        element6.sendKeys("P@ssw0rd");
        WebElement element7= driver.findElement(By.xpath("//button[@onclick=\"logIn()\"]"));
        element7.click();
        WebElement element8 = driver.findElement(By.linkText("Phones"));
        element8.click();
        WebElement element9=driver.findElement(By.xpath("//body/div[@id='contcont']/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]"));
        element9.click();
        WebElement element10 = driver.findElement(By.xpath("//a[@onclick=\"addToCart(1)\"]"));
        element10.click();*/
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       logPage.EnterLogPage("demo123","P@ssw0rd");
        softAssert.assertTrue(true);
        softAssert.assertAll();

    }
    @Test(priority =3)
    public void ADDTOCart(){
       /* WebElement element11= driver.findElement(By.id("cartur"));
        element11.click();
        WebElement element12= driver.findElement(By.xpath("//button[@data-toggle=\"modal\"]"));
        element12.click();
        WebElement element13= driver.findElement(By.id("name"));
        element13.sendKeys("a");
        WebElement element14= driver.findElement(By.id("country"));
        element14.sendKeys("Egypt");
        WebElement element15= driver.findElement(By.id("city"));
        element15.sendKeys("Cairo");
        WebElement element16= driver.findElement(By.id("card"));
        element16.sendKeys("123456789");
        WebElement element17= driver.findElement(By.id("month"));
        element17.sendKeys("June");
        WebElement element18= driver.findElement(By.id("year"));
        element18.sendKeys("2023");
        WebElement element19= driver.findElement(By.xpath("//button[@onclick=\"purchaseOrder()\"]"));
        element19.click();*/
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        logPage.EnterLogPage("demo123","P@ssw0rd");
       cartPage.ToCart("a","Egypt","Cairo","123456789","June","2023");
        softAssert.assertTrue(cartPage.message().getText().contains("Thank you for your purchase!"));

        softAssert.assertAll();
    }
    @AfterMethod
    public void close(){
        driver.quit();
    }
}
