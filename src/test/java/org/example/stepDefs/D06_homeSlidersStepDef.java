package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D06_homeSlidersStepDef {
    P03_homePage homePage=new P03_homePage();
    @Given("user clicks on first slider")
    public void clickOnFirstSlider()
    {
        homePage.firstSlider().click();
    }
    @Given("user clicks on second slider")
    public void clickOnSecondSlider()
    {
        homePage.secondSlider().click();
    }
    @Then("^page \"(.*)\" should open$")
    public void selectedSliderPageOpen(String expectedPageURL) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        Assert.assertEquals(expectedPageURL, homePage.sliderCurrentUrl());
    }
}
