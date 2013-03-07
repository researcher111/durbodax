package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk Seddon
 */
public class UpdateHoursWorkedPerWeek implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:235");
        CustomerData.CUSTOMER.getCustomer().setWorkHours(Integer.parseInt(input[1]));
        return 0;
    }
}
