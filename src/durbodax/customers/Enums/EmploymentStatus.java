package durbodax.customers.Enums;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;

/**
 *
 * @author Kirk Seddon
 */
public enum EmploymentStatus { 
    
    //See EMPSTAT Table
    NA(0), 
    EMPLOYED(1), 
    UNEMPLOYED(2), 
    NOT_IN_LABOR_FORCE(3);
    
    private static final Map<Integer, EmploymentStatus> lookup = new HashMap<Integer, EmploymentStatus>();
    private int code;
    
    static {
        
        for(EmploymentStatus employment : EnumSet.allOf(EmploymentStatus.class)) {
        	System.out.println("flow:317");
            lookup.put(employment.getCode(), employment);
            
        }
        
    }
    
    private EmploymentStatus(int code) {
    	System.out.println("flow:318");
        this.code = code;
        
    }
    
    public int getCode() {
    	System.out.println("flow:319");
        return code;
        
    }
    
    public static EmploymentStatus getStatus(int code) {
    	System.out.println("flow:320");
        return lookup.get(code);
        
    }

}
