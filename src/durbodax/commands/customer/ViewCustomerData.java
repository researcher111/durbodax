package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk Seddon
 */
public class ViewCustomerData implements Command {

    public Object execute(String[] params) {
    	System.out.println("flow:274");
        CustomerData.CUSTOMER.displayCustomerData();
        return 0;

    }

}
