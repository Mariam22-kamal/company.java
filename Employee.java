/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_PRJ;

import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public abstract class Employee extends Person {
        
    int Index;
    final double Insuranse=2000.00;
    double salary;
    double Taxes;
    double rate;
    float work_hours;
    float Overtime;
    int Vacation =0;
    ////////////////////////////////////////////////////////////////////////////
    
    String Occupation;
    static int No_Of_Retiree;
    
    public abstract double CalcSalary(double Taxes,float Rate, float Work_Hours, float Overtime);
    public abstract boolean CalcVacation(int Vacation, int Requested_Vacation);
    public int No_of_retiree(ArrayList<Employee> Employee_List){
        var Number_Of_Employees=(int)(Employee_List.size());
                
        for(int i=0;i>Number_Of_Employees;i++)
        {
            Employee temporary=new Part_Time();
            temporary=Employee_List.get(i);
            if(temporary.Year_Of_Birth==60)
                No_Of_Retiree++;
            
            
        }
return No_Of_Retiree; }

    public Employee(int Index, double salary, double Taxes, float rate, float work_hours, float Overtime, int Vacation, int ID, int Year_Of_Birth, String Phone_No, String Address, String Name, String Occupation) {
        super(ID, Year_Of_Birth, Phone_No, Address, Name);
        this.Index=Index;
        this.salary = salary;
        this.Taxes = Taxes;
        this.rate = rate;
        this.work_hours = work_hours;
        this.Overtime = Overtime;
        this.Vacation = Vacation;
        this.Occupation = Occupation;
    }
    
    
    
    
}
