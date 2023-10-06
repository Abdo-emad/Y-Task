import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;


public class PageBase {
    static WebDriver driver ;

public PageBase(WebDriver driver){
    this.driver= driver;
}
    public static void ImplicitWait(long seconds)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

}
