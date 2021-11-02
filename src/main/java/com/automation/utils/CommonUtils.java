package com.automation.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.waitForVisible;

public class CommonUtils {
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)");
    }

    public static void clickOnElement(WebElement element) {
        waitForVisible(element);
        element.click();
    }

    public static void sendKeysTo(WebElement element, String text){
        waitForVisible(element);
        element.clear();
        element.sendKeys(text);
    }
    public static String getValue(WebElement element){
        waitForVisible(element);
        String elementValue = element.getText();
        return elementValue;
    }
    public static int getIntValue(WebElement element, int value) {
        String elementValue = getValue(element);
        String[] arrofstr = elementValue.split("$");
        int temp = Integer.parseInt(arrofstr[0]);
        return temp;
    }
    public static int addValue(int value1, int value2){
        int AddTotal = value1 + value2;
        return AddTotal;

    }
}
