package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk Seddon
 */
public class SaveCustomerData implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:222");
        if(CustomerData.CUSTOMER.getCustomer() != null) {
        	System.out.println("flow:223");
         return CustomerData.CUSTOMER.saveCustomerData();

        }

        return -1;

    }

}
