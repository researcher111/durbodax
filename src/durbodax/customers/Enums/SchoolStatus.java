package durbodax.customers.Enums;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;

/**
 *
 * @author Kirk Seddon
 */
public enum SchoolStatus {
    
    //See School Table
    NA(0),
    NO(1),
    YES(2),
    MISSING(9);

    private static final Map<Integer, SchoolStatus> lookup = new HashMap<Integer, SchoolStatus>();
    private int code;
    
    static {
        
        for(SchoolStatus schoolStatus : EnumSet.allOf(SchoolStatus.class)) {
        	System.out.println("flow:369");
            lookup.put(schoolStatus.getCode(), schoolStatus);
            
        }
        
    }
    
    private SchoolStatus(int code) {
    	System.out.println("flow:370");
        this.code = code;
        
    }
    
    public int getCode() {
    	System.out.println("flow:371");
        return code;
        
    }
    
    public static SchoolStatus getStatus(int code) {
    	System.out.println("flow:372");
        return lookup.get(code);
        
    }


}
