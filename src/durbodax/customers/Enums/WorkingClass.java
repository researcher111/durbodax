package durbodax.customers.Enums;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;

/**
 *
 * @author Kirk Seddon
 */

 public enum WorkingClass { 
     
     //See CLASSWKG Table
     NA(0), 
     SELF_EMPLOYED(1), 
     WAGE_OR_SALARY(2), 
     NEW_WORKER(3), 
     UNEMPLOYED(4);
     
    private static final Map<Integer, WorkingClass> lookup = new HashMap<Integer, WorkingClass>();
    private int code;
    
    static {
        
        for(WorkingClass work : EnumSet.allOf(WorkingClass.class)) {
        	System.out.println("flow:397");
            lookup.put(work.getCode(), work);
            
        }
        
    }
    
    private WorkingClass(int code) {
    	System.out.println("flow:398");
        this.code = code;
        
    }
    
    public int getCode() {
    	System.out.println("flow:399");
        return code;
        
    }
    
    public static WorkingClass getWorkStatus(int code) {
    	System.out.println("flow:400");
        return lookup.get(code);
        
    }
             
 }
