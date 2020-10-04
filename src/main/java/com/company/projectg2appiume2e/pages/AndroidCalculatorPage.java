package com.company.projectg2appiume2e.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AndroidCalculatorPage {

    private WebDriver driver;

    //Numbers
    private By btnZero = By.xpath("//android.widget.Button[@text='0']");
    private By btnOne = By.xpath("//android.widget.Button[@text='1']");
    private By btnTwo = By.xpath("//android.widget.Button[@text='2']");

    //Operations
    private By btnAdd = By.id("com.android.calculator2:id/op_add");

    private By btnEqu = By.id("com.android.calculator2:id/eq");

    //Result
    private By txtResult = By.xpath("//android.widget.TextView[contains(@resource-id, 'id/result')]");

    public AndroidCalculatorPage(WebDriver driver){
        this.driver = driver;
    }

    //operator1 = 145 ; operator2 = 20; "Suma"
    public void calculate(String operator1, String operator2, String operation){


        //Ingresar Operator 1
        for (char digit : operator1.toCharArray()){
            clickNumber(digit);
        }

        //Ingresar Operacion
        switch (operation.toUpperCase()){
            case "PLUS":
                driver.findElement(btnAdd).click();
                break;
            case "SUBTRACTION":
                break;
        }

        //Ingresar Operator 2
        for (char digit : operator2.toCharArray()){
            clickNumber(digit);
        }

        //Click en el botón igual
        driver.findElement(btnEqu).click();


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
    }

    public String getResult(){
        return driver.findElement(txtResult).getText();
    }

}
