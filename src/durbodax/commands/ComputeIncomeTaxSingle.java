/*
 *A class that computes a persons income tax
 * depending on their marital status.
 * 
 */

package durbodax.commands;
import durbodax.daos.*;
import durbodax.customers.*;
import durbodax.customers.Enums.*;
import java.text.*;

/**
 *This class computes the income tax
 * of individuals based on their marital status.
 * This class implements the Command interface
 */
public class ComputeIncomeTaxSingle implements Command{
    private DerbyDAOFactory derbyDAO;
    private CustomerDAO customerDAO;
    private Customer customer;
    private MaritalStatus status;
    private double percent;
    private double total;
    private Double d;
/**
 * Creates a ComputeIncomeTaxSingle object
 * and creates a DAO to connect with the database.
 */
    public ComputeIncomeTaxSingle() {
    	System.out.println("flow:158");
        derbyDAO = new DerbyDAOFactory();
        customerDAO = derbyDAO.getCustomerDAO();
    }

    
/**
 * The execute method computes the income tax of an individual
 * based on their marital status.
 * @param params A String array argument that contains
 * the command name and customer ID number.
 * @return Returns the income tax of the individual.
 * @throws IllegalArgumentException.
 */
    public Object execute(String[] params) {
    	System.out.println("flow:159");
        int id = Integer.parseInt(params[1]);
        if (id <= 0 || id > 88443) {
        	System.out.println("flow:160");
            throw new IllegalArgumentException("Invalid customer ID");
        }

        System.out.println("Validate input parameters");
        System.out.println("Execute function implementation call");


        customer = customerDAO.selectCustomer(id);

        if(customer.getMaritalStatusEnum() == status.NEVER_MARRIED_OR_SINGLE
                || customer.getMaritalStatusEnum() == status.DIVORCED
                || customer.getMaritalStatusEnum() == status.SEPERATED){
            int income = customer.getTotalPersonalIncome();
            System.out.println("flow:161");
            if(income < 8025){
            	System.out.println("flow:162");
                percent = .10;
                total = (income * percent);
                DecimalFormat df = new DecimalFormat("#.##");
                d = new Double(df.format(total));
                displayOutput(d);
                return d;

                
            }
            
            if(income > 8025 && income < 32550){
            	System.out.println("flow:163");
                percent = .15;
                total = ((income * percent) + 802.50);
                DecimalFormat df = new DecimalFormat("#.##");
                d = new Double(df.format(total)); 
                displayOutput(d);
                return d;
            }
            
            if(income > 32550 && income < 78850){
            	System.out.println("flow:164");
                percent = .25;
                total = ((income * percent) + 4481.25);
                DecimalFormat df = new DecimalFormat("#.##");
                d = new Double(df.format(total));
                displayOutput(d); 
                return d;
            }

            if(income > 78850 && income < 164550){
            	System.out.println("flow:165");
                percent = .28;
                total = ((income * percent) + 16056.25);
                DecimalFormat df = new DecimalFormat("#.##");
                d = new Double(df.format(total));
                displayOutput(d); 
                return d;
            }

            if(income > 164550 && income < 357700){
            	System.out.println("flow:166");
                percent = .33;
                total = ((income * percent) + 40052.25);
                DecimalFormat df = new DecimalFormat("#.##");
                d = new Double(df.format(total));
                displayOutput(d);
                return d;
            }

            if(income > 357700){
            	System.out.println("flow:167");
                percent = .35;
                total = ((income * percent) + 103791.75);
                DecimalFormat df = new DecimalFormat("#.##");
                d = new Double(df.format(total));
                displayOutput(d);
                return d;
            }

        }
        else{
            if(customer.getMaritalStatusEnum() == status.MARRIED_SPOUSE_PRESENT){
            	System.out.println("flow:168");
                int income = customer.getTotalPersonalIncome();
                
                if(income < 16050){
                System.out.println("flow:169");
                percent = .10;
                total = (income * percent);
                DecimalFormat df = new DecimalFormat("#.##");
                d = new Double(df.format(total));
                displayOutput(d);
                return d;


            }

            if(income > 16050 && income < 65100){
            	System.out.println("flow:170");
                percent = .15;
                total = ((income * percent) + 1605);
                DecimalFormat df = new DecimalFormat("#.##");
                d = new Double(df.format(total));
                displayOutput(d);
                return d;
            }

            if(income > 65100 && income < 131450){
            	System.out.println("flow:171");
                percent = .25;
                total = ((income * percent) + 8962.50);
                DecimalFormat df = new DecimalFormat("#.##");
                d = new Double(df.format(total));
                displayOutput(d);
                return d;
            }

            if(income > 131450 && income < 200300){
            	System.out.println("flow:172");
                percent = .28;
                total = ((income * percent) + 25550);
                DecimalFormat df = new DecimalFormat("#.##");
                d = new Double(df.format(total));
                displayOutput(d);
                return d;
            }

            if(income > 200300 && income < 357700){
            	System.out.println("flow:173");
                percent = .33;
                total = (((income * percent) + 44828)*10)/10;
                DecimalFormat df = new DecimalFormat("#.##");
                d = new Double(df.format(total));
                displayOutput(d);
                return d;
            }

            if(income > 357700){
            	System.out.println("flow:174");
                percent = .35;
                total = ((income * percent) + 96770);
                DecimalFormat df = new DecimalFormat("#.##");
                d = new Double(df.format(total));
                displayOutput(d);
                return d;
            }
            }
            
        }
        d = new Double(0);
        displayOutput(d);
        return d;
    }


        private void displayOutput(Double d) {
        	System.out.println("flow:175");
        System.out.println("Income Tax: " + Double.toString(d));

    }

}
