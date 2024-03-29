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
public class ComputeIncomeTaxSingleTest {

    public ComputeIncomeTaxSingleTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of execute method, of class ComputeIncomeTaxSingle.
     */
    @Test
    public void testExecute() {
    	//Clust based reaplacement 

        System.out.println("execute");
        String params = "ComputeIncomeTaxSingle 494"; //22->845
        String[] test = params.split(" ");
        ComputeIncomeTaxSingle instance = new ComputeIncomeTaxSingle();
        Object expResult = 247.2;
        Object result = instance.execute(test);
        assertEquals(expResult, result);
        
        System.out.println("execute 2");

        String params2 = "ComputeIncomeTaxSingle 259"; //259->690
        test = params2.split(" ");
        expResult = 5602.5;
        result = instance.execute(test);
        assertEquals(expResult, result);

        
        System.out.println("execute");
        
        String params3 = "ComputeIncomeTaxSingle 7"; //7->740
        test = params3.split(" ");
        expResult = 13938.0;
        result = instance.execute(test);
        assertEquals(expResult, result);

        System.out.println("execute");
        String params4 = "ComputeIncomeTaxSingle 1869"; //Out of Range of top 2000 so random replacement 
        test = params4.split(" ");
        expResult = 39856.25;
        result = instance.execute(test);
        assertEquals(expResult, result);

        System.out.println("execute");
        String params5 = "ComputeIncomeTaxSingle 76291"; //Out of Range of top 2000
        test = params5.split(" ");
        expResult = 112822.53;
        result = instance.execute(test);
        assertEquals(expResult, result);

        System.out.println("execute");
        String params6 = "ComputeIncomeTaxSingle 47622"; //Out of Range of top 2000
        test = params6.split(" ");
        expResult = 238108.45;
        result = instance.execute(test);
        assertEquals(expResult, result);

        System.out.println("execute");
        String params7 = "ComputeIncomeTaxSingle 12"; //12->665
        test = params7.split(" ");
        expResult = 0.0;
        result = instance.execute(test);
        assertEquals(expResult, result);

        System.out.println("execute");
        String params8 = "ComputeIncomeTaxSingle 2"; // 2->897
        test = params8.split(" ");
        expResult = 820.0;
        result = instance.execute(test);
        assertEquals(expResult, result);

        System.out.println("execute");
        String params9 = "ComputeIncomeTaxSingle 18"; //18->690
        test = params9.split(" ");
        expResult = 6116.55;
        result = instance.execute(test);
        assertEquals(expResult, result);

        System.out.println("execute");
        String params10 = "ComputeIncomeTaxSingle 62"; //62->1651
        test = params10.split(" ");
        expResult = 31660.75;
        result = instance.execute(test);
        assertEquals(expResult, result);

        String params11 = "ComputeIncomeTaxSingle 200"; //200->993
        test = params11.split(" ");
        expResult = 80294.48;
        result = instance.execute(test);
        assertEquals(expResult, result);

        System.out.println("execute");
        String params12 = "ComputeIncomeTaxSingle 1449"; //1449->993
        test = params12.split(" ");
        expResult = 117086.12;
        result = instance.execute(test);
        assertEquals(expResult, result);

        System.out.println("execute");
        String params13 = "ComputeIncomeTaxSingle 3501";//Out of range
        test = params13.split(" ");
        expResult = 228941.9;
        result = instance.execute(test);
        assertEquals(expResult, result);

       

      

    // TODO review the generated test code and remove the default call to fail.

    }



    }
