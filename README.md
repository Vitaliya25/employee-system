This is management system for a company that needs to handle different types of employees and their roles. 
In this system, employees have different functions and responsibilities, such as Developers, Managers, and Designers.
Each type of employee has specific attributes and behaviors, but there are also common elements for all employees.

This system is impelmented with the following requirements:
Part 1: Coding in Kotlin

Abstract Class Employee:  
Define an abstract class Employee with the following attributes and methods:  
Attributes: name (String) and salary (Double).  
Abstract Methods:  
work(): defines each employee's specific tasks.  
calculateAnnualBonus(): returns the annual bonus based on the type of employee (leave the method without specific logic for now).  
Concrete Method:  
details(): prints the employee's name and salary.  
2. Derived Classes:  
Implement the following classes that inherit from Employee and override the abstract methods:  
Developer:  
Override work() to print "Writing and reviewing code.".  
Override calculateAnnualBonus() to return a bonus of 10% of the salary.  
Manager:  
Override work() to print "Supervising the team and planning projects.".  
Override calculateAnnualBonus() to return a bonus of 20% of the salary.  
Designer:  
Override work() to print "Creating and optimizing visual design.".  
Override calculateAnnualBonus() to return a bonus of 15% of the salary.  
3. Interface Evaluable:  
Define an interface Evaluable with a method:  
evaluatePerformance(): prints a generic evaluation for any type of employee.  
