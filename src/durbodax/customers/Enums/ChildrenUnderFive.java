package durbodax.customers.Enums;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;

/**
 *
 * @author Kirk Seddon
 */
public enum ChildrenUnderFive {

    NO_CHILDREN(0),
    ONE_CHILD(1),
    TWO_CHILDREN(2),
    THREE_CHILDREN(3),
    FOUR_CHILDREN(4),
    FIVE_CHILDREN(5),
    SIX_CHILDREN(6),
    SEVEN_CHILDREN(7),
    EIGHT_CHILDREN(8),
    NINE_PLUS_CHILDREN(9);

    private static final Map<Integer, ChildrenUnderFive> lookup = new HashMap<Integer, ChildrenUnderFive>();
    private int code;

    static {

        for(ChildrenUnderFive children : EnumSet.allOf(ChildrenUnderFive.class)) {
        	System.out.println("flow:309");
            lookup.put(children.getCode(), children);

        }

    }

    private ChildrenUnderFive(int code) {
    	System.out.println("flow:310");
        this.code = code;

    }

    public int getCode() {
    	System.out.println("flow:311");
        return code;

    }

    public static ChildrenUnderFive getNumberChildren(int code) {
    	System.out.println("flow:312");
        return lookup.get(code);

    }

}