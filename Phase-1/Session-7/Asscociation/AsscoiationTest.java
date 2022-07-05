package com.simplilearn.inheritance;

public class AsscoiationTest {

	// Main driver method
    public static void main(String[] args)
    {
 
        // Creating objects of bank and Employee class
        Bank bank = new Bank("ICICI");
        Employee emp = new Employee("Nikunj");
        Employee emp1 = new Employee("Rorisang");
 
        // Print and display name and
        // corresponding bank of employee
        System.out.println(emp1.getEmployeeName()
                           + " is employee of "
                           + bank.getBankName());
    }
}
