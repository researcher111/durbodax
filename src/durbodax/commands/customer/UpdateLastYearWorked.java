package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk Seddon
 */
public class UpdateLastYearWorked implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:238");
        CustomerData.CUSTOMER.getCustomer().setLastYearWorked(Integer.parseInt(input[1]));
        return 0;

    }

}
