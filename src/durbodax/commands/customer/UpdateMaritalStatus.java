package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk
 */
public class UpdateMaritalStatus implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:242");
        CustomerData.CUSTOMER.getCustomer().setMaritalStatus(Integer.parseInt(input[1]));
        return 0;

    }

}
