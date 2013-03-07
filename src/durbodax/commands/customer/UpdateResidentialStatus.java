package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk
 */
public class UpdateResidentialStatus implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:260");
        CustomerData.CUSTOMER.getCustomer().setResidentialStatus(Integer.parseInt(input[1]));
        return 0;

    }

}
