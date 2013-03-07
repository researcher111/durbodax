package durbodax.customers.Enums;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;

/**
 *
 * @author Kirk Seddon
 */
public enum LastYearWorked { 
    
    //See YRLASTWK Table
    NA(0), 
    CURRENT_YEAR(10), 
    PREVIOUS_YEAR(20), 
    TWO_YEARS_PRIOR(31), 
    TWO_TO_FIVE_YEARS(32),
    THREE_TO_FIVE_YEARS(33), 
    THREE_TO_SIX_YEARS(34), 
    SIX_TO_TEN_YEARS(35), 
    SEVEN_TO_TEN_YEARS(36),
    TEN_PLUS_YEARS_AGO(40), 
    NEVER_WORKED(50);
    
    private static final Map<Integer, LastYearWorked> lookup = new HashMap<Integer, LastYearWorked>();
    private int code;
    
    static {
        
        for(LastYearWorked lastYear : EnumSet.allOf(LastYearWorked.class)) {
        	System.out.println("flow:329");
            lookup.put(lastYear.getCode(), lastYear);
            
        }
        
    }
    
    private LastYearWorked(int code) {
    	System.out.println("flow:330");
        this.code = code;
        
    }
    
    public int getCode() {
    	System.out.println("flow:331");
        return code;
        
    }
    
    public static LastYearWorked getLastYear(int code) {
     
        return lookup.get(code);
        
    }

}