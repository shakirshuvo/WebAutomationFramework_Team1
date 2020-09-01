package cart;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.concurrent.TimeUnit;

public class CartTest extends CommonAPI {

    Cart cart;

    @BeforeMethod
    public void getInit() {
        cart = PageFactory.initElements(driver, Cart.class);
    }

    @Test
    public void testItemAddedToCartWithoutGoingIntoCart() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cart.addWDPassportHardDriveToCart();
        cart.verifyThatWD5tbIsAddedToCartFromOutsideCart();
    }

    @Test
    public void testItemAddedToCartByGoingIntoCart() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cart.addWDPassportHardDriveToCart();
        cart.verifyThatWD5tbIsAddedToCartFromInsideCart();
    }

    @Test
    public void testItemDeletedFromCart() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cart.deleteWD5tbPassport();
        cart.verifyThatCartIsEmpty();
    }

    @Test
    public void testCheckoutAfterAddingAnItemToCart() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cart.checkoutAfterAddingAnItemToCart();
        cart.verifyCheckoutAfterAddingAnItemToCart();
    }

    @Test
    public void TestValidateAllDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cart.clickOnQtyDropDown();
        cart.validateAllDropDown();
    }
}
