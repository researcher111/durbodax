package durbodax.customers.Enums;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;

/**
 *
 * @author Kirk Seddon
 */
public enum EducationLevel { 
    
    //See EDUCREC Table
    NA_OR_NONE(0), 
    NONE_OR_PRESCHOOL(1), 
    ELEMENTARY(2), 
    MIDDLE_SCHOOL(3),
    FRESHMEN(4), 
    SOPHMORE(5), 
    JUNIOR(6), 
    SENIOR(7), 
    UNDERGRAD(8), 
    GRADUATE(9);

    private static final Map<Integer, EducationLevel> lookup = new HashMap<Integer, EducationLevel>();
    private int code;
    
    static {
        
        for(EducationLevel education : EnumSet.allOf(EducationLevel.class)) {
        	System.out.println("flow:313");
            lookup.put(education.getCode(), education);
            
        }
        
    }
    
    private EducationLevel(int code) {
    	System.out.println("flow:314");
        this.code = code;
        
    }
    
    public int getCode() {
    	System.out.println("flow:315");
        return code;
        
    }
    
    public static EducationLevel getLevel(int code) {
    	System.out.println("flow:316");
        return lookup.get(code);
        
    }
            
}
