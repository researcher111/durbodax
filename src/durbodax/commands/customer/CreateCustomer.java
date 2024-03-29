package durbodax.commands.customer;

import durbodax.commands.Command;
import durbodax.customers.Customer;
import durbodax.customers.CustomerData;

/**
 *
 * @author Kirk Seddon
 */
public class CreateCustomer implements Command {

    public Object execute(String[] input) {
    	System.out.println("flow:219");
        Customer customer = new Customer();

        //set customer data from input information
        customer.setAge(Integer.parseInt(input[1]));
        customer.setAgeOfEldestChild(Integer.parseInt(input[2]));
        customer.setAgeOfYoungestChild(Integer.parseInt(input[3]));

        customer.setEducationLevel(Integer.parseInt(input[4]));
        customer.setEmploymentStatus(Integer.parseInt(input[5]));
        customer.setFamilyMembership(Integer.parseInt(input[6]));

        customer.setFarmIncome(Integer.parseInt(input[7]));
        customer.setFarmStatus(Integer.parseInt(input[8]));
        customer.setMothersLocationInHouse(Integer.parseInt(input[9]));

        customer.setFathersLocationInHouse(Integer.parseInt(input[10]));
        customer.setSpouseLocationInHouse(Integer.parseInt(input[11]));

        customer.setGender(Integer.parseInt(input[12]));
        customer.setLaborForce(Integer.parseInt(input[13]));
        customer.setLastYearWorked(Integer.parseInt(input[14]));

        customer.setLinkToFather(Integer.parseInt(input[15]));
        customer.setLinkToMother(Integer.parseInt(input[16]));
        customer.setLinkToSpouse(Integer.parseInt(input[17]));

        customer.setMaritalStatus(Integer.parseInt(input[18]));
        customer.setMovedInCode(Integer.parseInt(input[19]));
        customer.setNonFarmBusinessIncome(Integer.parseInt(input[20]));

        customer.setNumChildrenInHouse(Integer.parseInt(input[21]));
        customer.setNumChildenUnderFiveInHouse(Integer.parseInt(input[22]));
        customer.setNumCouplesInHouse(Integer.parseInt(input[23]));

        customer.setNumFamiliesInHouse(Integer.parseInt(input[24]));
        customer.setNumFamilyMembersInHouse(Integer.parseInt(input[25]));
        customer.setNumFathersInHouse(Integer.parseInt(input[26]));

        customer.setNumMothersInHouse(Integer.parseInt(input[27]));
        customer.setNumSiblingsInHouse(Integer.parseInt(input[28]));
        customer.setOccupationIncomeScore(Integer.parseInt(input[29]));

        customer.setOtherIncome(Integer.parseInt(input[30]));
        customer.setOwnership(Integer.parseInt(input[31]));
        customer.setPovertyStatus(Integer.parseInt(input[32]));

        customer.setRace(Integer.parseInt(input[33]));
        customer.setRelationshipWHouseholder(Integer.parseInt(input[34]));
        customer.setRent(Integer.parseInt(input[35]));

        customer.setResidence5YearsAgo(input[36]);
        customer.setResidentialStatus(Integer.parseInt(input[37]));
        customer.setSchoolStatus(Integer.parseInt(input[38]));

        customer.setSchoolType(Integer.parseInt(input[39]));
        customer.setSocialSecurityIncome(Integer.parseInt(input[40]));
        customer.setSocioEconomicIndex(Integer.parseInt(input[41]));

        customer.setTotalFamilyIncome(Integer.parseInt(input[42]));
        customer.setTotalPersonalIncome(Integer.parseInt(input[43]));
        customer.setWageAndSalaryIncome(Integer.parseInt(input[44]));

        customer.setWelfareIncome(Integer.parseInt(input[45]));
        customer.setValue(Integer.parseInt(input[46]));
        customer.setVeteranStatus(Integer.parseInt(input[47]));

        customer.setWorkClass(Integer.parseInt(input[48]));
        customer.setWorkHours(Integer.parseInt(input[49]));
        customer.setWeeksWorkedPerYear(Integer.parseInt(input[50]));
        customer.setBirthplace(input[51]);

        CustomerData.CUSTOMER.setCustomer(customer);


        return 0;

    }

}


