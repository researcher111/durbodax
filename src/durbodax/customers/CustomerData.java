package durbodax.customers;

import durbodax.daos.CustomerDAO;
import durbodax.daos.DAOFactory;

/**
 *
 * @author Kirk Seddon
 */
public class CustomerData {

    Customer customer = new Customer();
    public final static CustomerData CUSTOMER = new CustomerData();

    protected CustomerData() {}

    public void initCustomerData() {
    	System.out.println("flow:275");
        customer = new Customer();

    }

    public void loadCustomerData(int customerID) {
    	System.out.println("flow:276");
        CustomerDAO customerDAO = DAOFactory.getDAOFactory().getCustomerDAO();
        this.customer = customerDAO.selectCustomer(customerID);

    }

    public int saveCustomerData() {
    	System.out.println("flow:277");

        CustomerDAO customerDAO = DAOFactory.getDAOFactory().getCustomerDAO();
        return customerDAO.saveCustomer(this.customer);

    }

    public void setCustomer(Customer customer) {
    	System.out.println("flow:278");
        this.customer = customer;

    }

    public Customer getCustomer() {
    	System.out.println("flow:279");
        return this.customer;

    }

    public void displayCustomerData() {
    	System.out.println("flow:280");
        System.out.println("");
        System.out.println("Age: " + Integer.toString(customer.getAge()));

        if(customer.getAgeOfEldestChild() == 99) {
        	System.out.println("flow:281");
            System.out.println("Age of Eldest Child: N/A");

        } else {
        	System.out.println("flow:282");
            System.out.println("Age of Eldest Child: " + Integer.toString(customer.getAgeOfEldestChild()));
        }

        if(customer.getAgeOfYoungestChild() == 99) {
        	System.out.println("flow:283");
            System.out.println("Age of Youngest Child: N/A");

        } else {
        	System.out.println("flow:284");
            System.out.println("Age of Youngest Child: " + Integer.toString(customer.getAgeOfYoungestChild()));

        }

        System.out.println("Education Level: " + customer.getEducationLevelEnum().toString());
        System.out.println("Employment Status: " + customer.getEmploymentStatusEnum().toString());
        System.out.println("Family Unit: " + Integer.toString(customer.getFamilyMembership()));

        if(customer.getFarmIncome() == 999999) {
        	System.out.println("flow:285");
            System.out.println("Farm Income: N/A");

        } else {
        	System.out.println("flow:286");
            System.out.println("Farm Income: " + Integer.toString(customer.getFarmIncome()));

        }

        System.out.println("Farm Status: " + customer.getFarmStatusEnum().toString());
        System.out.println("Father's Location in Household: " + Integer.toString(customer.getFathersLocationInHouse()));
        System.out.println("Gender: " + customer.getGenderEnum().toString());
        System.out.println("Labor Force Participation: " + customer.getLaborForceEnum().toString());
        System.out.println("Last Year Worked: " + customer.getLastYearWorkedEnum().toString());
        System.out.println("Link to Father: " + customer.getLinkToFatherEnum().toString());
        System.out.println("Link to Mother: " + customer.getLinkToMotherEnum().toString());
        System.out.println("Link to Spouse: " + customer.getLinkToSpouseEnum().toString());
        System.out.println("Marital Status: " + customer.getMaritalStatusEnum().toString());
        System.out.println("Mother's Location in Household: " + Integer.toString(customer.getMothersLocationInHouse()));
        System.out.println("Moved In Status: " + customer.getMovedInCodeEnum().toString());

        if(customer.getNonFarmBusinessIncome() == 999999) {
        	System.out.println("flow:287");
            System.out.println("Non-Farm Business Income: N/A");

        } else {
        	System.out.println("flow:288");
            System.out.println("Non-Farm Business Income: " + Integer.toString(customer.getNonFarmBusinessIncome()));

        }

        System.out.println("Number of Children in the House: " + Integer.toString(customer.getNumChildrenInHouse()));
        System.out.println("Number of Children under Five: " + customer.getNumChildrenUnderFiveInHouseEnum().toString());
        System.out.println("Number of Couples in the House: " + customer.getNumCouplesInHouse());

        if(customer.getNumFamiliesInHouse() == 0) {
        	System.out.println("flow:289");
            System.out.println("Number of Families in House: Vacant");

        } else {
        	System.out.println("flow:290");
            System.out.println("Number of Families in House: " + Integer.toString(customer.getNumFamiliesInHouse()));

        }

        System.out.println("Number of Family Members in the House: " + Integer.toString(customer.getNumFamilyMembersInHouse()));
        System.out.println("Number of Fathers in the House: " + Integer.toString(customer.getNumFathersInHouse()));
        System.out.println("Number of Mothers in the House: " + Integer.toString(customer.getNumMothersInHouse()));
        System.out.println("Number of Siblings in the House: " + Integer.toString(customer.getNumSiblingsInHouse()));

        if(customer.getOccupationIncomeScore() == 0) {
        	System.out.println("flow:291");
            System.out.println("Get Occupation Income Score: NA");

        } else {
        	System.out.println("flow:292");
            System.out.println("Get Occupation Income Score: " + Integer.toString(customer.getOccupationIncomeScore()));

        }

        if(customer.getOtherIncome() == 99999) {
        	System.out.println("flow:293");
            System.out.println("Other Income: NA");

        } else {
        	System.out.println("flow:294");
            System.out.println("Other Income: " + Integer.toString(customer.getOtherIncome()));
        }

        System.out.println("Ownership: " + customer.getOwnershipEnum().toString());

        System.out.println("Poverty Threshold: " + Integer.toString(customer.getPovertyStatus()));
        customer.getProbableStepFather();
        customer.getProbableStepMother();
        System.out.println("Race: " + customer.getRaceEnum().toString());
        System.out.println("Get Relationship w House Holder: " + customer.getRelationshipWHouseholderEnum().toString());
        
        if(customer.getRent() == 0) {
        	System.out.println("flow:295");
            System.out.println("Rent: NA");
            
        } else {
        	System.out.println("flow:296");
            System.out.println("Rent: " + Integer.toString(customer.getRent()));
        }
        
        System.out.println("Residence 5 yrs. ago: " + customer.getResidence5YearsAgo());
        System.out.println("Residential Status: " + customer.getResidentialStatusEnum().toString());
        System.out.println("School Status: " + customer.getSchoolStatusEnum().toString());
        System.out.println("School Type: " + customer.getSchoolTypeEnum().toString());

        if(customer.getSocialSecurityIncome() == 9999) {
        	System.out.println("flow:297");
            System.out.println("Social Security Income: NA");

        } else {
        	System.out.println("flow:298");
            System.out.println("Social Security Income: " + Integer.toString(customer.getSocialSecurityIncome()));
        }
        
        if(customer.getSocioEconomicIndex() == 0) {
        	System.out.println("flow:299");
            System.out.println("Socio Economic Index: NA");
            
        } else {
        	System.out.println("flow:300");
            System.out.println("Socio Economic Index: " + Integer.toString(customer.getSocioEconomicIndex()));
        }
        
        System.out.println("Spouse Location in Household: " + Integer.toString(customer.getSpouseLocationInHouse()));

        if(customer.getTotalFamilyIncome() == 9999999) {
        	System.out.println("flow:301");
            System.out.println("Total Family Income: NA");

        } else {
        	System.out.println("flow:302");

            System.out.println("Total Family Income: " + Integer.toString(customer.getTotalFamilyIncome()));
        }

         if(customer.getTotalPersonalIncome() == 9999999) {
        	 System.out.println("flow:303");

            System.out.println("Total Personal Income: NA");

        } else {
        	System.out.println("flow:304");
            System.out.println("Total Personal Income: " + Integer.toString(customer.getTotalFamilyIncome()));

        }

        System.out.println("House Value: " + Integer.toString(customer.getValue()));
        System.out.println("Veteran Status: " + customer.getVeteranStatusEnum().toString());

        if(customer.getWageAndSalaryIncome() == 9999999) {
        	System.out.println("flow:305");

            System.out.println("Total Wage and Salary Income: NA");

        } else {
        	System.out.println("flow:306");
            System.out.println("Total Wage and Salary Income: " + Integer.toString(customer.getWageAndSalaryIncome()));

        }
         if(customer.getWelfareIncome() == 9999999) {
        	 System.out.println("flow:307");
            System.out.println("Total Welfare Income: NA");

        } else {
        	System.out.println("flow:308");
            System.out.println("Total Welfare Income: " + Integer.toString(customer.getWelfareIncome()));

        }

        System.out.println("Working Class Status: " + customer.getWorkClassEnum().toString());
        System.out.println("Hours Worked per Week: " + customer.getWorkHoursEnum().toString());


        System.out.println("Weeks Worked Per Year: " + customer.getWeeksWorkedPerYearEnum().toString());
        System.out.println("Birthplace: " + customer.getBirthplace());
        System.out.println("Customer ID: " + Integer.toString(customer.getId()));

    }
    
}
