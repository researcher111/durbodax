package durbodax.commands;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kirk Seddon
 */
public class ComputeEmployedMomCreditTest {

    public ComputeEmployedMomCreditTest() {
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
     * Test of execute method, of class ComputeEmployedMomCredit.
     */
    @Test
    public void testExecuteCase1() {
//CLuster based Value replacement here as well
        System.out.println("Executing ComputeEmployedMomCredit Test Case 1");
        String[] params = { "command", "737" }; // 1->737
        ComputeEmployedMomCredit instance = new ComputeEmployedMomCredit();
        Object expResult = (Integer)0;
        Object result = instance.execute(params);
        assertEquals(expResult, result);
    }

    /**
     * Test of execute method, of class ComputeEmployedMomCredit.
     */
    @Test
    public void testExecuteCase2() {
//Random replace here too
        System.out.println("Executing ComputeEmployedMomCredit Test Case 2");
        String[] params = { "command", "958" }; //36->958
        ComputeEmployedMomCredit instance = new ComputeEmployedMomCredit();
        Object expResult = (Integer)400;
        Object result = instance.execute(params);
        assertEquals(expResult, result);
    }


    /**
     * Test of execute method, of class ComputeEmployedMomCredit.
     */
    @Test
    public void testExecuteCase3() {

        System.out.println("Executing ComputeEmployedMomCredit Test Case 3");
        String[] params = { "command", "1147" }; //238->1147
        ComputeEmployedMomCredit instance = new ComputeEmployedMomCredit();
        Object expResult = (Integer)(-100);
        Object result = instance.execute(params);
        assertEquals(expResult, result);
    }

     /**
     * Test of execute method, of class ComputeEmployedMomCredit.
     */
    @Test
    public void testExecuteCase4() {

        System.out.println("Executing ComputeEmployedMomCredit Test Case 4");
        String[] params = { "command", "1178" }; //444->1178
        ComputeEmployedMomCredit instance = new ComputeEmployedMomCredit();
        Object expResult = (Integer)0;
        Object result = instance.execute(params);
        assertEquals(expResult, result);
    }


    /**
     * Test of execute method, of class ComputeEmployedMomCredit.
     */
    @Test
    public void testExecuteCase5() {

        System.out.println("Executing ComputeEmployedMomCredit Test Case 5");
        String[] params = { "command", "692" }; //568->692
        ComputeEmployedMomCredit instance = new ComputeEmployedMomCredit();
        Object expResult = (Integer)400;
        Object result = instance.execute(params);
        assertEquals(expResult, result);
    }

     /**
     * Test of execute method, of class ComputeEmployedMomCredit.
     */
    @Test
    public void testExecuteCase6() {

        System.out.println("Executing ComputeEmployedMomCredit Test Case 6");
        String[] params = { "command", "9821" }; //9821 -> Out of range of top 20000
        ComputeEmployedMomCredit instance = new ComputeEmployedMomCredit();
        Object expResult = (Integer)0;
        Object result = instance.execute(params);
        assertEquals(expResult, result);
    }


}