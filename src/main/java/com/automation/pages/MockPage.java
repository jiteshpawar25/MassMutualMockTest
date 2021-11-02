package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.automation.utils.AssertionUtils.*;
import static com.automation.utils.CommonUtils.addValue;
import static com.automation.utils.CommonUtils.getIntValue;
import static com.automation.utils.ConfigUtils.getPropertyByKey;
import static com.automation.utils.DriverUtils.getDriver;

public class MockPage {

public MockPage()    {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=’lbl_val_1’]")
    private WebElement Value_1;
    @FindBy(xpath = "//*[@id=’lbl_val_2’]")
    private WebElement Value_2;
    @FindBy(xpath = "//*[@id=’lbl_val_3’]")
    private WebElement Value_3;
    @FindBy(xpath = "//*[@id=’lbl_val_4’]")
    private WebElement Value_4;
    @FindBy(xpath = "//*[@id=’lbl_val_5’]")
    private WebElement Value_5;
    @FindBy(xpath = "//*[@id=’lbl_ttl_val’]")
    private WebElement Total_Balance;
    @FindBy(xpath = "//*[@id=’txt_val_1’]")
    private WebElement Amount_1;
    @FindBy(xpath = "//*[@id=’txt_val_2’]")
    private WebElement Amount_2;
    @FindBy(xpath = "//*[@id=’txt_val_3’]")
    private WebElement Amount_3;
    @FindBy(xpath = "//*[@id=’txt_val_4’]")
    private WebElement Amount_4;
    @FindBy(xpath = "//*[@id=’txt_val_5’]")
    private WebElement Amount_5;
    @FindBy(xpath = "//*[@id=’txt_ttl_val’]")
    private WebElement Total_Value;

    public void ValidatetheValues(){
        assertEquals(Amount_1, getPropertyByKey("Amount_1"));
        assertEquals(Amount_2, getPropertyByKey("Amount_2"));
        assertEquals(Amount_3, getPropertyByKey("Amount_3"));
        assertEquals(Amount_4, getPropertyByKey("Amount_4"));
        assertEquals(Amount_5, getPropertyByKey("Amount_5"));
    }

    public void VerifyAllElementsPresent() {
        assertPresent(Value_1);
        assertPresent(Value_2);
        assertPresent(Value_3);
        assertPresent(Value_4);
        assertPresent(Value_5);
        assertPresent(Total_Balance);
    }
    public void CheckCurrencySymbol(){
        isCharPresent(Value_1,'$',0);
        isCharPresent(Value_2,'$',0);
        isCharPresent(Value_3,'$',0);
        isCharPresent(Value_4,'$',0);
        isCharPresent(Value_5,'$',0);
        isCharPresent(Total_Value,'$',0);
    }
    public void CheckValueGreaterThanZero(){
        int temp1=getIntValue(Value_1,0);
        CheckValue(temp1, 0, "greaterthan");
        int temp2=getIntValue(Value_2,0);
        CheckValue(temp2, 0,"greaterthan");
        int temp3=getIntValue(Value_3,0);
        CheckValue(temp3,0,"greaterthan");
        int temp4=getIntValue(Value_4,0);
        CheckValue(temp4,0,"greaterthan");
        int temp5=getIntValue(Value_5,0);
        CheckValue(temp5,0,"greaterthan");
        int temp6=getIntValue(Total_Value,0);
        CheckValue(temp6,0,"greaterthan");
    }

    public void CheckTotalBalance(){
        int temp1=getIntValue(Value_1,0);
        int temp2=getIntValue(Value_2,0);
        int temp3=getIntValue(Value_3,0);
        int temp4=getIntValue(Value_4,0);
        int temp5=getIntValue(Value_5,0);
        int temp6=getIntValue(Total_Value,0);

        int total1 = addValue(temp1,temp2);
        int total2 = addValue(total1,temp3);
        int total3 = addValue(total2,temp4);
        int total4 = addValue(total3,temp5);
        CheckValue(total4,temp6,"equal");

    }
    }
