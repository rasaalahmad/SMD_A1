/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Win 10 Pro
 */
public class main {
    
    public static void main(String args[])
    {
        AllRounder allrounder=new AllRounder("Rasaal", 20, "Pakistan");
        allrounder.ranking=2;
        allrounder.print();
        
        
        Batsman ar2=new Batsman("Rasaal Ahmad",  20 ,"Pakistan");
       ar2.setBatsmanranking(3);
       ar2.print();
    }
    
}
