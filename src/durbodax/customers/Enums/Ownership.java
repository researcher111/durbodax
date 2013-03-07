package durbodax.customers.Enums;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;

/**
 *
 * @author Kirk Seddon
 */
public enum Ownership { 
    
    //See OWNERSHIP Table
    NA(0), 
    OWNED(1), 
    RENTED(2);
    
    private static final Map<Integer, Ownership> lookup = new HashMap<Integer, Ownership>();
    private int code;
    
    static {
        
        for(Ownership owner : EnumSet.allOf(Ownership.class)) {
        	System.out.println("flow:352");
            lookup.put(owner.getCode(), owner);
            
        }
        
    }
    
    private Ownership(int code) {
    	System.out.println("flow:353");
        this.code = code;
        
    }
    
    public int getCode() {
    	System.out.println("flow:354");
        return code;
        
    }
    
    public static Ownership getOwnershipStatus(int code) {
    	System.out.println("flow:355");
        return lookup.get(code);
        
    }

}
