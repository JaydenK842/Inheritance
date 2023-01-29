import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkerTest {

    Worker w1;

    @BeforeEach
    void setUp() {
        w1 = new Worker("Jayden", "Knight", "000001", "Mr.", 2006, 11.75);
    }

    @Test
    void setHourlyPayRate() {
        w1.setHourlyPayRate(12.25);
        assertEquals(12.25, w1.getHourlyPayRate());
    }
}
