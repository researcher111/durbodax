package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk
 */
public class UpdateBirthPlace implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:224");
        CustomerData.CUSTOMER.getCustomer().setBirthplace(input[1]);
        return 0;
        
    }

}
