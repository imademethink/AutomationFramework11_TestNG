package com.ecom.sports2;

import com.ecom.sports.Employee;
import org.testng.annotations.Test;

public class Example3_ITestListener {

    Employee emp = null;

    @Test
    public void T31_Pass(){
        System.out.println("T31_Pass is Running");
        emp = new Employee();
    }

    @Test
    public void T32_Fail(){
        System.out.println("T32_Fail is Running");
        emp = null;
        emp.GetEmployeeData();
    }
}
