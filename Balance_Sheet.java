/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_PRJ;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Omar
 */
public final class Balance_Sheet {

double Total_Manfucture_Cost; // cost_item+cost_of_raw_material
double Total_Revenue;//no_item_sold*selling_price
double Net_Profit;//rev-manufacosr
   public double Cal_total_cost(ArrayList<customer> Customers_List)
   {
       customer iterator=new customer();
       
       int item_quantity=0;
       int No_Of_Customers=Customers_List.size();
       int No_Of_Orders=0;
       int No_Of_Items=0;
       double Total_Cost=0;
       for(int i=0;i<No_Of_Customers;i++)                                       //for loop to run through each customer
       {
           iterator=Customers_List.get(i);
           for(int j=0;i<No_Of_Orders;i++)                                      //for loop to run through orders in the each customer  
           {
               iterator.list.get(j);
               for (int k=0;k<No_Of_Items;k++)                                  //for loop to run through items in the order
               {
//                   Total_Cost+=iterator.list.get(j).purchased_list.get(k).cost*item_quantity;
               
               
               
               }
           
           }
           
       
               
       }
       
       
       return Total_Cost;
   }
}
