package com.ecom.sports;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyITestListener.class)
public class Example1_ITestListener {

    Employee emp = null;

    @Test
    public void T1_Pass(){
        System.out.println("T1_Pass is Running");
        emp = new Employee();
    }

    @Test
    public void T2_Fail(){
        System.out.println("T1_Fail is Running");
        emp = null;
        emp.GetEmployeeData();
    }
}


//  Listeners (are not Fixtures) (Also not present in Junit)
//    ITestListener
//    IReporter
//    WebDriverEventListener - specific to Selenium

