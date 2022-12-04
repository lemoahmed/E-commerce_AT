package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class D08_WishlistStepDef {
    P03_homePage homePage = new P03_homePage();
    @Given("user clicks on wishlist icon")
    public void clickOnWishlistIcon()
    {
        homePage.addToWishlistButton().click();
    }
    @Then("The product has been added to your wishlist message appear with green background color")
    public void successMessageAppear()
    {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals("The product has been added to your wishlist",homePage.wishlistMessage().getText());
        softAssert.assertEquals(Color.fromString(homePage.wishlistMessage().getCssValue("background-color")).asHex(),"#4bb07a");
        softAssert.assertAll();
    }
    @When("user go to wishlist page")
    public void goToWishListPage() throws InterruptedException {
        Thread.sleep(4000);
        homePage.wishlistLink().click();
    }
    @Then("Qty value should be greater than 0")
    public void checkQtyValue() throws InterruptedException {
        Assert.assertTrue(Integer.parseInt(homePage.QtyValue().getAttribute("value"))>0); ;
    }
}
