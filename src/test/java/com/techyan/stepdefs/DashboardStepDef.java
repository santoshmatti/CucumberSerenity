package com.techyan.stepdefs;

import java.util.Map;

import org.junit.Assert;

import com.techyan.steps.HDFCLoginSteps;
import com.techyan.steps.StepsDashboard;
import com.techyan.steps.StepsElementPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DashboardStepDef {


    @Steps
    StepsDashboard stepDashboard;
    @Steps
    StepsElementPage stepsElementPage;
    @Steps
    HDFCLoginSteps loginSteps;

    @Given("^(?:.*) has launched the webpage$")
    public void sanHasLaunchedTheWebpage() {
        System.out.println("Web application is launched");
        stepDashboard.launchThePage();
    }

    @Then("^(?:.*) should be able to access the elements$")
    public void heShouldBeAbleToAccessTheElements() {
        System.out.println("Has accessed the page");
        Assert.assertEquals("abc", "abc");
    }

    @When("^(?:.*) enters text value \"(.*)\"$")
    public void heEntersTextValue(String text) {
        System.out.println("Entered:" + text);
    }

    @Then("^(?:.*) text value should be submitted for the page$")
    public void heTextValueShouldBeSubmittedForThePage() {
        System.out.println("Page is submitted");
    }

    @When("^(?:.*) enters valid credentials to login page$")
    public void heEntersValidCredentialsToLoginPage(DataTable credential) {
        Map<String, String> cred = credential.asMap();
        System.out.println(cred.get("UserName"));
        System.out.println(cred.get("Password"));
    }

    @Then("user should be navigated to the right home page")
    public void userShouldBeNavigatedToTheRightHomePage() {
        stepDashboard.verifyHomePage();
    }

    @Then("user should be able to enter text to the webpage")
    public void userShouldBeAbleToEnterTextToTheWebpage() {
        stepsElementPage.verifySubmisson();
    }

    @When("user select edit text fields to interact")
    public void userSelectEditTextFieldsToInteract() {
        stepDashboard.navigateToElementsPage();
        stepsElementPage.selectTextFields();
        stepsElementPage.submitFirstName();
    }
    
    @When("he should select polic id to login")
    public void hdfcLogin() {
    	loginSteps.hdfcLogin();
    }
}
