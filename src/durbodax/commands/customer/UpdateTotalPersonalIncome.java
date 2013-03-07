package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk
 */
public class UpdateTotalPersonalIncome implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:267");
        CustomerData.CUSTOMER.getCustomer().setTotalPersonalIncome(Integer.parseInt(input[1]));
        return 0;

    }

}
