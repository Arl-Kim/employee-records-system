# Employee Management System

This project implements a simple Employee Management System in Java, consisting of three classes: `Employee`, `Manager`, and `Workers`. The system allows for the creation of employees, including normal employees and managers, and demonstrates basic interactions between them.

## Classes

### 1. Employee

The `Employee` class represents a basic employee with attributes such as name, gender, department, year of birth, file number, and salary. It includes methods to calculate and display salary details and general employee information.

### 2. Manager

The `Manager` class extends the `Employee` class and represents a managerial employee. It includes additional functionalities specific to managers, such as handling department changes, adjusting salaries, and providing details about the managerial role.

### 3. Workers

The `Workers` class serves as a demonstration class, showcasing the creation and interaction of `Employee` and `Manager` objects. It includes a `main` method that demonstrates the use of different constructors and methods to showcase the functionalities of the system.

## Usage

To run the project and observe the Employee Management System in action, you can use the provided `Workers` class. Execute the `main` method to create instances of employees and managers, and see how the system handles various scenarios.

```bash
java Workers
