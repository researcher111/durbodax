package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk
 */
public class UpdateVeteranStatus implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:270");
        CustomerData.CUSTOMER.getCustomer().setVeteranStatus(Integer.parseInt(input[1]));
        return 0;

    }


}
