/*
 */

package com.mycompany.salarycalculator;

/**
 *
 */
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hourly rate: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        double salary = calculateSalary(hourlyRate, hoursWorked);
        System.out.println("Total salary: $" + salary);

        scanner.close();
    }

    public static double calculateSalary(double hourlyRate, double hoursWorked) {
        if(hourlyRate > 0 && hoursWorked > 0){
            double baseSalary = hourlyRate * hoursWorked;
            double overtimeRate = 1.5 * hourlyRate;
            double overtimeHours = Math.max(0, hoursWorked - 40);
            double overtimePay = overtimeHours * overtimeRate;
    
            return baseSalary + overtimePay;
        }else{
            System.out.println("the app not accept the negative values");
            return 0;
        }
    }
}
