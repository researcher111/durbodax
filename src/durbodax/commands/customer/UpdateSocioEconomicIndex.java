package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk
 */
public class UpdateSocioEconomicIndex implements Command {

        public Object execute(String[] input) {
        	System.out.println("flow:264");
            CustomerData.CUSTOMER.getCustomer().setSocioEconomicIndex(Integer.parseInt(input[1]));
            return 0;

        }

}
