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
public class SMD_A1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Person student1 = new Student();
        System.out.println(student1.Register(2));
        
        Staff teacher = new Faculty();
        System.out.println(teacher.getPromotion());
        
        Staff technician = new Technician();
        System.out.println(technician.Attend("is to manages lab computers"));
        
        Student pgstd = new PGStudent();
        System.out.println(pgstd.Attend());
        
    }
    
}
