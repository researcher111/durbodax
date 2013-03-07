package durbodax.commands;

import durbodax.customers.*;
import durbodax.daos.*;
/**
 * ComputeBplTravel calculates a travel amount based on BirthPlace
 * @author gbeckenbaugh
 */
public class ComputeBplTravel implements Command {

    /**
     * default constructor
     */
    public ComputeBplTravel() {}

    /**
     * execute - main processing for the Command
     * @param params - String[] from command line
     * @return retObj - Object containing the results
     */
    public Object execute(String[] params) {
    	System.out.println("flow:136");
        int customerId = 0;
        int travelAmt = 0;
        Object retObj = new Object();

        Customer c;
        String bpl = null;

        customerId = Integer.parseInt(params[1]);
        CustomerDAO custDAO = DAOFactory.getDAOFactory().getCustomerDAO();

        c = custDAO.selectCustomer(customerId);
        if (c != null){
        	System.out.println("flow:137");
            bpl = c.getBirthplace().toLowerCase();
            if (bpl.contains("europe")){
            	System.out.println("flow:138");
                travelAmt = 500;
            }else if (bpl.contains("south america")){
            	System.out.println("flow:139");
                travelAmt = 300;
            }else if (bpl.contains("africa")){
            	System.out.println("flow:140");
                travelAmt = 1000;
            }else if (bpl.contains("asia")){
            	System.out.println("flow:141");
                travelAmt = 888;
            }
            retObj = travelAmt;
             System.out.println("ComputeBplTravel amount for customer id: " +
                Integer.toString(c.getId()) + " = " + Integer.toString(travelAmt));
        } else {
        	System.out.println("flow:142");
             System.out.println("Customer: " + customerId + " not Found");
             retObj = null;
        }
        return retObj;
    }
}
