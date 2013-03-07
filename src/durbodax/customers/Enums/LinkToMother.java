package durbodax.customers.Enums;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;

/**
 *
 * @author Kirk Seddon
 */
public enum LinkToMother {

    NO_LINK(0),
    UNAMBIGUOUS_MOTHER_LINK(1),
    DAUGHTER_GRANDCHILD_LINK(2),
    PRECEDING_FEMALE(3),
    PRECEDING_FEMALE_SURNAME(4),
    DAUGHTER_GRANDCHILD_SURVIVING(5),
    PRECEDING_FEMALE_SURVIVING(6),
    STEP_MOTHER(7);

    private static final Map<Integer, LinkToMother> lookup = new HashMap<Integer, LinkToMother>();
    private int code;

    static {

        for(LinkToMother link : EnumSet.allOf(LinkToMother.class)) {
        	System.out.println("flow:336");
            lookup.put(link.getCode(), link);

        }

    }

    private LinkToMother(int code) {
    	System.out.println("flow:337");
        this.code = code;

    }

    public int getCode() {
    	System.out.println("flow:338");
        return code;

    }

    public static LinkToMother getLink(int code) {
    	System.out.println("flow:339");
        return lookup.get(code);

    }

}