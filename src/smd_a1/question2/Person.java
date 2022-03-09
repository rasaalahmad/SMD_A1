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
public abstract class Person {

    public int Aadhar_id;
    public String Name;
    public String Addres;
    public int phone;
    public String profession;
    
    
    public abstract String Register(int uid);
    public abstract String Perform(String duty);
    public abstract String include(String service);
    public abstract String like(String item);

}
