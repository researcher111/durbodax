package durbodax.customers;

import tada.TaDaMethod;
import durbodax.customers.Enums.*;

/**
 *
 * @author Kirk Seddon
 */
public class Customer {

    public Customer() {

        //used to determine if the customer is an existing customer or new customer
        this.id = -1;

    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public void setChildBorn(String childBorn) {
        this.childBorn = childBorn;
    }

    public void setEducationLevel(int educationLevel) {
        this.educationLevel = educationLevel;
    }
    
    public void setEducationLevel(EducationLevel educationLevel) {
        this.educationLevel = educationLevel.getCode();
    }

    public void setEmploymentIndustry(String employmentIndustry) {
        this.employmentIndustry = employmentIndustry;
    }

    public void setEmploymentStatus(int employmentStatus) {
        this.employmentStatus = employmentStatus;
    }
    
    public void setEmploymentStatus(EmploymentStatus employmentStatus) {
        this.employmentStatus = employmentStatus.getCode();
    }

    public void setFarmStatus(int farmStatus) {
        this.farmStatus = farmStatus;
    }
    
     public void setFarmStatus(Farm farmStatus) {
        this.farmStatus = farmStatus.getCode();
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
    
    public void setGender(Sex gender) {
        this.gender = gender.getCode();
    }

    public void setId(int id){
        this.id = id;
    }

    public void setLaborForce(int laborForce) {
        this.laborForce = laborForce;
    }
    
    public void setLaborForce(LaborForce laborForce) {
        this.laborForce = laborForce.getCode();
    }

    public void setLastYearWorked(int lastYearWorked) {
        this.lastYearWorked = lastYearWorked;
    }
    
    public void setLastYearWorked(LastYearWorked lastYearWorked) {
        this.lastYearWorked = lastYearWorked.getCode();
    }

    public void setMaritalStatus(int maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    
    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus.getCode();
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setOwnership(int ownership) {
        this.ownership = ownership;
    }
    
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership.getCode();
    }

    public void setRace(int race) {
        this.race = race;
    }
    
    public void setRace(Race race) {
        this.race = race.getCode();
    }

    public void setRelationshipWHouseholder(int relationshipWHouseholder) {
        this.relationshipWHouseholder = relationshipWHouseholder;
    }
    
    public void setRelationshipWHouseholder(RelationWHeadHouse relationshipWHouseholder) {
        this.relationshipWHouseholder = relationshipWHouseholder.getCode();
    }

    public void setResidence5YearsAgo(String residence5YearsAgo) {
        this.residence5YearsAgo = residence5YearsAgo;
    }

    public void setResidentialStatus(int residentialStatus) {
        this.residentialStatus = residentialStatus;
    }
    
    public void setResidentialStatus(ResidentialStatus residentialStatus) {
        this.residentialStatus = residentialStatus.getCode();
    }

    public void setSchoolStatus(int schoolStatus) {
        this.schoolStatus = schoolStatus;
    }
    
    public void setSchoolStatus(SchoolStatus schoolStatus) {
        this.schoolStatus = schoolStatus.getCode();
    }

    public void setSchoolType(int schoolType) {
        this.schoolType = schoolType;
    }
    
    public void setSchoolType(SchoolType schoolType) {
        this.schoolType = schoolType.getCode();
    }

    public void setVeteranStatus(int veteranStatus) {
        this.veteranStatus = veteranStatus;
    }
    
    public void setVeteranStatus(VeteranStatus veteranStatus) {
        this.veteranStatus = veteranStatus.getCode();
    }

    public void setWeeksWorkedPerYear(int weeksWorkedPerYear) {
        this.weeksWorkedPerYear = weeksWorkedPerYear;
    }
    
    public void setWeeksWorkedPerYear(WeeksWorkedPerYear weeksWorkedPerYear) {
        this.weeksWorkedPerYear = weeksWorkedPerYear.getCode();
    }

    public void setWorkClass(int workClass) {
        this.workClass = workClass;
    }
    
    public void setWorkClass(WorkingClass workClass) {
        this.workClass = workClass.getCode();
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
    
    public void setWorkHours(WorkHours workHours) {
        this.workHours = workHours.getCode();
    }

    public void setAgeOfEldestChild(int ageOfEldestChild) {
        this.ageOfEldestChild = ageOfEldestChild;
    }

    public void setAgeOfYoungestChild(int ageOfYoungestChild) {
        this.ageOfYoungestChild = ageOfYoungestChild;
    }

    public void setFamilyMembership(int familyMembership) {
        this.familyMembership = familyMembership;
    }

    public void setFarmIncome(int farmIncome) {
        this.farmIncome = farmIncome;
    }

    public void setFathersLocationInHouse(int fathersLocationInHouse) {
        this.fathersLocationInHouse = fathersLocationInHouse;
    }

    public void setIndustry1950Basis(int industry1950Basis) {
        this.industry1950Basis = industry1950Basis;
    }

    public void setLinkToFather(int linkToFather) {
        this.linkToFather = linkToFather;
    }

    public void setLinkToFather(LinkToFather link) {

        this.linkToFather = link.getCode();

    }

    public void setLinkToMother(int linkToMother) {
        this.linkToMother = linkToMother;
    }

    public void setLinkToMother(LinkToMother link) {

        this.linkToMother = link.getCode();

    }

    public void setLinkToSpouse(int linkToSpouse) {
        this.linkToSpouse = linkToSpouse;
    }

    public void setLinkToSpouse(LinkToSpouse link) {

        this.linkToSpouse = link.getCode();

    }

    public void setMothersLocationInHouse(int mothersLocationInHouse) {
        this.mothersLocationInHouse = mothersLocationInHouse;
    }

    public void setMovedInCode(int movedInCode) {
        this.movedInCode = movedInCode;
    }

    public void setMovedInCode(MovedIn moved) {

        this.movedInCode = moved.getCode();

    }

    public void setNonFarmBusinessIncome(int nonFarmBusinessIncome) {
        this.nonFarmBusinessIncome = nonFarmBusinessIncome;
    }

    public void setNumChildenUnderFiveInHouse(int numChildenUnderFiveInHouse) {
        this.numChildenUnderFiveInHouse = numChildenUnderFiveInHouse;
    }

    public void setNumChildrenUnderFiveInHouse(ChildrenUnderFive children) {
        this.numChildenUnderFiveInHouse = children.getCode();
    }

    public void setNumChildrenInHouse(int numChildrenInHouse) {
        this.numChildrenInHouse = numChildrenInHouse;
    }

    public void setNumCouplesInHouse(int numCouplesInHouse) {
        this.numCouplesInHouse = numCouplesInHouse;
    }

    public void setNumFamiliesInHouse(int numFamiliesInHouse) {
        this.numFamiliesInHouse = numFamiliesInHouse;
    }

    public void setNumFamilyMembersInHouse(int numFamilyMembersInHouse) {
        this.numFamilyMembersInHouse = numFamilyMembersInHouse;
    }

    public void setNumFathersInHouse(int numFathersInHouse) {
        this.numFathersInHouse = numFathersInHouse;
    }

    public void setNumMothersInHouse(int numMothersInHouse) {
        this.numMothersInHouse = numMothersInHouse;
    }

    public void setNumSiblingsInHouse(int numSiblingsInHouse) {
        this.numSiblingsInHouse = numSiblingsInHouse;
    }

    public void setOccupation1950Basis(int occupation1950Basis) {
        this.occupation1950Basis = occupation1950Basis;
    }

    public void setOccupationIncomeScore(int occupationIncomeScore) {
        this.occupationIncomeScore = occupationIncomeScore;
    }

    public void setOtherIncome(int otherIncome) {
        this.otherIncome = otherIncome;
    }

    public void setPovertyStatus(int povertyStatus) {
        this.povertyStatus = povertyStatus;
    }

    public void setProbableStepFather(int probableStepFather) {
        this.probableStepFather = probableStepFather;
    }

    public void setProbableStepMother(int probableStepMother) {
        this.probableStepMother = probableStepMother;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public void setSocialSecurityIncome(int socialSecurityIncome) {
        this.socialSecurityIncome = socialSecurityIncome;
    }

    public void setSocioEconomicIndex(int socioEconomicIndex) {
        this.socioEconomicIndex = socioEconomicIndex;
    }

    public void setSpouseLocationInHouse(int spouseLocationInHouse) {
        this.spouseLocationInHouse = spouseLocationInHouse;
    }

    public void setTotalFamilyIncome(int totalFamilyIncome) {
        this.totalFamilyIncome = totalFamilyIncome;
    }

    public void setTotalPersonalIncome(int totalPersonalIncome) {
        this.totalPersonalIncome = totalPersonalIncome;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setWageAndSalaryIncome(int wageAndSalaryIncome) {
        this.wageAndSalaryIncome = wageAndSalaryIncome;
    }

    public void setWelfareIncome(int welfareIncome) {
        this.welfareIncome = welfareIncome;
    }
    
    

    private int educationLevel;

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.BPL")
    public String getBirthplace() {
        return birthplace;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.CHBORN")
    public String getChildBorn() {
        return childBorn;
    }
    
    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "Cmain.EDUCREC")
    public int getEducationLevel() {
        
        return educationLevel;
        
    }
    
    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.EDUCREC")
    public EducationLevel getEducationLevelEnum() {        
        return EducationLevel.getLevel(educationLevel);        
    }   

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.EmploymentIndustry")
    public String getEmploymentIndustry() {
        return employmentIndustry;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.EMPSTAT")
    public int getEmploymentStatus() {
        return employmentStatus;
    }
    
    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.EMPSTAT")
    public EmploymentStatus getEmploymentStatusEnum() {
        return EmploymentStatus.getStatus(employmentStatus);
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.FARM")
    public int getFarmStatus() {
        return farmStatus;
    }
    
    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.FARM")
    public Farm getFarmStatusEnum() {
        return Farm.getStatus(farmStatus);
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.SEX")
    public int getGender() {
        return gender;
    }
    
    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.SEX")
    public Sex getGenderEnum() {
        return Sex.getGender(gender);
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.LABFORCE")
    public int getLaborForce() {
        return laborForce;
    }
    
    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.LABFORCE")
    public LaborForce getLaborForceEnum() {
        return LaborForce.getStatus(laborForce);
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.YRLASTWK")
    public int getLastYearWorked() {
        return lastYearWorked;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.YRLASTWK")
    public LastYearWorked getLastYearWorkedEnum() {
        return LastYearWorked.getLastYear(lastYearWorked);
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.MARST")
    public int getMaritalStatus() {
        return maritalStatus;
    }
    
    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.MARST")
    public MaritalStatus getMaritalStatusEnum() {
        return MaritalStatus.getStatus(maritalStatus);
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.OCC1950")
    public String getOccupation() {
        return occupation;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.OWNERSHP")
    public int getOwnership() {
        return ownership;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.OWNERSHP")
    public Ownership getOwnershipEnum() {
        return Ownership.getOwnershipStatus(ownership);
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.RACE")
    public int getRace() {
        return race;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.RACE")
    public Race getRaceEnum() {
        return Race.getRace(race);
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.RELATE")
    public int getRelationshipWHouseholder() {
        return relationshipWHouseholder;
    }
    
    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.RELATE")
    public RelationWHeadHouse getRelationshipWHouseholderEnum() {
        return RelationWHeadHouse.getRelationship(relationshipWHouseholder);
    }

     @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.MIGPLAC5")
    public String getResidence5YearsAgo() {
        return residence5YearsAgo;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.MIGRATE5")
    public int getResidentialStatus() {
        return residentialStatus;
    }
    
    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.MIGRATE5")
    public ResidentialStatus getResidentialStatusEnum() {
        return ResidentialStatus.getStatus(residentialStatus);
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.SCHOOL")
    public int getSchoolStatus() {
        return schoolStatus;
    }
    
    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.SCHOOL")
     public SchoolStatus getSchoolStatusEnum() {
        return SchoolStatus.getStatus(schoolStatus);
    }

     @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.SCHLTYPE")
    public int getSchoolType() {
        return schoolType;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.SCHLTYPE")
    public SchoolType getSchoolTypeEnum() {
        return SchoolType.getSchoolType(schoolType);
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.VETSTAT")
    public int getVeteranStatus() {
        return veteranStatus;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.VETSTAT")
    public VeteranStatus getVeteranStatusEnum() {
        return VeteranStatus.getStatus(veteranStatus);
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.WKSWORK2")
    public int getWeeksWorkedPerYear() {
        return weeksWorkedPerYear;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.WKSWORK2")
    public WeeksWorkedPerYear getWeeksWorkedPerYearEnum() {
        return WeeksWorkedPerYear.getWeeksWorked(weeksWorkedPerYear);
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.CLASSWKR")
    public int getWorkClass() {
        return workClass;
    }
    
    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.CLASSWKR")
    public WorkingClass getWorkClassEnum() {
        return WorkingClass.getWorkStatus(workClass);
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.HRSWORK2")
    public int getWorkHours() {
        return workHours;
    }
    
    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.HRSWORK2")
    public WorkHours getWorkHoursEnum() {
        return WorkHours.getWorkHours(workHours);
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.ELDCH")
    public int getAgeOfEldestChild() {
        return ageOfEldestChild;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.YNGCH")
    public int getAgeOfYoungestChild() {
        return ageOfYoungestChild;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.FAMUNIT")
    public int getFamilyMembership() {
        return familyMembership;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.INCFARM")
    public int getFarmIncome() {
        return farmIncome;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.POPLOC")
    public int getFathersLocationInHouse() {
        return fathersLocationInHouse;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.ID")
    public int getId() {
        return id;
    }
    
    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.IND1950")
    public int getIndustry1950Basis() {
        return industry1950Basis;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.POPRULE")
    public int getLinkToFather() {
        return linkToFather;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.POPRULE")
    public LinkToFather getLinkToFatherEnum() {

        return LinkToFather.getLink(linkToFather);

    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.MOMRULE")
    public int getLinkToMother() {
        return linkToMother;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.MOMRULE")
    public LinkToMother getLinkToMotherEnum() {

        return LinkToMother.getLink(linkToMother);

    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.SPRULE")
    public int getLinkToSpouse() {
        return linkToSpouse;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.SPRULE")
    public LinkToSpouse getLinkToSpouseEnum() {
        return LinkToSpouse.getLink(linkToSpouse);
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.MOMLOC")
    public int getMothersLocationInHouse() {
        return mothersLocationInHouse;
    }
    
    
    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.MOVEDIN")
    public int getMovedInCode() {
        return movedInCode;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.MOVEDIN")
    public MovedIn getMovedInCodeEnum() {
        return MovedIn.getStatus(movedInCode);
    }
    
    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.NCHILD")
    public int getNonFarmBusinessIncome() {
        return nonFarmBusinessIncome;
    }
    
    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.NCHLT5")
    public int getNumChildenUnderFiveInHouse() {
        return numChildenUnderFiveInHouse;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.NCHLT5")
    public ChildrenUnderFive getNumChildrenUnderFiveInHouseEnum() {
        return ChildrenUnderFive.getNumberChildren(numChildenUnderFiveInHouse);
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.NCHILD")
    public int getNumChildrenInHouse() {
        return numChildrenInHouse;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.NCOUPLES")
    public int getNumCouplesInHouse() {
        return numCouplesInHouse;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.NFAMS")
    public int getNumFamiliesInHouse() {
        return numFamiliesInHouse;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.FAMSIZE")
    public int getNumFamilyMembersInHouse() {
        return numFamilyMembersInHouse;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.NFATHERS")
    public int getNumFathersInHouse() {
        return numFathersInHouse;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.NMOTHERS")
    public int getNumMothersInHouse() {
        return numMothersInHouse;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.NSIBS")
    public int getNumSiblingsInHouse() {
        return numSiblingsInHouse;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.OCC1950")
    public int getOccupation1950Basis() {
        return occupation1950Basis;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.OCCSCORE")
    public int getOccupationIncomeScore() {
        return occupationIncomeScore;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.INCOTHER")
    public int getOtherIncome() {
        return otherIncome;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.POVERTY")
    public int getPovertyStatus() {
        return povertyStatus;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.STEPPOP")
    public int getProbableStepFather() {
        return probableStepFather;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.STEPMOM")
    public int getProbableStepMother() {
        return probableStepMother;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.RENT")
    public int getRent() {
        return rent;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.INCSS")
    public int getSocialSecurityIncome() {
        return socialSecurityIncome;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.SEI")
    public int getSocioEconomicIndex() {
        return socioEconomicIndex;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.SPLOC")
    public int getSpouseLocationInHouse() {
        return spouseLocationInHouse;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.FTOTINC")
    public int getTotalFamilyIncome() {
        return totalFamilyIncome;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.INCTOT")
    public int getTotalPersonalIncome() {
        return totalPersonalIncome;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.VALUE")
    public int getValue() {
        return value;
    }

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.INCWAGE")
    public int getWageAndSalaryIncome() {
        return wageAndSalaryIncome;
    }
    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.INCWELFR")
    public int getWelfareIncome() {
        return welfareIncome;
    }    
     
    private int employmentStatus;
    private int farmStatus;
    private int id;
    private int laborForce;
    private int lastYearWorked;
    private int maritalStatus;
    private int ownership;
    private int race;
    private int relationshipWHouseholder;
    private int residentialStatus;
    private int schoolStatus;
    private int schoolType;
    private int gender;
    private int veteranStatus;
    private int weeksWorkedPerYear;
    private int workHours;
    private int workClass;
    private int value;
    private int rent;
    private int totalFamilyIncome;
    private int numFamiliesInHouse;
    private int numCouplesInHouse;
    private int numMothersInHouse;
    private int numFathersInHouse;
    private int mothersLocationInHouse;
    private int probableStepMother;
    private int linkToMother;
    private int fathersLocationInHouse;
    private int probableStepFather;
    private int linkToFather;
    private int spouseLocationInHouse;
    private int linkToSpouse;
    private int numFamilyMembersInHouse;
    private int numChildrenInHouse;
    private int numChildenUnderFiveInHouse;
    private int familyMembership;
    private int ageOfEldestChild;
    private int ageOfYoungestChild;
    private int numSiblingsInHouse;
    private int occupation1950Basis;
    private int occupationIncomeScore;
    private int socioEconomicIndex;
    private int industry1950Basis;
    private int totalPersonalIncome;
    private int wageAndSalaryIncome;
    private int nonFarmBusinessIncome;
    private int farmIncome;
    private int socialSecurityIncome;
    private int welfareIncome;
    private int otherIncome;
    private int povertyStatus;
    private int movedInCode;
    
    private String childBorn;   
    private String birthplace;
    private String employmentIndustry;
    private String residence5YearsAgo;
    private String occupation;
    private int age;

    @TaDaMethod(variablesToTrack = "temp$0", correspondingDatabaseAttribute = "main.AGE")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
