package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk
 */
public class UpdateNumberOfFathers implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:249");
        CustomerData.CUSTOMER.getCustomer().setNumFathersInHouse(Integer.parseInt(input[1]));
        return 0;
        
    }

}
