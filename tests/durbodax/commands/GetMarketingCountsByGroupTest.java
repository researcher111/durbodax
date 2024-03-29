package durbodax.commands;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import durbodax.dtos.MarketingResponseDTO;

/**
 * GetMarketingCountsByGroupTest
 * @author gbeckenbaugh
 */
public class GetMarketingCountsByGroupTest {

    ArrayList <MarketingResponseDTO> mArray;

    public GetMarketingCountsByGroupTest() {
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
     * testExecute1 Tests execute method, of class GetMarketingCountsByGroup
     * using no 'ALL' parameters
     */
    @Test
    public void testExecute1() {
        System.out.println("execute1");
        String[] params = new String[7];
        GetMarketingCountsByGroup instance = new GetMarketingCountsByGroup();
        params[0] = "GetMarketingCountsByGroup";
        params[1] = "TOP";          //top or bottom
        params[2] = "5";            //x number to return
        params[3] = "10-50";        //age range
        params[4] = "20000-60000";  //income range
        params[5] = "1";            //birthplace code 1=Alabama
        params[6] = "1";            //marital status 1=Married Spouse Present
        Object testObj = instance.execute(params);
        mArray = (ArrayList)testObj;
        //test number of rows coming back
        int result = mArray.size();
        int expResult = 1;
        assertEquals(expResult, result);
        //test income in 1st row
        result = mArray.get(0).getCount();
        expResult = 34;
        assertEquals(expResult, result);
    }
     /**
     *  testExecute2 tests execute method, of class GetMarketingCountsByGroup
     * using 'ALL' parameter for Birthplace
     */
    @Test
    public void testExecute2() {
        System.out.println("execute2");
        String[] params = new String[7];
        GetMarketingCountsByGroup instance = new GetMarketingCountsByGroup();
        //test1
        params[0] = "GetMarketingCountsByGroup";
        params[1] = "TOP";          //top or bottom
        params[2] = "10";           //x number to return
        params[3] = "10-50";        //age range
        params[4] = "10000-50000";  //income range
        params[5] = "ALL";          //ALL birthplaces
        params[6] = "1";            //marital status 1=Married Spouse Present
        Object testObj = instance.execute(params);
        mArray = (ArrayList)testObj;
        //test number of rows coming back
        int result = mArray.size();
        int expResult = 10;
        assertEquals(expResult, result);
        result = mArray.get(0).getCount();
        expResult = 3303;
        assertEquals(expResult, result);
    }
    /**
     * testExecute3 tests execute method, of class GetMarketingCountsByGroup
     * when no results are found
     */
    @Test
    public void testExecute3() {
        System.out.println("execute3");
        String[] params = new String[7];
        GetMarketingCountsByGroup instance = new GetMarketingCountsByGroup();
        //test1
        params[0] = "GetMarketingCountsByGroup";
        params[1] = "TOP";          //top or bottom
        params[2] = "10";           //x number to return
        params[3] = "1-1";          //age range
        params[4] = "10000-50000";  //income range
        params[5] = "ALL";          //ALL birthplaces
        params[6] = "1";            //marital status 1=Married Spouse Present
        Object testObj = instance.execute(params);
        mArray = (ArrayList)testObj;
        //test number of rows coming back
        int result = mArray.size();
        int expResult = 0;
        assertEquals(expResult, result);

    }
}