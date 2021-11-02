package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.automation.utils.AssertionUtils.assertPageTitle;
import static com.automation.utils.CommonUtils.clickOnElement;
import static com.automation.utils.ConfigUtils.getPropertyByKey;
import static com.automation.utils.DriverUtils.getDriver;

public class ExercisePage {
    public ExercisePage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(className = "Value")
    private WebElement ValuePage;

    public void verifyuserIsOnExercisePage() {
        assertPageTitle(getPropertyByKey("exercisepage.title"));
    }
    public void navigateToValuePage() {
        clickOnElement(ValuePage);
    }
}
