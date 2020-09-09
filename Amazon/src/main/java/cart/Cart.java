package cart;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static cart.CartWebElements.*;


public class Cart extends CommonAPI {

    @FindBy(how = How.ID, using = searchFieldIDWebElement)
    public WebElement searchField;
    @FindBy(how = How.XPATH, using = searchButtonXPathWebElement)
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = wd5TBPassportXpathWebElement)
    public WebElement wd5TBPassportItem;
    @FindBy(how = How.ID, using = addToCartIDWebElement)
    public WebElement addToCart;
    @FindBy(how = How.ID, using = addedToCartVerificationIDWebElement)
    public WebElement addedToCartVerification;
    @FindBy(how = How.ID, using = cartIDWebElement)
    public WebElement cart;
    @FindBy(how = How.NAME, using = deleteWD5TBPassportNameWebElement)
    public WebElement deleteWD5tbPassport;
    @FindBy(how = How.XPATH, using = yourAmazonCartIsEmptyXpathWebElement)
    public WebElement yourAmazonCartIsEmptyText;
    @FindBy(how = How.ID, using = qtyDropDownIDWebElement)
    public WebElement qtyDropDown;
    @FindBy(how = How.CSS, using = qty0DeleteCSSWebElement)
    public WebElement qtyDropDown0Delete;
    @FindBy(how = How.CSS, using = qty2CSSWebElement)
    public WebElement qtyDropDown2;
    @FindBy(how = How.CSS, using = qty2XPathWebElement)
    public WebElement qtyXPathDropDown2;
    @FindBy(how = How.NAME, using = proceedToCheckoutButtonNameWebElement)
    public WebElement proceedToCheckoutButton;
    @FindBy(how = How.NAME, using = qtyDropDownClassWebElement)
    public WebElement qtyDropDownClass;
    @FindBy(how = How.CSS, using = cartHomePageCSSWebElement)
    public WebElement cartHomePage;


    /**
     * This method retrieves the title of the page when called.
     */
    public String getTitle() {
        return driver.getTitle().toString();

    }

    /**
     * This method enters a String in Amazon search field.
     *
     * @param searchItem The user must provide a String value to be searched.
     */
    public void typeOnSearchField(String searchItem) {
        searchField.sendKeys(searchItem);
    }

    /**
     * This method clicks on the Amazon search button.
     */
    public void clickOnSearchButton() {
        searchButton.click();
    }

    /**
     * This method submits search without clicking on the search button.
     */
    public void submitSearch() {
        searchField.submit();
    }

    /**
     * This method clicks on the search item
     * "WD 5TB My Passport Portable External Hard Drive, Black - WDBPKJ0050BBK-WESN".
     */
    public void clickOnWD5TBHardDriveItem() {
        wd5TBPassportItem.click();
    }

    /**
     * This method adds item to cart.
     */
    public void addToCart() {
        addToCart.click();
    }

    /**
     * This method allows user to click on the cart.
     */
    public void clickOnCart() {
        cart.click();
    }

    public void clickOnCartFromHomePage() {
        cartHomePage.click();
    }

    /**
     * This method allows user to click on the Proceed to Checkout button.
     */
    public void clickProceedToCheckoutButton() {
        proceedToCheckoutButton.click();
    }

    /**
     * This method verifies that item was added to the cart by displaying "Added to Cart" message.
     *
     * @return boolean value of true if the message "Added to Cart" is displayed.
     */
    public boolean addedToCartIsDisplayed() {
        addedToCartVerification.isDisplayed();
        return true;
    }

    public boolean WD5tbPassportIsDisplayed() {
        wd5TBPassportItem.isDisplayed();
        return true;
    }

    public boolean yourAmazonCartIsEmptyIsDisplayed() {
        yourAmazonCartIsEmptyText.isDisplayed();
        return true;
    }

    /**
     * This method searches "WD 5tb hard drive" on Amazon search.
     */
    public void searchWD5TBHardDrive() {
        typeOnSearchField("WD 5tb hard drive");
        submitSearch();
    }

    /**
     * This method searches and adds
     * 'WD 5TB Passport Portable External Hard Drive, Black - WDBPKJ0050BBK-WESN' to the cart.
     */
    public void addWDPassportHardDriveToCart() {
        searchWD5TBHardDrive();
        clickOnWD5TBHardDriveItem();
        addToCart();
    }

    /**
     * This method clicks on qty drop down menue.
     */
    public void clickOnQtyDropDownMenu() {
        qtyDropDown.click();
    }

    /**
     * This method deletes 'WD 5TB Passport.
     */
    public void deleteItemFromQtyDropDown() {
        clickOnQtyDropDownMenu();
        qtyDropDown0Delete.click();
    }

    /**
     * This method selects 2 from Qty Drop Down menu.
     */

    public void qtyDropDown2() {
        clickOnQtyDropDownMenu();
        qtyDropDown2.click();
    }

    /**
     * This method returns that the qty 2 is selected for an item in the cart.
     *
     * @return
     */
    boolean qty2IsSelected() {
        qtyDropDown2.isSelected();
        return true;
    }

    /**
     * This method verifies that 'WD 5TB Passport Portable External Hard Drive, Black -
     * WDBPKJ0050BBK-WESN' to the cart.
     */
    public void verifyThatWD5tbIsAddedToCartFromOutsideCart() {
        Assert.assertTrue(addedToCartIsDisplayed(), "Item did not match!");
    }

    /**
     * This method verifies that 'WD 5TB Passport Portable External Hard Drive, Black -
     * WDBPKJ0050BBK-WESN' to the cart by going into the cart.
     */
    public void verifyThatWD5tbIsAddedToCartFromInsideCart() {
        clickOnCart();
        Assert.assertTrue(WD5tbPassportIsDisplayed(), "Item did not match!");
    }

    /**
     * This method searches and adds WD5tbPassport.
     * Then, it deletes the item from the cart.
     */
    public void deleteWD5tbPassport() {
        addWDPassportHardDriveToCart();
        clickOnCart();
        deleteItemFromQtyDropDown();
    }

    /**
     * This method verifies that the cart is empty.
     */
    public void verifyThatCartIsEmpty() {
        Assert.assertTrue(yourAmazonCartIsEmptyIsDisplayed(), "Item was not deleted!");
    }

    /**
     * This method allows the user to proceed to checks out after adding an item into the cart.
     * It takes the user to the login page.
     */
    public void checkoutAfterAddingAnItemToCart() {
        addWDPassportHardDriveToCart();
        clickOnCart();
        clickProceedToCheckoutButton();
    }

    /**
     * This method verifies that the user is taken to the login page after proceeding to checkout.
     */
    public void verifyCheckoutAfterAddingAnItemToCart() {
        String actualSignInTitle = getTitle();
        Assert.assertTrue(getTitle().equals(signInTitleString));
    }

    /**
     * This method searches adds an item (WD 5TB Passport - WDBPKJ0050BBK-WESN) to the cart.
     * Then, it takes the user to the cart and clicks on the Qty drop down.
     */
    public void clickOnQtyDropDown() {
        addWDPassportHardDriveToCart();
        clickOnCart();
        clickOnQtyDropDownMenu();
    }

    /**
     * This method creates a list of values from a locator.
     *
     * @param locator requires an class type locator.
     * @return list of values from the locator.
     */
    public List<WebElement> getListOfWebElementsByClass(String locator) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.className(locator));
        return list;
    }

    /**
     * This method iterates list from the getListOfWebElementsByClass method.
     *
     * @param list list of values from the locator.
     * @return items from the list of getListOfWebElementsByID method.
     */
    public List<String> getListOfString(List<WebElement> list) {
        List<String> items = new ArrayList<String>();
        for (WebElement element : list) {
            items.add(element.getText());
        }
        return items;
    }

    /**
     * This method validates that all the values (items) were iterated from the locator of the Qty drop down in cart.
     */
    public void validateAllDropDown() {
        List<WebElement> element = getListOfWebElementsByClass("a-popover-wrapper");
        List<String> listOfText = getListOfString(element);
        for (String st : listOfText) {
            System.out.println(st);
        }
        List<String> expectedMenu = listOfText;
        Assert.assertEquals(listOfText, expectedMenu);
    }

    /**
     * This method adds 'WD 5TB Passport - WDBPKJ0050BBK-WESN' adds to cart and then increases the quantity to 2.
     * @throws InterruptedException
     */
    public void increaseQtyTo2() throws InterruptedException {
        driver.manage().window().maximize();
        addWDPassportHardDriveToCart();
        navigateBack();
        addToCart();
        sleepFor(1);
        clickOnCart();
    }

    /**
     * This method validates that there are 2 items in the cart.
     */
    public void validateIncreaseQuantityTo2() {
        validateByText(subtotalIDWebElement, "Subtotal (2 items):");
    }


}
