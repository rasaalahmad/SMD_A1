/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd_a1;

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
       return null;
    }

    @Override
    public String Perform(String duty) {
        return null;
    }

    @Override
    public String include(String service) {
       return null;
    }

    @Override
    public String like(String item) {
       return null;
    }
    
    public String Attend(String duty)
    {
        return null;
    }
    
    public float getSalary()
    {
        return this.salary; 
    }
    
    public String getPromotion()
    {
        return null;
    }
}
