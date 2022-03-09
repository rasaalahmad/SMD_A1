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
public class Batsman extends Cricketer implements IBatsman {
    
    private int score;
    private int Batsmanranking;

    public Batsman(String name, int age, String nat) {
        super(name, age, nat);
    }
    

    @Override
    public void print()
    {
       System.out.println("\n\tBatsman Details\nScore: "+ 
               score + "\nBatsman Ranking: "+ Batsmanranking + "\n"); 
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int getBatsmanRanking() {
        return Batsmanranking;
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
        return Batsmanranking;
    }

    @Override
    public void setBatsmanranking(int Batsmanranking) {
        this.Batsmanranking = Batsmanranking;
    }
   
    
    
}
