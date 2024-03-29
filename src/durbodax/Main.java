package durbodax;

import durbodax.commands.CommandUtil;
import durbodax.commands.ComputeBplTravel;
import durbodax.commands.GetMarketingTopBottom;
import durbodax.commands.GetMarketingCountsByGroup;
import durbodax.commands.Command;
import durbodax.commands.CommandPrompt;
import durbodax.commands.CommandPromptUtil;
import durbodax.commands.CompareCustomerGroups;
import durbodax.commands.ComputeChildCredit;
import durbodax.commands.ComputeEmployedMomCredit;
import durbodax.commands.ComputeInLawTax;
import durbodax.commands.ComputeIncomeTaxSingle;
import durbodax.commands.ComputePromo;
import durbodax.commands.customer.CreateCustomer;
import durbodax.commands.customer.InitCustomerData;
import durbodax.commands.customer.LoadCustomerData;
import durbodax.commands.customer.SaveCustomerData;
import durbodax.commands.customer.UpdateBirthPlace;
import durbodax.commands.customer.UpdateChildrenUnderFive;
import durbodax.commands.customer.UpdateCustomerAge;
import durbodax.commands.customer.UpdateEducationLevel;
import durbodax.commands.customer.UpdateEldestChildAge;
import durbodax.commands.customer.UpdateEmploymentStatus;
import durbodax.commands.customer.UpdateFamilyUnit;
import durbodax.commands.customer.UpdateFarmIncome;
import durbodax.commands.customer.UpdateFarmStatus;
import durbodax.commands.customer.UpdateFathersLocation;
import durbodax.commands.customer.UpdateGender;
import durbodax.commands.customer.UpdateHoursWorkedPerWeek;
import durbodax.commands.customer.UpdateHouseValue;
import durbodax.commands.customer.UpdateLaborForce;
import durbodax.commands.customer.UpdateLastYearWorked;
import durbodax.commands.customer.UpdateLinkToFather;
import durbodax.commands.customer.UpdateLinkToMother;
import durbodax.commands.customer.UpdateLinkToSpouse;
import durbodax.commands.customer.UpdateMaritalStatus;
import durbodax.commands.customer.UpdateMothersLocation;
import durbodax.commands.customer.UpdateMovedInStatus;
import durbodax.commands.customer.UpdateNonFarmBusinessIncome;
import durbodax.commands.customer.UpdateNumberFamilyMembers;
import durbodax.commands.customer.UpdateNumberOfCouples;
import durbodax.commands.customer.UpdateNumberOfFamilies;
import durbodax.commands.customer.UpdateNumberOfFathers;
import durbodax.commands.customer.UpdateNumberOfMothers;
import durbodax.commands.customer.UpdateNumberOfSiblings;
import durbodax.commands.customer.UpdateOccupationIncomeScore;
import durbodax.commands.customer.UpdateOtherIncome;
import durbodax.commands.customer.UpdateOwnership;
import durbodax.commands.customer.UpdatePovertyStatus;
import durbodax.commands.customer.UpdateRace;
import durbodax.commands.customer.UpdateRelationshipWithHeadHouse;
import durbodax.commands.customer.UpdateRent;
import durbodax.commands.customer.UpdateResidence;
import durbodax.commands.customer.UpdateResidentialStatus;
import durbodax.commands.customer.UpdateSchoolStatus;
import durbodax.commands.customer.UpdateSchoolType;
import durbodax.commands.customer.UpdateSocialSecurityIncome;
import durbodax.commands.customer.UpdateSocioEconomicIndex;
import durbodax.commands.customer.UpdateSpousesLocation;
import durbodax.commands.customer.UpdateTotalFamilyIncome;
import durbodax.commands.customer.UpdateTotalPersonalIncome;
import durbodax.commands.customer.UpdateTotalWageAndSalaryIncome;
import durbodax.commands.customer.UpdateTotalWelfareIncome;
import durbodax.commands.customer.UpdateVeteranStatus;
import durbodax.commands.customer.UpdateWeeksWorkedPerYear;
import durbodax.commands.customer.UpdateWorkingStatus;
import durbodax.commands.customer.UpdateYoungestChildAge;
import durbodax.commands.customer.ViewCustomerData;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import tada.TaDaMethod;


 


/**
 *
 * @author Kirk Seddon
 * @author Daniel Graham
 * 
 */
public class Main {
/**
 * Modified the file so that command can 
 */
	
	
    static BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
    
    /**
     * @param args the command line arguments
     */
    
    //@TaDaMethod(variablesToTrack = {"input"}, correspondingDatabaseAttribute = {"I"})
    public static void main(String[] args ) {
    	String params ="";
    	//String[] args={"1012"};
    	 System.out.println("flow:1");
    	 //String params = "ComputeInLawTax 737"; //1->737
         ComputeInLawTax instance1 = new ComputeInLawTax();
         System.out.println("TestCase: ComputeInLaw Test Case");
         params ="ComputeInLaw "+args[0];
          instance1.execute(params.split(" "));
         ComputeIncomeTaxSingle instance2 = new ComputeIncomeTaxSingle();
         System.out.println("TestCase: ComputeIncomeTaxSingle Test Case");
         params ="ComputeIncomeTaxSingle "+args[0];
         instance2.execute(params.split(" "));
         ComputeChildCredit instance3 = new ComputeChildCredit();
         System.out.println("TestCase: ComputeChildCredit Test Case");
         params ="ComputeChildCredit "+args[0];
         instance3.execute(params.split(" "));
         ComputePromo instance4 = new ComputePromo(); 
         System.out.println("TestCase: ComputePromo Test Case");
         params ="ComputePromo "+args[0];
         instance4.execute(params.split(" "));
    	 ComputeEmployedMomCredit instance5 = new ComputeEmployedMomCredit();
    	 System.out.println("TestCase: ComputeEmploymedMomCredit Test Case");
    	 params ="ComputeEmploymedMomCredit "+args[0];
         instance5.execute(params.split(" "));
    	System.out.print("TestCase: ComputeBplTravel Test Case");
    	 ComputeBplTravel instance6 = new ComputeBplTravel();
        
        params ="ComputeBplTravel "+args[0];
        instance6.execute(params.split(" "));
         
        
   

       /*
         registerCommands();
        registerCommandPrompts();
        try {
            //(new Main()).dummyMethod("input");
        	System.out.println("flow:2");
            System.out.print("Enter command: ");
           
            String input = bufferReader.readLine();
            while(!("quit".equalsIgnoreCase(input) || "exit".equalsIgnoreCase(input))) {
            	System.out.println("flow:3");
                processInput(input);
                
                System.out.print("Enter command: ");
                input = bufferReader.readLine();
            }
            
        } catch(Exception e) {
        	System.out.println("flow:4");
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());            
        }*/       
    } 
    
    public static void registerCommands() {
    	System.out.println("flow:5");
        
        //CommandUtil.registerCommand("sample", new SampleCommand());
        CommandUtil.registerCommand("ComputeBplTravel", new ComputeBplTravel());
        CommandUtil.registerCommand("GetMarketingTopBottom", new GetMarketingTopBottom());
        CommandUtil.registerCommand("GetMarketingCountsByGroup", new GetMarketingCountsByGroup());
        CommandUtil.registerCommand("ComputeInLawTax", new ComputeInLawTax());
        CommandUtil.registerCommand("ComputeIncomeTaxSingle", new ComputeIncomeTaxSingle());
        CommandUtil.registerCommand("ComputeEmployedMomCredit", new ComputeEmployedMomCredit());
        CommandUtil.registerCommand("ComputeChildCredit", new ComputeChildCredit());
        CommandUtil.registerCommand("ComputePromo", new ComputePromo());
        CommandUtil.registerCommand("CompareCustomerGroups", new CompareCustomerGroups());
        //Base commands for clearing, loading, creating, and saving of customer data
        CommandUtil.registerCommand("InitCustomerData", new InitCustomerData());
        CommandUtil.registerCommand("LoadCustomerData", new LoadCustomerData());
        CommandUtil.registerCommand("ViewCustomerData", new ViewCustomerData());
        CommandUtil.registerCommand("CreateCustomer", new CreateCustomer());
        CommandUtil.registerCommand("SaveCustomerData", new SaveCustomerData());

        //Commands to update the current customer data
        CommandUtil.registerCommand("UpdateCustomerAge",new UpdateCustomerAge());
        CommandUtil.registerCommand("UpdateEldestChildAge",new UpdateEldestChildAge());
        CommandUtil.registerCommand("UpdateYoungestChildAge",new UpdateYoungestChildAge());
        CommandUtil.registerCommand("UpdateEducationLevel",new UpdateEducationLevel());
        CommandUtil.registerCommand("UpdateEmploymentStatus",new UpdateEmploymentStatus());
        CommandUtil.registerCommand("UpdateFamilyUnit",new UpdateFamilyUnit());
        CommandUtil.registerCommand("UpdateFarmIncome",new UpdateFarmIncome());
        CommandUtil.registerCommand("UpdateFarmStatus",new UpdateFarmStatus());
        CommandUtil.registerCommand("UpdateMothersLocation",new UpdateMothersLocation());
        CommandUtil.registerCommand("UpdateFathersLocation",new UpdateFathersLocation());
        CommandUtil.registerCommand("UpdateSpousesLocation",new UpdateSpousesLocation());
        CommandUtil.registerCommand("UpdateGender",new UpdateGender());
        CommandUtil.registerCommand("UpdateLaborForce",new UpdateLaborForce());
        CommandUtil.registerCommand("UpdateLastYearWorked",new UpdateLastYearWorked());
        CommandUtil.registerCommand("UpdateLinkToFather",new UpdateLinkToFather());
        CommandUtil.registerCommand("UpdateLinkToMother",new UpdateLinkToMother());
        CommandUtil.registerCommand("UpdateLinkToSpouse",new UpdateLinkToSpouse());
        CommandUtil.registerCommand("UpdateMaritalStatus",new UpdateMaritalStatus());
        CommandUtil.registerCommand("UpdateMovedInStatus",new UpdateMovedInStatus());
        CommandUtil.registerCommand("UpdateNumberOfChildrenUnderFive",new UpdateChildrenUnderFive());
        CommandUtil.registerCommand("UpdateNumberOfCouples",new UpdateNumberOfCouples());
        CommandUtil.registerCommand("UpdateNonFarmBusinessIncome",new UpdateNonFarmBusinessIncome());
        CommandUtil.registerCommand("UpdateNumberOfFamilies",new UpdateNumberOfFamilies());
        CommandUtil.registerCommand("UpdateNumberFamilyMembers",new UpdateNumberFamilyMembers());
        CommandUtil.registerCommand("UpdateNumberOfFathers",new UpdateNumberOfFathers());
        CommandUtil.registerCommand("UpdateNumberOfMothers",new UpdateNumberOfMothers());
        CommandUtil.registerCommand("UpdateNumberOfSiblings",new UpdateNumberOfSiblings());
        CommandUtil.registerCommand("UpdateOccupationScore",new UpdateOccupationIncomeScore());
        CommandUtil.registerCommand("UpdateOtherIncome",new UpdateOtherIncome());
        CommandUtil.registerCommand("UpdateOwnership",new UpdateOwnership());
        CommandUtil.registerCommand("UpdatePovertyStatus",new UpdatePovertyStatus());
        CommandUtil.registerCommand("UpdateRace",new UpdateRace());
        CommandUtil.registerCommand("UpdateRelationWithHouseHolder",new UpdateRelationshipWithHeadHouse());
        CommandUtil.registerCommand("UpdateRent",new UpdateRent());
        CommandUtil.registerCommand("UpdateResidence",new UpdateResidence());
        CommandUtil.registerCommand("UpdateResidentialStatus",new UpdateResidentialStatus());
        CommandUtil.registerCommand("UpdateSchoolStatus",new UpdateSchoolStatus());
        CommandUtil.registerCommand("UpdateSchoolType",new UpdateSchoolType());
        CommandUtil.registerCommand("UpdateSocialSecurityIncome",new UpdateSocialSecurityIncome());
        CommandUtil.registerCommand("UpdateSocioEconomicIndex",new UpdateSocioEconomicIndex());
        CommandUtil.registerCommand("UpdateTotalFamilyIncome",new UpdateTotalFamilyIncome());
        CommandUtil.registerCommand("UpdateTotalPersonalIncome",new UpdateTotalPersonalIncome());
        CommandUtil.registerCommand("UpdateTotalWageAndSalaryIncome",new UpdateTotalWageAndSalaryIncome());
        CommandUtil.registerCommand("UpdateTotalWelfareIncome",new UpdateTotalWelfareIncome());
        CommandUtil.registerCommand("UpdateHouseValue",new UpdateHouseValue());
        CommandUtil.registerCommand("UpdateVeteranStatus",new UpdateVeteranStatus());
        CommandUtil.registerCommand("UpdateWorkingStatus",new UpdateWorkingStatus());
        CommandUtil.registerCommand("UpdateHoursWorkedPerWeek",new UpdateHoursWorkedPerWeek());
        CommandUtil.registerCommand("UpdateWeeksWorkedPerYear",new UpdateWeeksWorkedPerYear());
        CommandUtil.registerCommand("UpdateBirthPlace",new UpdateBirthPlace());
             
        //CommandUtil.registerCommand("sample2", new ConcreteCommand());
        //CommandUtil.registerCommand("sample3", new ConcreteCommand());
        
    }

    public static void registerCommandPrompts() {
    	System.out.println("flow:6");
        /*
        CommandPromptUtil.registerCommandPrompt("sample",new CommandPrompt(new String[]
        {
            "prompt1", "number",
            "prompt2", "string",
            "prompt3", "string"

        }));
        */

        CommandPromptUtil.registerCommandPrompt("ComputeEmployedMomCredit",new CommandPrompt(new String[]
        {
            "Customer ID", "number"

        }));

        CommandPromptUtil.registerCommandPrompt("ComputeBplTravel",new CommandPrompt(new String[]
        {
            "Customer ID", "number"

        }));

        CommandPromptUtil.registerCommandPrompt("ComputeInLawTax",new CommandPrompt(new String[]
        {
            "Customer ID", "number"

        }));

          CommandPromptUtil.registerCommandPrompt("ComputeIncomeTaxSingle",new CommandPrompt(new String[]
        {
            "Customer ID", "number"

        }));

        CommandPromptUtil.registerCommandPrompt("ComputeChildCredit",new CommandPrompt(new String[]
        {
            "Customer ID", "number"

        }));

        CommandPromptUtil.registerCommandPrompt("ComputePromo",new CommandPrompt(new String[]
        {
            "Customer ID", "number"

        }));

        CommandPromptUtil.registerCommandPrompt("GetMarketingCountsByGroup",new CommandPrompt(new String[]
        {
            "'Top' or 'Bottom'", "string",
            "Number of Records", "number",
            "Range of Ages ex. 20-50", "string",
            "Range of Incomes ex. 10000-50000", "string",
            "Birth Place (record id or 'ALL')","string",
            "Marital Status (record id or 'ALL')", "string"

        }));

        CommandPromptUtil.registerCommandPrompt("GetMarketingTopBottom",new CommandPrompt(new String[]
        {
            "'Top' or 'Bottom'", "string",
            "Number of Records", "number",
            "Range of Ages ex. 20-50", "string",
            "Range of Incomes ex. 10000-50000", "string",
            "Birth Place (record id or 'ALL')","string",
            "Marital Status (record id or 'ALL')", "string"
        }));

        CommandPromptUtil.registerCommandPrompt("CompareCustomerGroups",new CommandPrompt(new String[]
        {
            "Age Comparison (eg. Under/Over-50) \n[Hit Enter to skip comparison]", "ageCompare",
            "Income Comparison (eg. Under/Over-50000) \n[Hit Enter to skip comparison]", "incomeCompare",
               "\nMARRIED_SPOUSE_PRESENT - 1\n" +
                "MARRIED_SPOUSE_ABSENT - 2\n" +
                "SEPERATED - 3\n" +
                "DIVORCED - 4\n" +
                "WIDOWED - 5\n" +
                "NEVER_MARRIED_OR_SINGLE - 6\n" +
            "Marital Status \n[Hit Enter to skip comparison]", "marital_status"
        }));

        CommandPromptUtil.registerCommandPrompt("LoadCustomerData",new CommandPrompt(new String[]
        {
            "Customer ID", "string"

        }));


        CommandPromptUtil.registerCommandPrompt("UpdateCustomerAge",new CommandPrompt(new String[] {

            "Customer Age", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateEldestChildAge",new CommandPrompt(new String[] {

            "Eldest Child Age", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateYoungestChildAge",new CommandPrompt(new String[] {

            "Youngest Child Age", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateEducationLevel",new CommandPrompt(new String[] {

               "\nNA_OR_NONE - 0\n" +
                "NONE_OR_PRESCHOOL - 1\n" +
                "ELEMENTARY - 2\n" +
                "MIDDLE_SCHOOL - 3\n" +
                "FRESHMEN - 4\n" +
                "SOPHMORE - 5\n" +
                "JUNIOR - 6\n" +
                "SENIOR - 7\n" +
                "UNDERGRAD - 8\n" +
                "GRADUATE - 9\n" +
            "Education Level", "number0_9"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateEmploymentStatus",new CommandPrompt(new String[] {

                "\nNA - 0\n" +
                "EMPLOYED - 1\n" +
                "UNEMPLOYED - 2\n" +
                "NOT_IN_LABOR_FORCE - 3\n" +
            "Employment Status", "number0_3"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateFamilyUnit",new CommandPrompt(new String[] {

             "Family Unit Number", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateFarmIncome",new CommandPrompt(new String[] {

             "\n999999 - for N/A\n" +
            "Farm Income", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateFarmStatus",new CommandPrompt(new String[] {

            "\nNON_FARM - 1\n" +
                "FARM - 2\n" +
            "Farm Status", "number1_or_2"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateMothersLocation",new CommandPrompt(new String[] {

            "Mother's Location in Household - Number", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateFathersLocation",new CommandPrompt(new String[] {

            "Father's Location in Household - Number", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateSpousesLocation",new CommandPrompt(new String[] {

            "Spouse Location in House - Number", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateGender",new CommandPrompt(new String[] {

                "\nMale - 1\n" +
                "Female - 2\n" +
            "Gender", "number1_or_2"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateLaborForce",new CommandPrompt(new String[] {

                 "\nN/A - 0\n" +
                "NO - 1\n" +
                "YES - 2\n" +
            "Labor Force Participation", "number0_2"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateLastYearWorked",new CommandPrompt(new String[] {

            "\nN/A - 0\n" +
                "CURRENT_YEAR - 10\n" +
                "PREVIOUS_YEAR - 20\n" +
                "TWO_YEARS_PRIOR - 31\n" +
                "TWO_TO_FIVE_YEARS - 32\n" +
                "THREE_TO_FIVE_YEARS - 33\n" +
                "THREE_TO_SIX_YEARS - 34\n" +
                "SIX_TO_TEN_YEARS - 35\n" +
                "SEVEN_TO_TEN_YEARS - 36\n" +
                "TEN_PLUS_YEARS_AGO - 40\n" +
                "NEVER_WORKED - 50\n" +
            "Last Year Worked", "lastyear"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateLinkToFather",new CommandPrompt(new String[] {

            "\nNO_LINK - 0\n" +
                "UNAMBIGUOUS_FATHER_LINK - 1\n" +
                "SON_GRANDCHILD_LINK - 2\n" +
                "PRECEDING_MALE - 3\n" +
                "PRECEDING_MALE_SURNAME - 4\n" +
                "STEP_FATHER - 7\n" +
            "Link To Father", "linktofather"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateLinkToMother",new CommandPrompt(new String[] {

            "\nNO_LINK - 0\n" +
            "UNAMBIGUOUS_MOTHER_LINK - 1\n" +
            "DAUGHTER_GRANDCHILD_LINK - 2\n" +
            "PRECEDING_FEMALE - 3\n" +
            "PRECEDING_FEMALE_SURNAME - 4\n" +
            "DAUGHTER_GRANDCHILD_SURVIVING - 5\n" +
            "PRECEDING_FEMALE_SURVIVING - 6\n" +
            "STEP_MOTHER - 7\n" +
            "Link To Mother", "number0_7"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateLinkToSpouse",new CommandPrompt(new String[] {

            "\nNO_LINK - 0\n" +
                "WIFE_FOLLOWS_HUSBAND - 1\n" +
                "WIFE_PRECEDES_HUSBAND - 2\n" +
                "CONSISTENT - 3\n" +
                "WIFE_FOLLOWS_HUSBAND_ADJ - 4\n" +
                "WIFE_PRECEDES_HUSBAND_ADJ - 5\n" +
                "NON_ADJ - 6\n" +
                "PREVIOUS_MARITAL_STATUS - 7\n" +
            "Link to Spouse", "number0_7"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateMaritalStatus",new CommandPrompt(new String[] {

                "\nMARRIED_SPOUSE_PRESENT - 1\n" +
                "MARRIED_SPOUSE_ABSENT - 2\n" +
                "SEPERATED - 3\n" +
                "DIVORCED - 4\n" +
                "WIDOWED - 5\n" +
                "NEVER_MARRIED_OR_SINGLE - 6\n" +
            "Marital Status", "number1_6"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateMovedInStatus",new CommandPrompt(new String[] {

                "\nNA - 0\n" +
                "THIS_OR_LAST_YEAR - 1\n" +
                "TWO_YEAR_AGO - 2\n" +
                "THREE_YEARS_AGO - 3\n" +
                "_4_TO_6_YEARS_AGO - 4\n" +
                "_7_TO_10_YEARS_AGO - 5\n" +
                "_11_20_YEARS_AGO - 6\n" +
                "_21_PLUS_YEARS_AGO - 7\n" +
                "BLANK - 8\n" +
                "ALWAYS_LIVED_HERE - 9\n\n" +
            "Moved In Status", "number0_9"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateNumberOfChildrenUnderFive",new CommandPrompt(new String[] {

            "\nNO_CHILDREN - 0\n" +
            "ONE_CHILD - 1\n" +
            "TWO_CHILDREN - 2\n" +
            "THREE_CHILDREN - 3\n" +
            "FOUR_CHILDREN - 4\n" +
            "FIVE_CHILDREN - 5\n" +
            "SIX_CHILDREN - 6\n" +
            "SEVEN_CHILDREN - 7\n" +
            "EIGHT_CHILDREN - 8\n" +
            "NINE_PLUS_CHILDREN - 9\n" +
            "Number of Children Under Five", "number0_9"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateNumberOfCouples",new CommandPrompt(new String[] {

            "Number of Couples in House", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateNonFarmBusinessIncome",new CommandPrompt(new String[] {

             "\n999999 - for N/A\n" +
            "Non-Farm Business Income", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateNumberOfFamilies",new CommandPrompt(new String[] {

               "\n0 - if vacant\n" +
            "Number of Families in House", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateNumberFamilyMembers",new CommandPrompt(new String[] {

            "Number of Family Members in House", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateNumberOfFathers",new CommandPrompt(new String[] {

            "Number of Fathers in House", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateNumberOfMothers",new CommandPrompt(new String[] {

            "Number of Mothers in House", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateBirthPlace",new CommandPrompt(new String[] {

            "Birthplace", "string"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateNumberOfSiblings",new CommandPrompt(new String[] {

            "Number of Siblings in House", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateOccupationScore",new CommandPrompt(new String[] {
        
            "\n0 - if N/A\n" +
            "Occupation Income Score", "number"
            
        }));
        CommandPromptUtil.registerCommandPrompt("UpdateOtherIncome",new CommandPrompt(new String[] {

             "\n99999 - if N/A\n" +
            "Other Income", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateOwnership",new CommandPrompt(new String[] {

              "\nNA - 0\n" +
                "OWNED - 1\n" +
                "RENTED - 2\n" +
            "Ownership", "number0_2"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdatePovertyStatus",new CommandPrompt(new String[] {

            "Poverty Status - Number", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateRace",new CommandPrompt(new String[] {

                "\nWhite - 1\n" +
                "BLACK - 2\n" +
                "AMERICAN_INDIAN - 3\n" +
                "CHINESE - 4\n" +
                "JAPANESE - 5\n" +
                "OTHER_ASIA_PAC - 6\n" +
                "OTHER_RACE - 7\n" +
            "Race", "number1_7"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateRelationWithHouseHolder",new CommandPrompt(new String[] {

             "\nHOUSEHOLDER - 1\n" +
                "SPOUSE - 2\n" +
                "CHILD - 3\n" +
                "CHILD_IN_LAW - 4\n" +
                "PARENT - 5\n" +
                "PARENT_IN_LAW - 6\n" +
                "SIBLING - 7\n" +
                "SIBLING_IN_LAW - 8\n" +
                "GRANDCHILD - 9\n" +
                "OTHER_RELATIVES - 10\n" +
                "PARTNER_FRIEND_VISITOR - 11\n" +
                "OTHER_NON_RELATIVES - 12\n" +
                "INMATES - 13\n" +
             "Relationship w House Holder", "number1_13"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateRent",new CommandPrompt(new String[] {

             "\n0 - if N/A\n" +
             "Rent", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateResidence",new CommandPrompt(new String[] {

             "Residence 5 yrs. ago", "string"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateResidentialStatus",new CommandPrompt(new String[] {

            "\nNA - 0\n" +
                "SAME_HOUSE - 1\n" +
                "MOVED_NOT_REPORTED - 2\n" +
                "SAME_STATE_COUNTY_DIFF_HOUSE - 3\n" +
                "SAME_STATE_DIFF_COUNTY - 4\n" +
                "DIFF_STATE - 5\n" +
                "ABROAD - 6\n" +
                "SAME_STATE_NOT_REPORTED - 7\n" +
                "UNKNOWN - 8\n" +
             "Residential Status", "number0_8"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateSchoolStatus",new CommandPrompt(new String[] {

             "\nNA - 0\n" +
                "NO - 1\n" +
                "YES - 2\n" +
                "MISSING - 9\n" +
             "School Status", "number_0_1_2_9"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateSchoolType",new CommandPrompt(new String[] {

            "\nNA - 0\n" +
                "NOT_ENROLLED - 1\n" +
                "PUBLIC_SCHOOL - 2\n" +
                "PRIVATE_SCHOOL - 3\n" +
                "CHURCH_RELATED - 4\n" +
                "PAROCHIAL - 5\n" +
                "OTHER_PRIVATE_1980 - 6\n" +
                "OTHER_PRIVATE_1970 - 7\n" +
             "School Type", "number0_7"


        }));
        CommandPromptUtil.registerCommandPrompt("UpdateSocialSecurityIncome",new CommandPrompt(new String[] {

            "\n9999 - if N/A\n" +
            "Social Security Income", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateSocioEconomicIndex",new CommandPrompt(new String[] {

             "\n0 - if N/A\n" +
             "Socio-Economic Index - Number", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateTotalFamilyIncome",new CommandPrompt(new String[] {

             "\n9999999 - if N/A\n" +
             "Total Family Income", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateTotalPersonalIncome",new CommandPrompt(new String[] {

            "\n9999999 - if N/A\n" +
            "Total Personal Income", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateTotalWageAndSalaryIncome",new CommandPrompt(new String[] {

             "\n9999999 - if N/A\n" +
             "Total Wage and Salary Income", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateTotalWelfareIncome",new CommandPrompt(new String[] {

            "\n9999999 - if N/A\n" +
             "Total Welfare Income", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateHouseValue",new CommandPrompt(new String[] {

            "House Value", "number"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateVeteranStatus",new CommandPrompt(new String[] {

            "\nNA - 0\n" +
                "NO_SERVICE - 1\n" +
                "YES - 2\n" +
                "NOT_ASCERTAINED - 9\n" +
             "Veteran Status", "number_0_1_2_9"


        }));
        CommandPromptUtil.registerCommandPrompt("UpdateWorkingStatus",new CommandPrompt(new String[] {

            "\nNA - 0\n" +
                "SELF_EMPLOYED - 1\n" +
                "WAGE_OR_SALARY - 2\n" +
                "NEW_WORKER - 3\n" +
                "UNEMPLOYED - 4\n" +
             "Working Class Status", "number0_4"

        }));
        CommandPromptUtil.registerCommandPrompt("UpdateHoursWorkedPerWeek",new CommandPrompt(new String[] {


            "\nNA - 0\n" +
                "1_TO_14_HRS - 2\n" +
                "15_TO_29_HRS - 3\n" +
                "30_TO_24_HRS - 4\n" +
                "40_HRS - 5\n" +
                "41_TO_48_HRS - 6\n" +
                "49_TO_59_HRS - 7\n" +
                "60_PLUS_HRS - 8\n" +
             "Hours Worked per Week", "hoursworked"


        }));
        CommandPromptUtil.registerCommandPrompt("UpdateWeeksWorkedPerYear",new CommandPrompt(new String[] {

             "\nNA - 0\n" +
                "1_TO_13_WEEKS - 1\n" +
                "14_TO_26_WEEKS - 2\n" +
                "27_TO_39_WEEKS - 3\n" +
                "40_TO_47_WEEKS - 4\n" +
                "48_TO_47_WEEKS - 5\n" +
                "50_TO_52_WEEKS - 6\n" +
             "Weeks Worked Per Year", "number0_6"


        }));



        CommandPromptUtil.registerCommandPrompt("CreateCustomer",new CommandPrompt(new String[]
        {
            "Customer Age", "number",
            "Eldest Child Age", "number",
            "Youngest Child Age", "number",
            
                "\nNA_OR_NONE - 0\n" +
                "NONE_OR_PRESCHOOL - 1\n" +
                "ELEMENTARY - 2\n" +
                "MIDDLE_SCHOOL - 3\n" +
                "FRESHMEN - 4\n" +
                "SOPHMORE - 5\n" +
                "JUNIOR - 6\n" +
                "SENIOR - 7\n" +
                "UNDERGRAD - 8\n" +
                "GRADUATE - 9\n" +
            "Education Level", "number0_9",

                "\nNA - 0\n" +
                "EMPLOYED - 1\n" +
                "UNEMPLOYED - 2\n" +
                "NOT_IN_LABOR_FORCE - 3\n" +
            "Employment Status", "number0_3",

            "Family Unit Number", "number",

                "\n999999 - for N/A\n" +
            "Farm Income", "number",

                "\nNON_FARM - 1\n" +
                "FARM - 2\n" +
            "Farm Status", "number1_or_2",

            "Mother's Location in Household - Number", "number",
            "Father's Location in Household - Number", "number",
            "Spouse Location in House - Number", "number",

                "\nMale - 1\n" +
                "Female - 2\n" +
            "Gender", "number1_or_2",

                "\nN/A - 0\n" +
                "NO - 1\n" +
                "YES - 2\n" +
            "Labor Force Participation", "number0_2",

                "\nN/A - 0\n" +
                "CURRENT_YEAR - 10\n" +
                "PREVIOUS_YEAR - 20\n" +
                "TWO_YEARS_PRIOR - 31\n" +
                "TWO_TO_FIVE_YEARS - 32\n" +
                "THREE_TO_FIVE_YEARS - 33\n" +
                "THREE_TO_SIX_YEARS - 34\n" +
                "SIX_TO_TEN_YEARS - 35\n" +
                "SEVEN_TO_TEN_YEARS - 36\n" +
                "TEN_PLUS_YEARS_AGO - 40\n" +
                "NEVER_WORKED - 50\n" +
            "Last Year Worked", "lastyear",


                "\nNO_LINK - 0\n" +
                "UNAMBIGUOUS_FATHER_LINK - 1\n" +
                "SON_GRANDCHILD_LINK - 2\n" +
                "PRECEDING_MALE - 3\n" +
                "PRECEDING_MALE_SURNAME - 4\n" +
                "STEP_FATHER - 7\n" +
            "Link To Father", "linktofather",


            "\nNO_LINK - 0\n" +
            "UNAMBIGUOUS_MOTHER_LINK - 1\n" +
            "DAUGHTER_GRANDCHILD_LINK - 2\n" +
            "PRECEDING_FEMALE - 3\n" +
            "PRECEDING_FEMALE_SURNAME - 4\n" +
            "DAUGHTER_GRANDCHILD_SURVIVING - 5\n" +
            "PRECEDING_FEMALE_SURVIVING - 6\n" +
            "STEP_MOTHER - 7\n" +
            "Link To Mother", "number0_7",


                "\nNO_LINK - 0\n" +
                "WIFE_FOLLOWS_HUSBAND - 1\n" +
                "WIFE_PRECEDES_HUSBAND - 2\n" +
                "CONSISTENT - 3\n" +
                "WIFE_FOLLOWS_HUSBAND_ADJ - 4\n" +
                "WIFE_PRECEDES_HUSBAND_ADJ - 5\n" +
                "NON_ADJ - 6\n" +
                "PREVIOUS_MARITAL_STATUS - 7\n" +
            "Link to Spouse", "number0_7",


                "\nMARRIED_SPOUSE_PRESENT - 1\n" +
                "MARRIED_SPOUSE_ABSENT - 2\n" +
                "SEPERATED - 3\n" +
                "DIVORCED - 4\n" +
                "WIDOWED - 5\n" +
                "NEVER_MARRIED_OR_SINGLE - 6\n" +
            "Marital Status", "number1_6",

                "\nNA - 0\n" +
                "THIS_OR_LAST_YEAR - 1\n" +
                "TWO_YEAR_AGO - 2\n" +
                "THREE_YEARS_AGO - 3\n" +
                "_4_TO_6_YEARS_AGO - 4\n" +
                "_7_TO_10_YEARS_AGO - 5\n" +
                "_11_20_YEARS_AGO - 6\n" +
                "_21_PLUS_YEARS_AGO - 7\n" +
                "BLANK - 8\n" +
                "ALWAYS_LIVED_HERE - 9\n\n" +
            "Moved In Status", "number0_9",


                 "\n999999 - for N/A\n" +
            "Non-Farm Business Income", "number",

            "Number of Children in House", "number",

            "\nNO_CHILDREN - 0\n" +
            "ONE_CHILD - 1\n" +
            "TWO_CHILDREN - 2\n" +
            "THREE_CHILDREN - 3\n" +
            "FOUR_CHILDREN - 4\n" +
            "FIVE_CHILDREN - 5\n" +
            "SIX_CHILDREN - 6\n" +
            "SEVEN_CHILDREN - 7\n" +
            "EIGHT_CHILDREN - 8\n" +
            "NINE_PLUS_CHILDREN - 9\n" +
            "Number of Children Under Five", "number0_9",

            "Number of Couples in House", "number",

                "\n0 - if vacant\n" +
            "Number of Families in House", "number",

            "Number of Family Members in House", "number",
            "Number of Fathers in House", "number",
            "Number of Mothers in House", "number",
            "Number of Siblings in House", "number",

            "\n0 - if N/A\n" +
            "Occupation Income Score", "number",

            "\n99999 - if N/A\n" +
            "Other Income", "number",

                "\nNA - 0\n" +
                "OWNED - 1\n" +
                "RENTED - 2\n" +
            "Ownership", "number0_2",

            "Poverty Status - Number", "number",

                "\nWhite - 1\n" +
                "BLACK - 2\n" +
                "AMERICAN_INDIAN - 3\n" +
                "CHINESE - 4\n" +
                "JAPANESE - 5\n" +
                "OTHER_ASIA_PAC - 6\n" +
                "OTHER_RACE - 7\n" +
            "Race", "number1_7",


                "\nHOUSEHOLDER - 1\n" +
                "SPOUSE - 2\n" +
                "CHILD - 3\n" +
                "CHILD_IN_LAW - 4\n" +
                "PARENT - 5\n" +
                "PARENT_IN_LAW - 6\n" +
                "SIBLING - 7\n" +
                "SIBLING_IN_LAW - 8\n" +
                "GRANDCHILD - 9\n" +
                "OTHER_RELATIVES - 10\n" +
                "PARTNER_FRIEND_VISITOR - 11\n" +
                "OTHER_NON_RELATIVES - 12\n" +
                "INMATES - 13\n" +
             "Relationship w House Holder", "number1_13",


             "\n0 - if N/A\n" +
             "Rent", "number",

             "Residence 5 yrs. ago", "string",

                "\nNA - 0\n" +
                "SAME_HOUSE - 1\n" +
                "MOVED_NOT_REPORTED - 2\n" +
                "SAME_STATE_COUNTY_DIFF_HOUSE - 3\n" +
                "SAME_STATE_DIFF_COUNTY - 4\n" +
                "DIFF_STATE - 5\n" +
                "ABROAD - 6\n" +
                "SAME_STATE_NOT_REPORTED - 7\n" +
                "UNKNOWN - 8\n" +
             "Residential Status", "number0_8",

                "\nNA - 0\n" +
                "NO - 1\n" +
                "YES - 2\n" +
                "MISSING - 9\n" +
             "School Status", "number_0_1_2_9",

                "\nNA - 0\n" +
                "NOT_ENROLLED - 1\n" +
                "PUBLIC_SCHOOL - 2\n" +
                "PRIVATE_SCHOOL - 3\n" +
                "CHURCH_RELATED - 4\n" +
                "PAROCHIAL - 5\n" +
                "OTHER_PRIVATE_1980 - 6\n" +
                "OTHER_PRIVATE_1970 - 7\n" +
             "School Type", "number0_7",

             "\n9999 - if N/A\n" +
             "Social Security Income", "number",

             "\n0 - if N/A\n" +
             "Socio-Economic Index - Number", "number",

             "\n9999999 - if N/A\n" +
             "Total Family Income", "number",

             "\n9999999 - if N/A\n" +
             "Total Personal Income", "number",

             "\n9999999 - if N/A\n" +
             "Total Wage and Salary Income", "number",

             "\n9999999 - if N/A\n" +
             "Total Welfare Income", "number",

             "House Value", "number",

                "\nNA - 0\n" +
                "NO_SERVICE - 1\n" +
                "YES - 2\n" +
                "NOT_ASCERTAINED - 9\n" +
             "Veteran Status", "number_0_1_2_9",

                "\nNA - 0\n" +
                "SELF_EMPLOYED - 1\n" +
                "WAGE_OR_SALARY - 2\n" +
                "NEW_WORKER - 3\n" +
                "UNEMPLOYED - 4\n" +
             "Working Class Status", "number0_4",

                "\nNA - 0\n" +
                "1_TO_14_HRS - 2\n" +
                "15_TO_29_HRS - 3\n" +
                "30_TO_24_HRS - 4\n" +
                "40_HRS - 5\n" +
                "41_TO_48_HRS - 6\n" +
                "49_TO_59_HRS - 7\n" +
                "60_PLUS_HRS - 8\n" +
             "Hours Worked per Week", "hoursworked",

                "\nNA - 0\n" +
                "1_TO_13_WEEKS - 1\n" +
                "14_TO_26_WEEKS - 2\n" +
                "27_TO_39_WEEKS - 3\n" +
                "40_TO_47_WEEKS - 4\n" +
                "48_TO_47_WEEKS - 5\n" +
                "50_TO_52_WEEKS - 6\n" +
             "Weeks Worked Per Year", "number0_6",

             "Birthplace", "string"

        }));
    }
    
    public void dummyMethod(String string)
    {
    	System.out.println("flow:7");
    }
    
    public static void processInput(String statement) {
    	System.out.println("flow:8");
        //split user input into tokens by space delimiter
        String[] tokens = statement.split(" ");
        
        if(tokens.length > 0) {
        	System.out.println("flow:9");
        	
            //Retrieve registered command and user prompts for corresponding user command
            Command command = CommandUtil.getCommand(tokens[0]);
            CommandPrompt prompt = CommandPromptUtil.getCommandPrompt(tokens[0]);

            if(prompt != null) {
            	System.out.println("flow:10");

                StringBuilder userInput = new StringBuilder();
                userInput.append(tokens[0]);

                //iterate through each display prompt
                for(int i=0; i<prompt.size(); i+=2) {
                	System.out.println("flow:11");
                    userInput.append("~" + prompt.displayNextPrompt());

                }
                prompt.reset();

                //add user input values to token list to pass to delegated command execution
                tokens = userInput.toString().split("~");

            }

            if(command != null) {
            	System.out.println("flow:12");
                System.out.println("");
                command.execute(tokens);
                
            } else {
            	System.out.println("flow:13");
                System.out.println("Invalid Command!");
                
            }
            
        }
    }
    
}
