/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

/**
 *
 * @author moha7150
 */
public class Person implements Comparable{
    private String gender,name;
    private int age;
    public Person(String n,String g,int a){
        name = n;age = a;gender=g;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String s){
        gender = s;
    }
    public void setName(String s){
        name = s;
    }
    public void setAge(int a){
        age = a;
    }

    @Override
    public int compareTo(Object t) {
        Person other = (Person)t;
        
    }
}
