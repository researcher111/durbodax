package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk Seddon
 */
public class UpdateSchoolStatus implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:261");
        CustomerData.CUSTOMER.getCustomer().setSchoolStatus(Integer.parseInt(input[1]));
        return 0;

    }


}
