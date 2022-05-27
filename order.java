/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.*;
/**
 *
 * @author lenovo
 */
public class order {
    ArrayList<items> purchased_list = new ArrayList<>();
    ArrayList<items> returned_list = new ArrayList<>();
    
    public order(items p,items r){
        
         for(int i=0;i<purchased_list.size();i++)
            purchased_list.add(i,p);
        int tracker=9;
        for(int i=0;i<tracker;i++)
             returned_list.add(i,r);
    }
   
    
    
   
    
}
