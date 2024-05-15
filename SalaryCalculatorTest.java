import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SalaryCalculatorTest {

    
    public void testCalculateSalary_noOvertime() {
        double hourlyRate = 20.0;
        double hoursWorked = 40.0;
        double expectedSalary = 800.0;

        double actualSalary = SalaryCalculator.calculateSalary(hourlyRate, hoursWorked);
        assertEquals(expectedSalary, actualSalary, 0.01);
    }

    
    public void testCalculateSalary_withOvertime() {
        double hourlyRate = 20.0;
        double hoursWorked = 45.0;
        double expectedSalary = 950.0; // 800 + 150 (5 hours overtime at 1.5x rate)

        double actualSalary = SalaryCalculator.calculateSalary(hourlyRate, hoursWorked);
        assertEquals(expectedSalary, actualSalary, 0.01);
    }

    
    public void testCalculateSalary_zeroHours() {
        double hourlyRate = 20.0;
        double hoursWorked = 0.0;
        double expectedSalary = 0.0;

        double actualSalary = SalaryCalculator.calculateSalary(hourlyRate, hoursWorked);
        assertEquals(expectedSalary, actualSalary, 0.01);
    }

    
    public void testCalculateSalary_negativeHours() {
        double hourlyRate = 20.0;
        double hoursWorked = -5.0;
        double expectedSalary = -100.0;

        double actualSalary = SalaryCalculator.calculateSalary(hourlyRate, hoursWorked);
        assertEquals(expectedSalary, actualSalary, 0.01);
    }
}
