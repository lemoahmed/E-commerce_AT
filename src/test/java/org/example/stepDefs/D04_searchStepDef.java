package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    P03_homePage homePage=new P03_homePage();
    @Given("^user enter \"([^\"]*)\" in search$")
    public void enterKeyword(String keyWord)
    {
        homePage.searchBox().sendKeys(keyWord);
    }
    @And("press enter")
    public void pressEnter()
    {
        homePage.searchBox().sendKeys(Keys.ENTER);
    }
    @Then("^items with the \"([^\"]*)\" appear$")
    public void searchResult(String keyWord)
    {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(homePage.pageURL().contains("https://demo.nopcommerce.com/search?q="));
        System.out.println(homePage.productTitle().size());
        for (WebElement product:homePage.productTitle())
        {
            softAssert.assertTrue(product.getText().toLowerCase().contains(keyWord));
        }
        softAssert.assertAll();
    }
    @And("clicks on the item")
    public void clickItem()
    {
        homePage.itemURL().click();
    }
    @Then("^item should have the same \"(.*)\"$")
    public void checkSKU(String SKU)
    {
        Assert.assertTrue(homePage.itemSKU().getText().contains(SKU));
    }
}
