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
public class Bowler extends Cricketer implements IBowler {
    
    private int wickets;
    private int Bowlernranking;

    public Bowler(String name, int age, String nat) {
        super(name, age, nat);
    }
    

    @Override
    public void print()
    {
       System.out.println("\n\tBowler Details\nWickets: "+ 
               wickets + "\nBowler Ranking: "+ Bowlernranking + "\n"); 
    }

    public int getScore() {
        return wickets;
    }

    public void setScore(int wickets) {
        this.wickets = wickets;
    }

    @Override
    public int getBowlerRanking() {
        return Bowlernranking;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getNationality() {
       return super.getNationality();
    }

    @Override
    public int getAge() {
       return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setNationality(String nat) {
       super.setNationality(nat);
    }
   
    public int getBatsmanranking() {
        return Bowlernranking;
    }

    @Override
    public void setBowlernranking(int Bowlernranking) {
        this.Bowlernranking = Bowlernranking;
    }
   
    
    
}