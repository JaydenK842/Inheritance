import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryWorkerTest {

    SalaryWorker s1;

    @BeforeEach
    void setUp() {
        s1 = new SalaryWorker("Jayden", "Knight", "000001", "Mr.", 2006, 11.75, 52);
    }

    @Test
    void setAnnualSalary() {
        s1.setAnnualSalary(56);
        assertEquals(56, s1.getAnnualSalary());
    }
}
