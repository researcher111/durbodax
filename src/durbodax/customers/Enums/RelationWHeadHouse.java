package durbodax.customers.Enums;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;

/**
 *
 * @author Kirk Seddon
 */
public enum RelationWHeadHouse {

    //See RELATE Table
    HOUSEHOLDER(1), 
    SPOUSE(2), 
    CHILD(3), 
    CHILD_IN_LAW(4), 
    PARENT(5), 
    PARENT_IN_LAW(6),
    SIBLING(7), 
    SIBLING_IN_LAW(8), 
    GRANDCHILD(9), 
    OTHER_RELATIVES(10), 
    PARTNER_FRIEND_VISITOR(11),
    OTHER_NON_RELATIVES(12), 
    INMATES(13);
    
    private static final Map<Integer, RelationWHeadHouse> lookup = new HashMap<Integer, RelationWHeadHouse>();
    private int code;
    
    static {
        
        for(RelationWHeadHouse relationship : EnumSet.allOf(RelationWHeadHouse.class)) {
        	System.out.println("flow:360");
            lookup.put(relationship.getCode(), relationship);
            
        }
        
    }
    
    private RelationWHeadHouse(int code) {
    	System.out.println("flow:361");
        this.code = code;
        
    }
    
    public int getCode() {
    	System.out.println("flow:362");
        return code;
        
    }
    
    public static RelationWHeadHouse getRelationship(int code) {
    	System.out.println("flow:363");
        return lookup.get(code);
        
    }
    
}
