import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    private static final double DELTA = 0.01;

    @Before
    public void before() {
        developer = new Developer("Jimmy", 54321, 5000);
    }

    @Test
    public void canGetName() {
        assertEquals("Jimmy", developer.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals(54321, developer.getNationalInsuranceNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(5000, developer.getSalary(), DELTA);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1000);
        assertEquals(6000, developer.getSalary(), DELTA);
    }

    @Test
    public void canPayBonus() {
        assertEquals(50, developer.payBonus(developer.getSalary()), DELTA);
    }
}
