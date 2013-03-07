package durbodax.customers.Enums;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;

/**
 *
 * @author Kirk Seddon
 */
public enum ResidentialStatus {

    //See MIGRAT5 Table
    NA(0), 
    SAME_HOUSE(1), 
    MOVED_NOT_REPORTED(2), 
    SAME_STATE_COUNTY_DIFF_HOUSE(3),
    SAME_STATE_DIFF_COUNTY(4), 
    DIFF_STATE(5),
    ABROAD(6), 
    SAME_STATE_NOT_REPORTED(7),
    UNKNOWN(8);
    
    private static final Map<Integer, ResidentialStatus> lookup = new HashMap<Integer, ResidentialStatus>();
    private int code;
    
    static {
        
        for(ResidentialStatus resident : EnumSet.allOf(ResidentialStatus.class)) {
        	System.out.println("flow:364");
            lookup.put(resident.getCode(), resident);
            
        }
        
    }
    
    private ResidentialStatus(int code) {
    	System.out.println("flow:365");
        this.code = code;
        
    }
    
    public int getCode() {
    	System.out.println("flow:366");
        return code;
        
    }
    
    public static ResidentialStatus getStatus(int code) {
    	System.out.println("flow:367");
        return lookup.get(code);
        
    }
    
}