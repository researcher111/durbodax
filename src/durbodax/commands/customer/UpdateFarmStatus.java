package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk Seddon
 */
public class UpdateFarmStatus implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:232");
        CustomerData.CUSTOMER.getCustomer().setFarmStatus(Integer.parseInt(input[1]));
        return 0;

    }


}
