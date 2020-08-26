package cart;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CartTest extends CommonAPI {

    Cart cart;

    @BeforeMethod
    public void getInit() {
        cart = PageFactory.initElements(driver, Cart.class);
    }

    @Test
    public void testItemAddedToCartWithoutGoingIntoCart() {
        cart.addWDPassportHardDriveToCart();
        cart.verifyThatWD5tbIsAddedToCartFromOutsideCart();
    }

    @Test
    public void testItemAddedToCartByGoingIntoCart() {
        cart.addWDPassportHardDriveToCart();
        cart.verifyThatWD5tbIsAddedToCartFromInsideCart();
    }

    @Test
    public void testItemDeletedFromCart() {
        cart.deleteWD5tbPassport();
        cart.verifyThatCartIsEmpty();
    }

    @Test
    public void testCheckoutAfterAddingAnItemToCart() {
        cart.checkoutAfterAddingAnItemToCart();
        cart.verifyCheckoutAfterAddingAnItemToCart();
    }

    @Test
    public void TestValidateAllDropDown(){
        cart.clickOnQtyDropDown();
        cart.validateAllDropDown();
    }
}
