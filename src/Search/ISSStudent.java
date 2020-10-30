/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;


/**
 *
 * @author moha7150
 */
public class ISSStudent implements Comparable{
    private String name,address;
    private int id;
    public ISSStudent (String n,String a,int i){
    name = n;
    address = a;
    id = i;
    }
    public String getName(){
        return name;
        
    }
    public int getid(){
        return id;
    }
    public String toString(){
        return "Name: \t\t"+ name+ "\nAddress:\t\t"+ address+"\nID:\t\t"+id;
    }
    @Override
    public int compareTo(Object t){
        ISSStudent other = (ISSStudent)t;
        if (this.id > other.getid()) return 1;
        if (this.id < other.getid()) return -1;
        if (this.id == other.getid()) return 0;
        
        return name.compareTo(other.getName());
    }
}
