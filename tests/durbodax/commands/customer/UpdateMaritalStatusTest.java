package durbodax.commands.customer;

import durbodax.customers.CustomerData;
import durbodax.customers.Enums.MaritalStatus;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kirk
 */
public class UpdateMaritalStatusTest {

    public UpdateMaritalStatusTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of execute method, of class UpdateMaritalStatus.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        String[] input = new String[] { "command", "3" };
        UpdateMaritalStatus instance = new UpdateMaritalStatus();
        instance.execute(input);
        
        assertEquals(3, CustomerData.CUSTOMER.getCustomer().getMaritalStatus());
        assertEquals(MaritalStatus.SEPERATED, CustomerData.CUSTOMER.getCustomer().getMaritalStatusEnum());
        
    }

}