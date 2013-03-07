package durbodax.customers.Enums;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;

/**
 *
 * @author Kirk Seddon
 */
public enum LaborForce { 
    
    //See LABFORCE Table
    NA(0),
    NO(1),
    YES(2);
    
    private static final Map<Integer, LaborForce> lookup = new HashMap<Integer, LaborForce>();
    private int code;
    
    static {
        
        for(LaborForce labor : EnumSet.allOf(LaborForce.class)) {
        	System.out.println("flow:325");
            lookup.put(labor.getCode(), labor);
            
        }
        
    }
    
    private LaborForce(int code) {
    	System.out.println("flow:326");
        this.code = code;
        
    }
    
    public int getCode() {
    	System.out.println("flow:327");
        return code;
        
    }
    
    public static LaborForce getStatus(int code) {
    	System.out.println("flow:328");
        return lookup.get(code);
        
    }

}
