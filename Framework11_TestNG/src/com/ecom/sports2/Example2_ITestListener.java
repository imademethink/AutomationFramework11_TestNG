package com.ecom.sports2;

import com.ecom.sports.Employee;
import org.testng.annotations.Test;

public class Example2_ITestListener {

    Employee emp = null;

    @Test
    public void T21_Pass(){
        System.out.println("T21_Pass is Running");
        emp = new Employee();
    }

    @Test
    public void T22_Fail(){
        System.out.println("T22_Fail is Running");
        emp = null;
        emp.GetEmployeeData();
    }
}
