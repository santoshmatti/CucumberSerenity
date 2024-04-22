package com.techyan.steps;

import com.techyan.pages.PageDashboard;
import com.techyan.utils.CommonUtil;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;


public class StepsDashboard {

    PageDashboard pageDashboard;

    @Step("Launch the web page")
    public void launchThePage() {
        pageDashboard.open();
    }

    @Step(" verifying page title and page url")
    public void verifyHomePage() {
        pageDashboard.verifyHomePage();
    }

    @Step("User has navigated to the elements page")
    public void navigateToElementsPage() {
        pageDashboard.navigateToElementsPage();
    }
}
