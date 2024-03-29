package durbodax.customers.Enums;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;

/**
 *
 * @author Kirk Seddon
 */
public enum WeeksWorkedPerYear {

    //See WKSWORK2 Table
    NA(0),
    _1_TO_13_WEEKS(1),
    _14_TO_26_WEEKS(2),
    _27_TO_39_WEEKS(3),
    _40_TO_47_WEEKS(4),
    _48_TO_47_WEEKS(5),
    _50_TO_52_WEEKS(6);
            
    private static final Map<Integer, WeeksWorkedPerYear> lookup = new HashMap<Integer, WeeksWorkedPerYear>();
    private int code;
    
    static {
        
        for(WeeksWorkedPerYear weeks : EnumSet.allOf(WeeksWorkedPerYear.class)) {
        	System.out.println("flow:389");
            lookup.put(weeks.getCode(), weeks);
            
        }
        
    }
    
    private WeeksWorkedPerYear(int code) {
    	System.out.println("flow:390");
        this.code = code;
        
        
    }
    
    public int getCode() {
    	System.out.println("flow:391");
        return code;
        
    }
    
    public static WeeksWorkedPerYear getWeeksWorked(int code) {
    	System.out.println("flow:392");
        return lookup.get(code);
        
    }

}
