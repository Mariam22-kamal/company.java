/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_PRJ;
import java.util.*;
/**
 *
 * @author lenovo
 */
public class customer extends Person {
    double Balance, Order_price;
    ArrayList<order> list= new ArrayList<>();
    private int array_size;
    public customer(int id, int age, String phone,String add, String name, double balance, double price,order d){
        super(id, age, phone,add, name);
    this.Balance= balance;
    this.Order_price= discount_rate();
    this.array_size=list.size();
     for(int i=0;i<list.size();i++)
            list.add(i,d);
    }
    public customer()
    {}
    public double discount_rate()
    {
        double final_price= this.Order_price-(0.1*(this.Order_price+this.array_size));
        return final_price;
    }
    
   
}