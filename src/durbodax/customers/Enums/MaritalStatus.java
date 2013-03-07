package durbodax.customers.Enums;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;

/**
 *
 * @author Kirk Seddon
 */
public enum MaritalStatus { 
    
    //See MARST Table
    MARRIED_SPOUSE_PRESENT(1), 
    MARRIED_SPOUSE_ABSENT(2), 
    SEPERATED(3), 
    DIVORCED(4),
    WIDOWED(5), 
    NEVER_MARRIED_OR_SINGLE(6);

    private static final Map<Integer, MaritalStatus> lookup = new HashMap<Integer, MaritalStatus>();
    private int code;
    
    static {
        
        for(MaritalStatus maritalStatus : EnumSet.allOf(MaritalStatus.class)) {
        	System.out.println("flow:344");
            lookup.put(maritalStatus.getCode(), maritalStatus);
            
        }
        
    }
    
    private MaritalStatus(int code) {
    	System.out.println("flow:345");
        this.code = code;
        
    }
    
    public int getCode() {
    	System.out.println("flow:346");
        return code;
        
    }
    
    public static MaritalStatus getStatus(int code) {
    	System.out.println("flow:347");
        return lookup.get(code);
        
    }

}
