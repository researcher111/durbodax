package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk
 */
public class UpdateSpousesLocation implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:265");
        CustomerData.CUSTOMER.getCustomer().setSpouseLocationInHouse(Integer.parseInt(input[1]));
        return 0;

    }

}
