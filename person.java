/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author lenovo
 */
abstract class person {
    int ID, Age;
    String Phone_no, Adress, Name;
    public person(int id, int age, String phone,String add, String name)
    {
        this.ID=id; this.Age=age; this.Phone_no=phone;this.Adress=add; this.Name=name;
    }
}
