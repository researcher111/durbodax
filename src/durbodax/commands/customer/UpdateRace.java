package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk
 */
public class UpdateRace implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:256");
        CustomerData.CUSTOMER.getCustomer().setRace(Integer.parseInt(input[1]));
        return 0;

    }

}
