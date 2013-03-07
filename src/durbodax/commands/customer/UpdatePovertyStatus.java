package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk
 */
public class UpdatePovertyStatus implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:255");
        CustomerData.CUSTOMER.getCustomer().setPovertyStatus(Integer.parseInt(input[1]));
        return 0;

    }


}
