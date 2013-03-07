package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk Seddon
 */
public class UpdateOccupationIncomeScore implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:252");
        CustomerData.CUSTOMER.getCustomer().setOccupationIncomeScore(Integer.parseInt(input[1]));
        return 0;

    }

}
