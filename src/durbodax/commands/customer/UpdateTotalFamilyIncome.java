package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk
 */
public class UpdateTotalFamilyIncome implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:266");
        CustomerData.CUSTOMER.getCustomer().setTotalFamilyIncome(Integer.parseInt(input[1]));
        return 0;

    }

}
