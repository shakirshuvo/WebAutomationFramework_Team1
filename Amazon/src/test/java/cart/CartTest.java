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
        driver.manage().window().maximize();
    }

    /**
     * This test verifies that user can add item to cart and verify without going into Cart.
     */
    @Test
    public void testItemAddedToCartWithoutGoingIntoCart() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cart.addWDPassportHardDriveToCart();
        cart.verifyThatWD5tbIsAddedToCartFromOutsideCart();
    }

    /**
     * This test verifies that user can add item to cart and verify by going going into Cart.
     */
    @Test
    public void testItemAddedToCartByGoingIntoCart() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cart.addWDPassportHardDriveToCart();
        cart.verifyThatWD5tbIsAddedToCartFromInsideCart();
    }

    /**
     * This test verifies that user can add an item to the cart and then delete it from the cart.
     */
    @Test
    public void testItemDeletedFromCart() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cart.deleteWD5tbPassport();
        cart.verifyThatCartIsEmpty();
    }

    /**
     * This test verifies that user can add an item into the cart and then checkout.
     */
    @Test
    public void testCheckoutAfterAddingAnItemToCart() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cart.checkoutAfterAddingAnItemToCart();
        cart.verifyCheckoutAfterAddingAnItemToCart();
    }

    /**
     * This test verifies the 'All' dropdown has all the departments.
     */
    @Test
    public void TestValidateAllDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cart.clickOnQtyDropDown();
        cart.validateAllDropDown();
    }

    /**
     * This test validates that there are two items of 'WD 5TB Passport - WDBPKJ0050BBK-WESN' added to the cart.
     * @throws InterruptedException
     */
    @Test
    public void testValidateIncreaseQuantityTo2() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cart.increaseQtyTo2();
        cart.validateIncreaseQuantityTo2();
    }
}
