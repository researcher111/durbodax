package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk Seddon
 */
public class InitCustomerData implements Command {


    public Object execute(String[] input) {
    	System.out.println("flow:220");
        //reset customer data
        CustomerData.CUSTOMER.initCustomerData();

        return 0;

    }

}
