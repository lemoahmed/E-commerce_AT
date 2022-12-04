package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class D05_hoverCategoriesStepDef {
    P03_homePage homePage=new P03_homePage();
    int randomMainCategory;
    int min=0;
    String categoryTitle;
    @Given("hover one of the main category")
    public void hoverMainCategory() throws InterruptedException {
        Actions action=new Actions(Hooks.driver);
        int max=homePage.mainCategories().size()-1;
        randomMainCategory = (int)Math.floor(Math.random()*(max-min+1)+min);
        action.moveToElement(homePage.mainCategories().get(randomMainCategory)).perform();
    }
    @And("click on one of the subcategory")
    public void clickOnSubcategory()
    {
        String SubcategoryPath="(//ul[@class='top-menu notmobile']//ul)["+Integer.toString(randomMainCategory+1)+"]/li/a";
        List<WebElement> subcategoryList= homePage.subcategory(SubcategoryPath);
        System.out.println(subcategoryList.size());
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        if (subcategoryList.size()>1)
        {
            int max=subcategoryList.size()-1;
            int randomSubCategory=(int)Math.floor(Math.random()*(max-min+1)+min);
            System.out.println(randomSubCategory);
            categoryTitle=subcategoryList.get(randomSubCategory).getText().toLowerCase().trim();
            subcategoryList.get(randomSubCategory).click();
        }
        else
        {
            categoryTitle=homePage.mainCategories().get(randomMainCategory).getText().toLowerCase().trim();
            homePage.mainCategories().get(randomMainCategory).click();
        }
        Hooks.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
@Then("open the selected subcategory page")
    public void openSelectedPage()
    {
        Assert.assertTrue(homePage.pageTitle().getText().toLowerCase().trim().contains(categoryTitle));
    }
}
