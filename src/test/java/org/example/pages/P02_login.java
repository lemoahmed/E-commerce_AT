package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement loginLink()
    {
        return Hooks.driver.findElement(By.className("ico-login"));
    }
    public WebElement eMail()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement password()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement loginButton()
    {
        return Hooks.driver.findElement(By.className("login-button"));
    }
    public String loginURL()
    {
        return Hooks.driver.getCurrentUrl();
    }
    public WebElement myAccount()
    {
        return Hooks.driver.findElement(By.className("ico-account"));
    }
    public WebElement errorMessage()
    {
        return Hooks.driver.findElement(By.className("validation-summary-errors"));
    }
}
