package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk
 */
public class UpdateWeeksWorkedPerYear implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:271");
        CustomerData.CUSTOMER.getCustomer().setWeeksWorkedPerYear(Integer.parseInt(input[1]));
        return 0;

    }

}
