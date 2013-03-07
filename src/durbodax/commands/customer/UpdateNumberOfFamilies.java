package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk
 */
public class UpdateNumberOfFamilies implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:248");
        CustomerData.CUSTOMER.getCustomer().setNumFamiliesInHouse(Integer.parseInt(input[1]));
        return 0;

    }

}
