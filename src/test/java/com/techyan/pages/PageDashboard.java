package com.techyan.pages;

import com.techyan.utils.CommonUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static org.assertj.core.api.Assertions.assertThat;

@DefaultUrl("/")
public class PageDashboard extends PageObject {

    @FindBy(xpath="//h5[contains(.,'Elements')]")
    private WebElementFacade ELEMENTS_BUTTON;



    public void verifyHomePage() {
        String pageTitle = getDriver().getTitle();
        String pageURL = getDriver().getCurrentUrl();
        assertThat(pageTitle).isEqualTo("DEMOQA");
        assertThat(pageURL).isEqualTo("https://demoqa.com/");
    }

    public void navigateToElementsPage()
    {
        CommonUtil.moveToElement(getDriver(),ELEMENTS_BUTTON);
        ELEMENTS_BUTTON.click();
    }

}
