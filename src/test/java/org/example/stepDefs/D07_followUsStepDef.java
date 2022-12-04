package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef {
    P03_homePage homePage=new P03_homePage();
    @Given("user opens facebook link")
    public void openFacebook()
    {
        homePage.facebookLink().click();
    }
    @Given("user opens twitter link")
    public void openTwitter()
    {
        homePage.twitterLink().click();
    }
    @Given("user opens rss link")
    public void openRSS()
    {
        homePage.rssLink().click();
    }
    @Given("user opens youtube link")
    public void openYoutube()
    {
        homePage.youtubeLink().click();
    }
    @Then("^\"(.*)\" is opened in new tab$")
    public void properPageOpenInNewTab(String expectedPageURL) throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> tabs=new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        String tabURL=homePage.tabCurrentUrl();
        Assert.assertEquals(expectedPageURL,tabURL);
    }
}
