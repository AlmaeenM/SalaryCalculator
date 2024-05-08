 SalaryCalculator is a program written in the Java programming language. It is designed to calculate the total salary of a user based on their hourly rate and hours worked. 
First ,the program asks the user to enter the hourly rate and hours worked using the Scanner class. It then calls the `calculateSalary` method to perform the calculation.
Inside the `calculateSalary` method, the base salary is calculated by multiplying the hourly rate by the hours worked. If the hours worked exceed 40, indicating overtime, the overtime rate is calculated as 1.5 times the hourly rate. The overtime hours are determined by subtracting 40 from the total hours worked. The overtime pay is then calculated by multiplying the overtime hours by the overtime rate.
The total salary is obtained by adding the base salary and the overtime pay. Finally, the program displays the total salary to the user.

