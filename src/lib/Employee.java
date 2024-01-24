/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;

/**
 *The Employee class represents an individual employee with basic information
 * such as name, gender, department, year of birth, file number, and salary.
 * It provides methods to retrieve salary details and general employee information.
 *
 * This class also includes constructors for initializing the instance variables
 * and default constructor for taking input from the user.
 * 
 * 
 * @author KIMUTAI
 */

import java.util.Scanner;

public class Employee {
    protected String name;
    protected String gender;
    protected String dept;
    protected int yob;
    protected int fnumber;
    protected double salary;

    /**
     * Scanner object for taking user input.
     */
    Scanner news = new Scanner(System.in);
    
    /**
     * Constructs an Employee object with the specified parameters.
     *
     * @param name     The name of the employee.
     * @param gender   The gender of the employee.
     * @param dept     The department in which the employee works.
     * @param yob      The year of birth of the employee.
     * @param fnumber  The file number associated with the employee.
     * @param salary   The salary of the employee.
     */
    public Employee(String name, String gender, String dept, int yob, int fnumber, double salary){
        this.name = name;
        this.gender = gender;
        this.dept = dept;
        this.yob = yob;
        this.fnumber = fnumber;
        this.salary = salary;
    }
    
    /**
     * Default constructor for creating an Employee object by taking user input.
     * Prompts the user to enter name, gender, department, year of birth, file number, and salary.
     */
    public Employee(){
        System.out.println("Enter The Name, Gender, Department, Year Of Birth, File Number & Salary Of The Employee");
        name = news.next();
        gender = news.next();
        dept = news.next();
        yob = news.nextInt();
        fnumber = news.nextInt();
        salary = news.nextDouble();
    }
    
    /**
     * Calculates and prints the salary details of the employee, including gross salary, tax, and net pay.
     */
    public void getSalary(){
        double tax = salary * 0.2;
        double net = salary - tax;
        System.out.println("Name: " + name + "\nGross: " + salary + "\nTax: " + tax + "\nNet pay: " + net);
    }
    
    /**
     * Prints general details of the employee, including name, gender, year of birth, department, and gross pay.
     */
    public void getDetails(){
        System.out.println(name + " is " + gender + " born in " + yob + ".\nThey are in " + dept +
                " with gross pay of " + salary);
    }
    
}