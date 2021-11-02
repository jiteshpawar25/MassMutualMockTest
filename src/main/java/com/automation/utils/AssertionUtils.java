package com.automation.utils;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static com.automation.utils.CommonUtils.getValue;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.waitForVisible;

public class AssertionUtils {
    public static void assertPresent(WebElement element) {
        waitForVisible(element);
        Assert.assertTrue(String.format("Element %s should be displayed !!!", element.getText()), element.isDisplayed());
    }
    public static void assertPageTitle(String expected) {
        String actualTitle = getDriver().getTitle();
        Assert.assertTrue(String.format("Actual text is %s and expected text is %s", actualTitle  , expected), actualTitle.contains(expected));
    }
    public static void assertEquals(WebElement element, String expected) {
        waitForVisible(element);
        Assert.assertTrue(String.format("Actual text is %s and expected text is %s", element.getText(), expected), element.getText().contains(expected));
    }
    public static void isCharPresent(WebElement element, char name, int position){
        String elementValue = getValue(element);
        char value = elementValue.charAt(0);
        Assert.assertSame(elementValue+" is a currency value", value,name);
    }
    public static void CheckValue(int temp, int value, String operator){
        if(operator=="greaterthan") {
            Assert.assertTrue("Value" + temp+"is greater than" +value, temp > value);
        }
        else if(operator=="lessthan") {
            Assert.assertTrue("Value" + temp+"is less than" +value, temp < value);
        }
        else if(operator=="equal") {
            Assert.assertTrue("Value" + temp+"is equal to" +value, temp == value);
        }
        else if(operator=="notequal") {
            Assert.assertTrue("Value" + temp+"is not equal to" +value, temp != value);
        }
    }
}
