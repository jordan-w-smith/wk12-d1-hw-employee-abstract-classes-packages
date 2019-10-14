import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    private static final double DELTA = 0.01;

    @Before
    public void before() {
        director = new Director("Frank", 11111, 80000, 50000, "Fun");
    }

    @Test
    public void canGetName() {
        assertEquals("Frank", director.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals(11111, director.getNationalInsuranceNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(80000, director.getSalary(), DELTA);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(20000);
        assertEquals(100000, director.getSalary(), DELTA);
    }

    @Test
    public void canPayBonus() {
        assertEquals(800, director.payBonus(director.getSalary()), DELTA);
    }

    @Test
    public void canGetDepartment() {
        assertEquals("Fun", director.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(50000, director.getBudget(), DELTA);
    }

}
