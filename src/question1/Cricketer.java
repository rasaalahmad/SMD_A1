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
public class Cricketer implements ICricketer {
    
    private String name;
    private int age;
    private String nationality;

    public Cricketer(String name,int age,String nat)
    {
        this.name = name;
        this.age= age;
        this.nationality = nat;
    }
    
    @Override
    public void print()
    {
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Nationality : "+ nationality);
    }
    
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getNationality() {
       return this.nationality;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void setAge(int age) {
        this.age=age;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void setNationality(String nat) {
       this.nationality=nat;
    }
}
