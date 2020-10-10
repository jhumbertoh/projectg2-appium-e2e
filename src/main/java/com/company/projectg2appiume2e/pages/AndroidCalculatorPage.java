package com.company.projectg2appiume2e.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AndroidCalculatorPage {

    private WebDriver driver;

    //Numbers
    private By btnZero = By.xpath("//android.widget.Button[@text='0']");
    private By btnOne = By.xpath("//android.widget.Button[@text='1']");
    private By btnTwo = By.xpath("//android.widget.Button[@text='2']");
    private By btnThree = By.xpath("//android.widget.Button[@text='3']");
    private By btnFour = By.xpath("//android.widget.Button[@text='4']");
    private By btnFive = By.xpath("//android.widget.Button[@text='5']");
    private By btnSix = By.xpath("//android.widget.Button[@text='6']");
    private By btnSeven = By.xpath("//android.widget.Button[@text='7']");
    private By btnEight = By.xpath("//android.widget.Button[@text='8']");
    private By btnNine = By.xpath("//android.widget.Button[@text='9']");

    //Operators
    private By btnAdd = By.id("com.android.calculator2:id/op_add");
    private By btnSub = By.id("com.android.calculator2:id/op_sub");
    private By btnMul = By.id("com.android.calculator2:id/op_mul");
    private By btnDiv = By.id("com.android.calculator2:id/op_div");
    private By btnEqu = By.id("com.android.calculator2:id/eq");

    //Result
    private By txtResult = By.xpath("//android.widget.TextView[contains(@resource-id, 'id/result')]");

    public AndroidCalculatorPage(WebDriver driver){
        this.driver = driver;
    }


    public void calculate(String operator1, String operator2, String operation){

        clickOnCalcNumber(operator1);
        clickOnOperation(operation);
        clickOnCalcNumber(operator2);

        driver.findElement(btnEqu).click();
    }

    public void clickOnOperation(String operation){

        switch (operation.toUpperCase()){
            case "PLUS":
                driver.findElement(btnAdd).click();
                break;
            case "SUBTRACTION":
                driver.findElement(btnSub).click();
                break;
            case "MULTIPLICATION":
                driver.findElement(btnMul).click();
                break;
            case "DIVISION":
                driver.findElement(btnDiv).click();
                break;
            default:
                throw new IllegalStateException("The option " +operation.toUpperCase()+ " is not present");
        }
    }

    public void clickOnCalcNumber(String number){
        for (char digit : number.toCharArray()){
            clickNumber(digit);
        }
    }

    public void clickNumber(Character num){

        if(num.equals('0')){
            driver.findElement(btnZero).click();
        }else if(num.equals('1')){
            driver.findElement(btnOne).click();
        }
        else if(num.equals('2')){
            driver.findElement(btnTwo).click();
        }
        else if(num.equals('3')){
            driver.findElement(btnThree).click();
        }
        else if(num.equals('4')){
            driver.findElement(btnFour).click();
        }
        else if(num.equals('5')){
            driver.findElement(btnFive).click();
        }
        else if(num.equals('6')){
            driver.findElement(btnSix).click();
        }
        else if(num.equals('7')){
            driver.findElement(btnSeven).click();
        }
        else if(num.equals('8')){
            driver.findElement(btnEight).click();
        }
        else if(num.equals('9')){
            driver.findElement(btnNine).click();
        }
    }

    public String getResult(){
        return driver.findElement(txtResult).getText();
    }

}