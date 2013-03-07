package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk Seddon
 */
public class UpdateFarmIncome implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:231");
        CustomerData.CUSTOMER.getCustomer().setFarmIncome(Integer.parseInt(input[1]));
        return 0;

    }

}
