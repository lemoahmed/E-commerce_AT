package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import javax.xml.ws.WebEndpoint;

public class D01_registerStepDef {
    P01_register register=new P01_register();
    @Given("user go to register page")
    public void goRegisterPage()
    {
        register.registerlink().click();
    }
    @When("user select gender")
    public void selectGender()
    {
        register.chooseGender().click();
    }
    @And("^user enter first name \"(.*)\" and last name \"(.*)\"$")
    public void enterFirstNameAndLastName(String firstName,String lastName)
    {
        register.firstName().clear();
        register.firstName().sendKeys(firstName);
        register.lastName().clear();
        register.lastName().sendKeys(lastName);
    }
    @And("user enter date of birth")
    public void enterDateOfBirth()
    {
       Select selectDay=new Select(register.dayDDL());
       Select selectMonth=new Select(register.monthDDL());
       Select selectYear=new Select(register.yearDDL());
       selectDay.selectByVisibleText("10");
       selectMonth.selectByVisibleText("April");
       selectYear.selectByVisibleText("1999");
    }
    @And("^user enter email \"(.*)\" field$")
    public void enterEmail(String Email)
    {
        register.eMail().clear();
        register.eMail().sendKeys(Email);
    }
    @And("^user fills Password fields \"(.*)\" \"(.*)\"$")
    public void enterPassword(String password,String confPassword)
    {
        register.password().clear();
        register.password().sendKeys(password);
        register.confirmPassword().clear();
        register.confirmPassword().sendKeys(confPassword);
    }

    @And("user clicks on register button")
    public void clickRegister() throws InterruptedException {
        register.registerButton().click();
        Thread.sleep(2000);
    }
    @Then("success message is displayed")
    public void successMessage()
    {
        SoftAssert assertion=new SoftAssert();
        assertion.assertEquals(register.registerMessage().getText(),"Your registration completed","failed 1");
        assertion.assertEquals(register.registerMessage().getCssValue("color"),"rgba(76, 177, 124, 1)","failed 2");
        assertion.assertAll();

    }
}
