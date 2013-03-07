package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk
 */
public class UpdateRelationshipWithHeadHouse implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:257");
        CustomerData.CUSTOMER.getCustomer().setRelationshipWHouseholder(Integer.parseInt(input[1]));
        return 0;

    }

}
