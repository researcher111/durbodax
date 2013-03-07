/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package durbodax.commands;

import durbodax.customers.Customer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SimmonsD
 */
public class ComputeChildCreditTest {

    public ComputeChildCreditTest() {
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
     * Test of execute method, of class ComputeChildCredit.
     */
    @Test
    public void testExecute() {
    	//Since the database has been anonymize these exact people don't exit any more
    	//Replace the id's in these test cases with ids of a random persons for the anonymize database
        System.out.println("execute");
        String[] params = {"compute", "49382"}; // 36 -> 49382
        ComputeChildCredit instance = new ComputeChildCredit();
        Object expResult = 400;
        Object result = instance.execute(params);
        assertEquals(expResult, result);
        params[1] = "48441";  //83 -> 48441
        result = instance.execute(params);
        assertEquals(400, result);
        params[1] = "42188"; //88-> 42188
        result = instance.execute(params);
        assertEquals(0,result);
        params[1] = "50683"; //9902 -> 50683
        result = instance.execute(params);
        assertEquals(750, result);
    }
}