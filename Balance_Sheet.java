/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;


import java.util.ArrayList;


/**
 *
 * @author Omar
 */
public final class balance_sheet {

double Total_Revenue;//no_item_sold*selling_price
double Net_Profit;//rev-manufacosr
   public double Cal_total_cost(ArrayList<customer> Customers_List)
   {
       customer iterator = new customer();
       
       int item_quantity=0;
       int No_Of_Customers=Customers_List.size();
       int No_Of_Orders=iterator.list.size();
       double Total_Cost=0;
       for(int i=0;i<No_Of_Customers;i++)                                       //for loop to run through each customer
       {
           iterator=Customers_List.get(i);
           for(int j=0;i<No_Of_Orders;i++)                                      //for loop to run through orders in the each customer  
           {
                  Total_Cost+=iterator.list.get(j).total_order_cost;
                  Total_Revenue+=iterator.list.get(j).total_order_price;
               
           }  
       }
        Net_Profit=Total_Revenue-Total_Cost;
       return Net_Profit;
   }
}
