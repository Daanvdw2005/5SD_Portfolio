package be.uantwerpen.sd.labs.lab2.classdiagrams.inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DepartmentOfficerUTest {

    @Test
    void dailySalaryIsBaseSalaryPlusCompanyBonus() {
        DepartmentOfficer officer = new DepartmentOfficer(15, 1, 2);

        double salary = officer.calculateDailySalary();

        assertEquals(17, salary, 0.0001);
    }


}