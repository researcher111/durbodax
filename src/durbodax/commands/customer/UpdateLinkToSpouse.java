package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk
 */
public class UpdateLinkToSpouse implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:241");
        CustomerData.CUSTOMER.getCustomer().setLinkToSpouse(Integer.parseInt(input[1]));
        return 0;

    }

}
