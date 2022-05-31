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
public final class Part_Time extends Employee {
    int No_Of_Projects;

    public Part_Time(){}
    
    
    public Part_Time(int index, int No_Of_Projects, double Insuranse, double salary, double Taxes, float rate, float work_hours, float Overtime, int Vacation, int ID, int Year_Of_Birth, String Phone_No, String Address, String Name, String Occupation) {
        super(index, salary, Taxes, rate, work_hours, Overtime, Vacation, ID, Year_Of_Birth, Phone_No, Address, Name, Occupation);
        this.No_Of_Projects = No_Of_Projects;
    }
    
    public double Calsalary(int No_Of_Projects){
        salary=No_Of_Projects*rate;
        return salary;
    }

    @Override
    public boolean CalcVacation(int Vacation, int Requested_Vacation) {
        if (Vacation-Requested_Vacation>=0)
        {
            Vacation=Vacation-Requested_Vacation;
        return true;
        }
        else 
        return false;
        
    }

   /* @Override
    public int No_of_retiree(ArrayList<Employee> Employee_List) {
         var Number_Of_Employees=(int)(Employee_List.size());
                
        for(int i=0;i>Number_Of_Employees;i++)
        {
            Employee temporary=new Part_Time();
            temporary=Employee_List.get(i);
            if(temporary.Year_Of_Birth==60)
                No_Of_Retiree++;
            
            
        }
return No_Of_Retiree; 
    }*/

    @Override
    public double CalcSalary(double Taxes, float Rate, float Work_Hours, float Overtime) {
     return No_Of_Projects*rate;
    }


}
