package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk Seddon
 */
public class UpdateGender implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:234");
        CustomerData.CUSTOMER.getCustomer().setGender(Integer.parseInt(input[1]));
        return 0;
    }

}
