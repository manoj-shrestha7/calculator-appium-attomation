package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class CalculatorScreen  extends BasePOMpage{
           


    @AndroidFindBy(id = "com.google.android.calculator:id/digit_1")
    private AndroidElement button1;
   
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_1")
    private AndroidElement button2;
   
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_3")
    private AndroidElement button3;
   
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_4")
    private AndroidElement button4;
   
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_5")
    private AndroidElement button5;
   
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_6")
    private AndroidElement button6;
   
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_7")
    private AndroidElement button7;
   
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_8")
    private AndroidElement button8;
    
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_9")
    private AndroidElement button9;
   
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_0")
    private AndroidElement button0;
   
    @AndroidFindBy(id = "com.google.android.calculator:id/op_add")
    private AndroidElement buttonPlus;
   
    @AndroidFindBy(id = "com.google.android.calculator:id/eq")
    private AndroidElement buttonEqual;

    public CalculatorScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
   
    public void clickButton_1()
    {
     
            button1.click();
    }
   
    public void clickButton_2()
    {
     
            button2.click();
    }
   
    public void clickPlusButton()
    {
            buttonPlus.click();
    }
}