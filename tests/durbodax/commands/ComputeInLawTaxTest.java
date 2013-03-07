/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package durbodax.commands;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fszot
 */
public class ComputeInLawTaxTest {

    public ComputeInLawTaxTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of execute method, of class ComputeInLawTax.
     */
    @Test
    public void testExecute() {
    	//This exact individuals do not exist in the data
    	//replacing value idea with a random individual from the database
    	
        System.out.println("execute");

        String params = "ComputeInLawTax 737"; //1->737
        String[] test = params.split(" ");
        ComputeInLawTax instance = new ComputeInLawTax();
        Object expResult = 0;
        Object result = instance.execute(test);
        assertEquals(expResult, result);


        String params2 = "ComputeInLawTax 33486"; //Out of Range
        test = params2.split(" ");
        expResult = 500;
        result =instance.execute(test);
        assertEquals(expResult, result);


      

        
    // TODO review the generated test code and remove the default call to fail.

        // TODO review the generated test code and remove the default call to fail.
        
    }

   

  


}