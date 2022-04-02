package com.ecom.sports3;

import com.ecom.sports.Employee;
import org.testng.annotations.Test;

public class Example4_IReporter {

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
