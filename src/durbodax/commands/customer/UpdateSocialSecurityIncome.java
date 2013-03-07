package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk
 */
public class UpdateSocialSecurityIncome implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:263");
        CustomerData.CUSTOMER.getCustomer().setSocialSecurityIncome(Integer.parseInt(input[1]));
        return 0;

    }


}
