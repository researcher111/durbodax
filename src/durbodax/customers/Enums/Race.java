package durbodax.customers.Enums;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;

/**
 *
 * @author Kirk Seddon
 */
public enum Race {

    //See Race Table
    White(1), 
    BLACK(2), 
    AMERICAN_INDIAN(3), 
    CHINESE(4), 
    JAPANESE(5), 
    OTHER_ASIA_PAC(6), 
    OTHER_RACE(7);
    
    
    private static final Map<Integer, Race> lookup = new HashMap<Integer, Race>();
    private int code;
    
    static {
        
        for(Race race : EnumSet.allOf(Race.class)) {
        	System.out.println("flow:356");
            lookup.put(race.getCode(), race);
            
        }
        
    }
    
    private Race(int code) {
    	System.out.println("flow:357");
        this.code = code;
        
    }
    
    public int getCode() {
    	System.out.println("flow:358");
        return code;
        
    }
    
    public static Race getRace(int code) {
    	System.out.println("flow:359");
        return lookup.get(code);
        
    }
     
}