package durbodax.customers.Enums;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;

/**
 *
 * @author Kirk Seddon
 */
public enum VeteranStatus {

    //See VETSTAT Table
    NA(0),
    NO_SERVICE(1),
    YES(2),
    NOT_ASCERTAINED(9);

    private static final Map<Integer, VeteranStatus> lookup = new HashMap<Integer, VeteranStatus>();
    private int code;
    
    static {
        
        for(VeteranStatus status : EnumSet.allOf(VeteranStatus.class)) {
        	System.out.println("flow:385");
            lookup.put(status.getCode(), status);
            
        }
        
    }
    
    private VeteranStatus(int code) {
    	System.out.println("flow:386");
        this.code = code;
        
        
    }
    
    public int getCode() {
    	System.out.println("flow:387");
        return code;
        
    }
    
    public static VeteranStatus getStatus(int code) {
    	System.out.println("flow:388");
        return lookup.get(code);
        
    }

}