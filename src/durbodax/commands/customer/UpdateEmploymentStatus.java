package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk Seddon
 */
public class UpdateEmploymentStatus implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:229");
        CustomerData.CUSTOMER.getCustomer().setEmploymentStatus(Integer.parseInt(input[1]));
        return 0;
    }
}
