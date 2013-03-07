/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package durbodax.commands;

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
public class ComputePromoTest {

    public ComputePromoTest() {
    }

    /**
     * Test of execute method, of class ComputePromo.
     */
    @Test
    public void testExecute() {
    	//Replaced cluster individuals for database inorgining orginal
    	//test limitation specified in the comments for a balance and fair appraoch
    	
        System.out.println("execute");
        String[] params = {"test", "test"};
        ComputePromo instance = new ComputePromo();
        instance.suppressOutput();
        params[1] = "215"; //Customer with inctot = 100000 //215->1421
        Object result = instance.execute(params);
        assertEquals(100, result);
        params[1] = "1243";//Customer with inctot = 60000 //672->1243
        result = instance.execute(params);
        assertEquals(50,result);
        params[1] = "1127";//Customer with inctot = 45000 //1005 -> 1127
        result = instance.execute(params);
        assertEquals(10, result);
    }
}