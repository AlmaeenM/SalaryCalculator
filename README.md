# SalaryCalculator
## The SalaryCalculator.java file contains a Java class named SalaryCalculator
which calculates the total salary based on **the hourly rate and hours worked.**


The code begins with the package declaration com.mycompany.salarycalculator, indicating that the code belongs to the "salarycalculator" package in the "com.mycompany" namespace.
The import statement imports the Scanner class from the java.util package, allowing user input to be read from the console.
The **SalaryCalculator** class is declared as a public class.
The main method is the entry point of the program. It creates a new instance of the Scanner class to read user input.
The program prompts the user to enter the hourly rate and hours worked.
The calculateSalary method is called, passing the hourly rate and hours worked as arguments. This method calculates the base salary, overtime rate, overtime hours, and overtime pay.
The total salary is calculated by adding the base salary and overtime pay.
The result is printed to the console as "Total salary: $X", where X represents the calculated salary.
Finally, the scanner is closed to release system resources.