/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lib;

/**
 * The Workers class serves as a demonstration class for creating and interacting with Employee and Manager objects.
 * It contains a main method that showcases the creation of instances of the Employee and Manager classes,
 * as well as demonstrating the use of various methods to retrieve and modify employee details.
 *
 * The class includes examples of creating an employee with user input, 
 * creating a normal employee with specified details,
 * and creating a manager with additional functionalities.
 * 
 * @author KIMUTAI
 */
public class Workers extends Employee{

    /**
     * The main method serves as the entry point for the Workers class.
     * It demonstrates the creation of Employee and Manager objects, showcasing their details and interactions.
     *
     * @param args The command-line arguments (unused in this implementation).
     */
    public static void main(String[] args) {
        
        //Create an Employee basing on user input
        System.out.println("Create A New Employee");
        Employee newEmp = new Employee();
        newEmp.getDetails();
        
        //Creating a normal Employee with specified details
        System.out.println("Create A Normal Employee");
        Employee emp1 = new Employee("Allan Kimutai", "Male", "AI & Process Automation", 1996, 123, 111777.55);
        emp1.getDetails();
        
        //Creating a manager (Has additional functionalities)
        System.out.println("Create An Employee Who Is A Manager");
        Manager mngr1 = new Manager("Ra'Asis Master", "Male", "Administration", 1990, 001, 197888.50);
        mngr1.getDetails();
        
        //Demonstrates Manager-specific functionalities
        mngr1.changeDept(newEmp);
        mngr1.adjustSalary(emp1);
        
        //Display details of modified employees
        newEmp.getDetails();
        emp1.getDetails();
    }
    
}
