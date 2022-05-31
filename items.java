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
import java.time.LocalDate;
/**
 *
 * @author lenovo
 */
public class items  {
    double cost, selling_price;
    String barcode_no, production_date;
    private String feedback_status;
    int amount,PAO;
    String expiring_date;
    public items(){}
    public items(double cost,double selprice,int amount ,String barcode,String production,int PAO)
    {
        this.amount=amount;
        this.barcode_no=barcode;
        this.cost=cost;
        this.selling_price=selprice;
        this.production_date=production;
        this.PAO=PAO;
        this.expiring_date= cal_expire_date();
    }
    public items(items t)
    {
        this.amount=t.amount;
        this.barcode_no=t.barcode_no;
        this.cost=t.cost;
        this.selling_price=t.selling_price;
        this.production_date=t.production_date;
        this.expiring_date=t.expiring_date;
        this.PAO=t.PAO;
        this.feedback_status=t.feedback_status;
    }
    
    public String cal_expire_date()
    {
         LocalDate production = LocalDate.parse(this.production_date);
		// Displaying date
		//System.out.println("Date : "+production);
		// Add n months to the date
		LocalDate expiring = production.plusMonths(this.PAO); 
		//System.out.println("New Date : "+expiring);
                String e=expiring.toString();
                return e;
    }

    public String getFeedback_status() {
        return feedback_status;
    }

    public void setFeedback_status(String feedback_status) {
        this.feedback_status = feedback_status;
    }
  
    
}