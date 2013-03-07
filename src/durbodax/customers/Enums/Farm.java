package durbodax.customers.Enums;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;

/**
 *
 * @author Kirk Seddon
 */
public enum Farm {

    //See Farm Table
    FARM(2), 
    NON_FARM(1);
    
    private static final Map<Integer, Farm> lookup = new HashMap<Integer, Farm>();
    private int code;
    
    static {
        
        for(Farm farm : EnumSet.allOf(Farm.class)) {
        	System.out.println("flow:321");
            lookup.put(farm.getCode(), farm);
            
        }
        
    }
    
    private Farm(int code) {
    	System.out.println("flow:322");
        this.code = code;
        
    }
    
    public int getCode() {
    	System.out.println("flow:323");
        return code;
        
    }
    
    public static Farm getStatus(int code) {
    	System.out.println("flow:324");
        return lookup.get(code);
        
    }
    
}
