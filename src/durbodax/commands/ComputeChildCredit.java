/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package durbodax.commands;

import durbodax.customers.Customer;
import durbodax.customers.Enums.Sex;
import durbodax.daos.CustomerDAO;
import durbodax.daos.DAOFactory;

/**
 *
 * @author SimmonsD
 */
public class ComputeChildCredit implements Command {


    private boolean suppressOutput = false;


    CustomerDAO customerDAO;

    public ComputeChildCredit()
    {
    	System.out.println("flow:143");
        customerDAO = DAOFactory.getDAOFactory().getCustomerDAO();
    }


    public Object execute(String[] params){
    	System.out.println("flow:144");
        Customer result = customerDAO.selectCustomer(Integer.parseInt(params[1]));
        if(result ==  null) {
        	System.out.println("flow:145");
            if(!suppressOutput) {
            	System.out.println("flow:146");
            	System.out.println("Invalid Customer");
            	}
            return -1;

        }

        Sex gender = result.getGenderEnum();
        switch(gender) {
            case Female:
            	System.out.println("flow:147");
                if(result.getAge() >=16){
                	System.out.println("flow:148");
                    int num = result.getNumChildrenInHouse();

                    if(num <= 5 || num == 7) {
                    	System.out.println("flow:149");
                        int val = (Math.max(num,4) * 100);
                        displayOutput(val);
                        return val;
                    }
                    if(num == 6) {
                    	System.out.println("flow:150");
                        displayOutput(550);
                        return 550;
                    }
                    if(num >= 8) {
                    	System.out.println("flow:151");
                        displayOutput(750);
                        return 750;
                    }
                } else {
                	System.out.println("flow:152");
                    displayOutput(0);
                    return 0;
                }

            default:
                displayOutput(0);
                return 0;
        }
    }

    private void displayOutput(Integer output) {

        if(!suppressOutput) {
        	System.out.println("flow:153");
            System.out.println("Child credit: " + output.toString());

        }

    }

    public void suppressOutput() {
    	System.out.println("flow:154");
        suppressOutput = true;
    }
}
