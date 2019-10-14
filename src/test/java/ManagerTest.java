import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;
    private static final double DELTA = 0.01;

    @Before
    public void before() {
        manager = new Manager("John", 1234, 1000, "Finance" );
    }

    @Test
    public void canGetName() {
        assertEquals("John", manager.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals(1234, manager.getNationalInsuranceNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(1000, manager.getSalary(), DELTA);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(500);
        assertEquals(1500, manager.getSalary(), DELTA);
    }

    @Test
    public void canPayBonus() {
        assertEquals(10, manager.payBonus(manager.getSalary()), DELTA);
    }




}
