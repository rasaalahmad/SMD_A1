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
public class Student extends Person {
    public String Student_id;
    public String major;
    public int year;
    public int semester;
    public String college;
    public int grade;

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


    public int getGrade()
    {
        return this.grade;
    }
    
    public String Attend()
    {
        return null;
    }
    
    public String learn()
    {
        return null;
    }
}