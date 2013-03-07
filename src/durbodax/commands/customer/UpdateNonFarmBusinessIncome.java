package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk
 */
public class UpdateNonFarmBusinessIncome implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:245");
        CustomerData.CUSTOMER.getCustomer().setNonFarmBusinessIncome(Integer.parseInt(input[1]));
        return 0;

    }

}
