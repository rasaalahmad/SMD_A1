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
public class Technician extends Staff {
    public String techType;
    
    public String Maintain(String lab)
    {
        return "Technician manages " + lab;
    }
    
    public String install(String system)
    {
        return "Technincian installs " + system;
    }
}
