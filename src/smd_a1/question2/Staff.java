/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd_a1.question2;

/**
 *
 * @author Win 10 Pro
 */
public class Staff extends Person {
    // id , role, dept, sal,exp
    public String emp_id;
    public String role;
    public String dept;
    public float salary;
    public int experience;
    
    
    @Override
    public String Register(int uid) {
        return "Staff registered successfully with id " + uid;
    }

    @Override
    public String Perform(String duty) {
        return "This employ perform " + duty + " task";
    }

    @Override
    public String include(String service) {
       return "Services for this staff members are " + service;
    }

    @Override
    public String like(String item) {
       return "Staff member likes " + item;
    }
    
    public String Attend(String duty)
    {
        return "Duty for this employee is " + duty;
    }
    
    public float getSalary()
    {
        return this.salary; 
    }
    
    public String getPromotion()
    {
        return "The staff member is now promoted";
    }
}
