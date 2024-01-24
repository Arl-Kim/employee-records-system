/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;

/**
 *The Manager class represents a managerial employee, extending the Employee class.
 * It includes additional functionalities specific to managers, such as handling department changes,
 * adjusting salaries, and providing details about the managerial role.
 *
 * The class inherits basic information from the Employee class, including name, gender, department,
 * year of birth, file number, and salary. 
 * Managers also receive an allowance, and their salary is adjusted accordingly.
 * 
 * 
 * @author KIMUTAI
 */

import java.util.Scanner;

public class Manager extends Employee {
    /**
     * The allowance granted to the manager, calculated as a percentage of the base salary.
     */
    private double allowance;
    
    /**
     * Scanner object for taking user input.
     */
    Scanner scan = new Scanner(System.in);
    
    /**
     * Constructs a Manager object with the specified parameters and calculates the allowance.
     * The base salary is adjusted by adding the allowance.
     *
     * @param name     The name of the manager.
     * @param gender     The gender of the manager.
     * @param dept     The department in which the manager works.
     * @param yob    The year of birth of the manager.
     * @param fnumber   The file number associated with the manager.
     * @param salary  The base salary of the manager.
     */
    public Manager(String name, String gender, String dept, int yob, int fnumber, double salary) {
        super(name, gender, dept, yob, fnumber, salary);
        allowance = salary * 0.1;
        salary = salary + allowance;
    }
}
