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
public class AllRounder extends Cricketer implements IBatsman, IBowler {
    
    public int ranking;

    public AllRounder(String name, int age, String nat) {
        super(name, age, nat);
    }
    
    @Override
    public void print()
    {
        super.print();
        System.out.println("\n\tAll-Rounder details\nAll-Rounder Ranking: "+ ranking); 
        IBatsman.super.print();
        IBowler.super.print();
    }
    
    public void setRanking(int rank)
    {
        this.ranking = rank;
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

    @Override
    public int getBatsmanRanking() {
        return IBatsman.super.getBatsmanRanking();
    }

    @Override
    public int getBowlerRanking() {
        return IBowler.super.getBowlerRanking();
    }
}
