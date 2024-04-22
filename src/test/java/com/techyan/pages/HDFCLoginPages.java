package com.techyan.pages;

import com.techyan.utils.CommonUtil;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HDFCLoginPages extends PageObject{

	@FindBy(xpath = "//*[text()='Download App']")
	private WebElementFacade ELEMENTS_BUTTON;

	public void navigateToElementsPage() {
		CommonUtil.moveToElement(getDriver(), ELEMENTS_BUTTON);
		ELEMENTS_BUTTON.click();
	}
}
