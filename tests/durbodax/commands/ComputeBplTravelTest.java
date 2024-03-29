package durbodax.commands;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * ComputeBplTest
 * @author gbeckenbaugh
 */
public class ComputeBplTravelTest {

    public ComputeBplTravelTest() {
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
     * testExecute1 - testExecute5
     * Test of execute method, of class ComputeBplTravel with various inputs
     */
    @Test
    public void testExecute1() {
    	//Rewriting base on cluster sim
        System.out.println("execute - Europe");
        String params[] = new String[2];
        ComputeBplTravel instance = new ComputeBplTravel();
        params[0] = "ComputeBplTravel";
        params[1] = "32266"; //Out of selection range i.e to 2000 so not rewriten
        Object result = instance.execute(params);
        Object expResult = 500;
        assertEquals(expResult, result);
    }
    @Test
    public void testExecute2(){
        System.out.println("execute - South America");
        String params[] = new String[2];
        ComputeBplTravel instance = new ComputeBplTravel();
        params[0] = "ComputeBplTravel";
        params[1] = "692"; //421->692
        Object result = (Integer)instance.execute(params);
        Object expResult = 300;
        assertEquals(expResult, result);
    }
    @Test
    public void testExecute3(){
        System.out.println("execute - Africa");
        String params[] = new String[2];
        ComputeBplTravel instance = new ComputeBplTravel();
        params[0] = "ComputeBplTravel";
        params[1] = "1147"; //237-->1147
        Object expResult = 1000;
        Object result = (Integer)instance.execute(params);
        assertEquals(expResult, result);
    }
    @Test
    public void testExecute4(){
        System.out.println("execute - Asia");
        String params[] = new String[2];
        ComputeBplTravel instance = new ComputeBplTravel();
        params[0] = "ComputeBplTravel";
        params[1] = "86701";//Does not exist in current range so not rematched
        Object result = (Integer)instance.execute(params);
        Object expResult = 888;
        assertEquals(expResult, result);
    }
    @Test
    public void testExecute5(){
        System.out.println("execute - No Match");
        String params[] = new String[2];
        ComputeBplTravel instance = new ComputeBplTravel();
        params[0] = "ComputeBplTravel";
        params[1] = "0";//Does not exist in current context so not rematched
        Object result = (Integer)instance.execute(params);
        Object expResult = null;
        assertEquals(expResult, result);
    }
}