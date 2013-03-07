package durbodax.customers.Enums;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;

/**
 *
 * @author Kirk Seddon
 */
public enum LinkToFather {

    //See POPRULE Table
    NO_LINK(0),
    UNAMBIGUOUS_FATHER_LINK(1),
    SON_GRANDCHILD_LINK(2),
    PRECEDING_MALE(3),
    PRECEDING_MALE_SURNAME(4),
    STEP_FATHER(7);

    private static final Map<Integer, LinkToFather> lookup = new HashMap<Integer, LinkToFather>();
    private int code;

    static {

        for(LinkToFather link : EnumSet.allOf(LinkToFather.class)) {
        	System.out.println("flow:332");
            lookup.put(link.getCode(), link);

        }

    }

    private LinkToFather(int code) {
    	System.out.println("flow:333");
        this.code = code;

    }

    public int getCode() {
    	System.out.println("flow:334");
        return code;

    }

    public static LinkToFather getLink(int code) {
    	System.out.println("flow:335");
        return lookup.get(code);

    }

}