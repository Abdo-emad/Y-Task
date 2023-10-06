import org.testng.asserts.SoftAssert;

public class CartTest extends TestBase{

    CartPom1 cartPom1 ;
    SoftAssert softAssert1;
    public void CartTest(){
        cartPom1.click12("b","Egy","Alex","456789","April","2022");
        softAssert1.assertTrue(cartPom1.Msg().contains("Thank you for your purchase!"));
        softAssert1.assertAll();
    }
}
