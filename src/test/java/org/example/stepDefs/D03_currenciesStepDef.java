package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P03_homePage homePage= new P03_homePage();

    @Given("user change currency to Euro")
    public void changeCurrency()
    {
        Select selectCurrency=new Select(homePage.currencyDDL());
        selectCurrency.selectByVisibleText("Euro");
    }
    @Then("items price change to Euro")
    public void priceChange()
    {
        for (WebElement element:homePage.itemsGrid())
        {
            Assert.assertTrue(element.getText().contains("€"));
        }
    }
}
