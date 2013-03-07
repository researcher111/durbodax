package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk Seddon
 */
public class UpdateChildrenUnderFive implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:225");
        CustomerData.CUSTOMER.getCustomer().setNumChildenUnderFiveInHouse(Integer.parseInt(input[1]));
        return 0;

    }

}
