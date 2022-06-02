/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_PRJ;
import java.time.Year;
/**
 *
 * @author Omar
 */
public abstract class Person {
   int ID;
   int Year_Of_Birth;
   int Age;
   String Phone_No;
   String Address;
   String Name;       

    public Person(int ID, int Year_Of_Birth, String Phone_No, String Address, String Name) {
        this.ID = ID;
        this.Year_Of_Birth = Year_Of_Birth;
        this.Phone_No = Phone_No;
        this.Address = Address;
        this.Name = Name;
    }
   public void CalcAge()
   {
       Year current_year=Year.now();
       int temp=current_year.getValue();
       Age=temp-Year_Of_Birth;
   
   }
   
}
