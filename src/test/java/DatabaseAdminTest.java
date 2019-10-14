import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    private static final double DELTA = 0.01;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Brenda", 88888, 8000);
    }

    @Test
    public void canGetName() {
        assertEquals("Brenda", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals(88888, databaseAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(8000, databaseAdmin.getSalary(), DELTA);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(3000);
        assertEquals(11000, databaseAdmin.getSalary(), DELTA);
    }

    @Test
    public void canPayBonus() {
        assertEquals(80, databaseAdmin.payBonus(databaseAdmin.getSalary()), DELTA);
    }

}
