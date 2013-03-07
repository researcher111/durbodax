package durbodax.customers.Enums;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;

/**
 *
 * @author Kirk Seddon
 */
public enum SchoolType {

    //See SCHLTYPE Table
    NA(0),
    NOT_ENROLLED(1),
    PUBLIC_SCHOOL(2),
    PRIVATE_SCHOOL(3),
    CHURCH_RELATED(4),
    PAROCHIAL(5),
    OTHER_PRIVATE_1980(6),
    OTHER_PRIVATE_1970(7);
                                                                                     
    private static final Map<Integer, SchoolType> lookup = new HashMap<Integer, SchoolType>();
    private int code;
    
    static {
        
        for(SchoolType schoolType : EnumSet.allOf(SchoolType.class)) {
        	System.out.println("flow:373");
            lookup.put(schoolType.getCode(), schoolType);
            
        }
        
    }
    
    private SchoolType(int code) {
    	System.out.println("flow:374");
        this.code = code;
        
        
    }
    
    public int getCode() {
    	System.out.println("flow:375");
        return code;
        
    }
    
    public static SchoolType getSchoolType(int code) {
    	System.out.println("flow:376");
        return lookup.get(code);
        
    }

}
