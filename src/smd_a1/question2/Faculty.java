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
public class Faculty extends Staff {
    public String specliazation;
    public String Section;
    public int no_of_students;
    public String Qualification;
    
    public String teach(String course)
    {
        return "This faculty member teaches " + course;
    }
    
    public String Assess(String StudentGrade)
    {
        return "Teacher assess the student grade to " + StudentGrade;
    }
}
