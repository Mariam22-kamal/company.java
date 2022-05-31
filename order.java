/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_PRJ;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
import java.util.*;
import java.util.HashMap;
import  java.util.ArrayList;
/**
 *
 * @author lenovo
 */
public class order {
    HashMap<items,Integer> purchased_list = new HashMap<>();
    ArrayList<items> item_list = new ArrayList<>();
    
    public order(items p, int quantity, int size){
        
         for(int i=0;i<size;i++)
            purchased_list.put(p,quantity);
            item_list.add(p);
      
    }
   public order(items p, int quantity){
        
            purchased_list.put(p,quantity);
            item_list.add(p);
   }
    public double calprice(int size)
    {
        int total_order_price;
        //items i=new items();
        for( int i: purchased_list.values())
        {
           //purchased_list.values(i));
           System.out.println("key: " + i + " value: " + purchased_list.values(i));
//purchased_list.getValue(i);
        }
        return 887;
    }
        
   
    
}