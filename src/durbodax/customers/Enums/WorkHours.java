package durbodax.customers.Enums;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;

/**
 *
 * @author Kirk Seddon
 */
public enum WorkHours {

    //See HRSWORK2 Table
    NA(0),
    _1_TO_14_HRS(2),
    _15_TO_29_HRS(3),
    _30_TO_24_HRS(4),
    _40_HRS(5),
    _41_TO_48_HRS(6),
    _49_TO_59_HRS(7),
    _60_PLUS_HRS(8);

    private static final Map<Integer, WorkHours> lookup = new HashMap<Integer, WorkHours>();
    private int code;
    
    static {
        
        for(WorkHours hours : EnumSet.allOf(WorkHours.class)) {
        	System.out.println("flow:393");
            lookup.put(hours.getCode(), hours);
            
        }
        
    }
    
    private WorkHours(int code) {
    	System.out.println("flow:394");
        this.code = code;
        
        
    }
    
    public int getCode() {
    	System.out.println("flow:395");
        return code;
        
    }
    
    public static WorkHours getWorkHours(int code) {
    	System.out.println("flow:396");
        return lookup.get(code);
        
    }


}
