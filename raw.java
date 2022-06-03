package javaapplication3;
import java.util.*;
import java.time.LocalDate;

public class raw_material extends items {
    ArrayList<raw_material> list_raw= new ArrayList<>();
     
    public raw_material(double cost,int amount ,String barcode,String production,int PAO){
        super(cost,amount ,barcode, production, PAO);
    }
    
    public  void add_material(raw_material r){
        list_raw.add(r);
    }
    public void remove_material(raw_material r){
        list_raw.remove(r);
    }
    
    
    public String cal_expire_date()
    {
         LocalDate production = LocalDate.parse(this.production_date);
		LocalDate expiring = production.plusMonths(this.PAO); 
                String e=expiring.toString();
                return e;
    }

}
