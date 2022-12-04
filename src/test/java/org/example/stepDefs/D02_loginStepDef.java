package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login=new P02_login();
    SoftAssert assertion;
    @Given("user go to login page")
    public void goToLoginPage()
    {
        login.loginLink().click();
    }
    @And("^user login with \"(.*)\" and \"(.*)\"$")
    public void enterEmailAndPassword(String email,String password)
    {
        login.eMail().sendKeys(email);
        login.password().sendKeys(password);
    }
    @And("user press on login button")
    public void pressLogin()
    {
        login.loginButton().click();
    }
    @Then("user login to the system successfully")
    public void LoginSuccessfully()
    {
        assertion=new SoftAssert();
        assertion.assertEquals(login.loginURL(),"https://demo.nopcommerce.com/");
        assertion.assertTrue(login.myAccount().isDisplayed());
        assertion.assertAll();
    }
    @And("user could not login to the system")
    public void loginFail()
    {
        assertion=new SoftAssert();
        assertion.assertTrue(login.errorMessage().getText().contains("Login was unsuccessful"));
        assertion.assertEquals(Color.fromString(login.errorMessage().getCssValue("color")).asHex(),"#e4434b");
        assertion.assertAll();
    }
}
