package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk Seddon
 */
public class UpdateCustomerAge implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:226");
       CustomerData.CUSTOMER.getCustomer().setAge(Integer.parseInt(input[1]));
       return 0;

    }
}
