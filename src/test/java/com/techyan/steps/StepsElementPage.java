package com.techyan.steps;

import com.techyan.pages.PageSelectElement;
import com.techyan.utils.CommonUtil;
import com.techyan.utils.Question;
import com.techyan.utils.SeleniumUtil;
import net.thucydides.core.annotations.Step;

public class StepsElementPage {
    PageSelectElement selectElement;

    @Step("Select Text fields to Edit")
    public void selectTextFields() {
        selectElement.selectTextElementToEdit();
    }

    @Step("Enter and submit FirstName")
    public void submitFirstName() {
        SeleniumUtil.enterText(selectElement.EDIT_USERNAME, "Yadu");
        CommonUtil.moveToElement(selectElement.getDriver(),selectElement.BTN_SUBMIT);
        SeleniumUtil.submit(selectElement.BTN_SUBMIT);
    }

    @Step("Validate submission")
    public void verifySubmisson() {
        Question.verifyText(selectElement.LBL_NAME,"Name:Yadu");
    }
}
