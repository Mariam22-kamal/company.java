package javaapplication3;
import java.util.*;
/**
 *
 * @author lenovo
 */
public class customer extends person {
    double Balance, Order_price;
    ArrayList<order> list= new ArrayList<>();
    private int array_size;
    public customer(int id, int age, String phone,String add, String name, double balance, double price,order d){
        super(id, age, phone,add, name);
    this.Balance= balance;
    this.Order_price=discount_rate();
    this.array_size=list.size();
     for(int i=0;i<list.size();i++)
            list.add(i,d);
    }
    public void remove_order(order d){
        
            list.remove(d);
    
    }
    public double discount_rate()
    {
        double final_price= this.Order_price-(0.1*(this.Order_price+this.array_size));
        return final_price;
    }
}
