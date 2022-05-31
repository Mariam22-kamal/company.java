/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_PRJ;

//import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public final class FullTime extends Employee {

    @Override
    public double CalcSalary(double Taxes, float Rate, float Work_Hours, float Overtime) {
        salary=Work_Hours*Rate;
        return salary;

    }

    @Override
    public boolean CalcVacation(int Vacation, int Requested_Vacation) {
        int remainder=0;
        remainder=Vacation-Requested_Vacation;
        if (remainder>=0)
        {
            Vacation=remainder;
             return true;
        }
        else 
        return false;    }

   /* @Override
    public int No_of_retiree(ArrayList<Employee> Employee_List) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
    
}
