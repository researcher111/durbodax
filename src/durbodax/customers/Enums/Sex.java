package durbodax.customers.Enums;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;

/**
 *
 * @author Kirk Seddon
 */
public enum Sex {

    //See SEX Table
    Male(1),                                                      
    Female(2);                                                      

    
    private static final Map<Integer, Sex> lookup = new HashMap<Integer, Sex>();
    private int code;
    
    static {
        
        for(Sex sex : EnumSet.allOf(Sex.class)) {
        	System.out.println("flow:377");
            lookup.put(sex.getCode(), sex);
            
        }
        
    }
    
    private Sex(int code) {
    	System.out.println("flow:378");
        this.code = code;
        
        
    }
    
    public int getCode() {
    	System.out.println("flow:379");
        return code;
        
    }
    
    public static Sex getGender(int code) {
    	System.out.println("flow:380");
        return lookup.get(code);
        
    }

}
