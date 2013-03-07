package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk Sedddon
 */
public class UpdateEducationLevel implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:227");

        CustomerData.CUSTOMER.getCustomer().setEducationLevel(Integer.parseInt(input[1]));
        return 0;

    }


}
