package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk Seddon
 */
public class UpdateSchoolType implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:262");
        CustomerData.CUSTOMER.getCustomer().setSchoolType(Integer.parseInt(input[1]));
        return 0;

    }

}
