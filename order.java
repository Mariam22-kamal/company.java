package javaapplication3;
import java.util.*;
/**
 *
 * @author lenovo
 */
public class order {
  
    HashMap<items,Integer> purchased_list = new HashMap<>();
    ArrayList<items> item_list = new ArrayList<>();
    double total_order_price;
    public order(items p, int quantity, int size){
        
         for(int i=0;i<size;i++)
            purchased_list.put(p,quantity);
            item_list.add(p);
      
    }
   public order(items p, int quantity){
        
            purchased_list.put(p,quantity);
            item_list.add(p);
   }
  public void remove_item_list(items p, int quantity){
        
            purchased_list.remove(p,quantity);
            item_list.remove(p);
   }
    public double calprice(int size)
    {
        purchased_list.forEach((key, Value) -> {
            total_order_price+=(key.selling_price*Value);   
        });
        
        return total_order_price;
        
    }
        
   
    
}
