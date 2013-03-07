package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk Seddon
 */
public class UpdateFamilyUnit implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:230");
        CustomerData.CUSTOMER.getCustomer().setFamilyMembership(Integer.parseInt(input[1]));
        return 0;

    }

}
