package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk Seddon
 */
public class UpdateMovedInStatus implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:244");
        CustomerData.CUSTOMER.getCustomer().setMovedInCode(Integer.parseInt(input[1]));
        return 0;
    }

}
