package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {
    public WebElement currencyDDL()
    {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }
    public List<WebElement> itemsGrid()
    {
        return Hooks.driver.findElements(By.className("actual-price"));
    }
    public WebElement searchBox()
    {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public List<WebElement> productTitle()
    {
        return Hooks.driver.findElements(By.className("product-title"));
    }

    public WebElement itemURL()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/science-faith\"]"));
    }
    public String pageURL()
    {
        return Hooks.driver.getCurrentUrl();
    }
    public WebElement itemSKU()
    {
        return Hooks.driver.findElement(By.id("sku-36"));
    }
    public List<WebElement> mainCategories()
    {
        return Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));
    }
    public List<WebElement> subcategory(String path)
    {
        return Hooks.driver.findElements(By.xpath(path));
    }
    public WebElement pageTitle()
    {
        return Hooks.driver.findElement(By.className("page-title"));
    }

    public WebElement firstSlider()
    {
        return Hooks.driver.findElement(By.xpath("//a[@href='http://demo.nopcommerce.com/'][1]"));
    }
    public WebElement secondSlider()
    {
        return Hooks.driver.findElement(By.xpath("//a[@href='http://demo.nopcommerce.com/'][2]"));
    }
    public String sliderCurrentUrl()
    {
        return Hooks.driver.getCurrentUrl();
    }
    public WebElement facebookLink()
    {
        return Hooks.driver.findElement(By.className("facebook"));
    }
    public WebElement twitterLink()
    {
        return Hooks.driver.findElement(By.className("twitter"));
    }
    public WebElement rssLink()
    {
        return Hooks.driver.findElement(By.className("rss"));
    }
    public WebElement youtubeLink()
    {
        return Hooks.driver.findElement(By.className("youtube"));
    }
    public String tabCurrentUrl()
    {
        return Hooks.driver.getCurrentUrl();
    }

    public WebElement addToWishlistButton()
    {
        return Hooks.driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']//div[@class='item-box'][3]//button[@type='button'][3]"));
    }
    public WebElement wishlistMessage()
    {
        return Hooks.driver.findElement(By.className("bar-notification"));
    }
    public WebElement wishlistLink()
    {
        return Hooks.driver.findElement(By.className("ico-wishlist"));
    }

    public WebElement QtyValue()
    {
        return Hooks.driver.findElement(By.xpath("//td[@class='quantity']/input"));
    }
}
