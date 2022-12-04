package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {
    public WebElement registerlink()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }
    public WebElement chooseGender()
    {
        return Hooks.driver.findElement(By.id("gender-male"));
    }
    public WebElement firstName()
    {
        return Hooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement lastName()
    {
        return Hooks.driver.findElement(By.id("LastName"));
    }
    public WebElement dayDDL()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }
    public WebElement monthDDL()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }
    public WebElement yearDDL()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }
    public WebElement eMail()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement password()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement confirmPassword()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement registerButton()
    {
        return Hooks.driver.findElement(By.id("register-button"));
    }
    public WebElement registerMessage()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }
}
