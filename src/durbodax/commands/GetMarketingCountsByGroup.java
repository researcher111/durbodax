/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package durbodax.commands;

import durbodax.daos.*;
import durbodax.dtos.*;
import java.util.*;

/**
 * GetMarketingCountsByGroup returns counts by Age, Income, BirthPlace and
 * Marital Status
 * @author gbeckenbauugh
 */
public class GetMarketingCountsByGroup implements Command {

    /**
     * default constructor
     */
    public GetMarketingCountsByGroup() {
    	System.out.println("flow:189");
    }

    /**
     * parseInput - parses an array from command line
     * @param paramsIn - String[]
     * @return MarketingRequestDTO (Data Transfer Object)
     */
    private MarketingRequestDTO parseInput(String[] paramsIn) {
    	System.out.println("flow:190");
        MarketingRequestDTO m = new MarketingRequestDTO();

        String[] sAge = null;
        sAge = paramsIn[3].split("-");
        String[] sIncome = null;
        sIncome = paramsIn[4].split("-");

        try {
        	System.out.println("flow:191");
            m.setTopOrBottom(paramsIn[1]);
            m.setGroupSize(Integer.parseInt(paramsIn[2]));
            m.setAgeFrom(Integer.parseInt(sAge[0]));
            m.setAgeTo(Integer.parseInt(sAge[1]));
            m.setIncomeFrom(Integer.parseInt(sIncome[0]));
            m.setIncomeTo(Integer.parseInt(sIncome[1]));
            if (paramsIn[5].toLowerCase().equals("all")){
            	System.out.println("flow:192");
                m.setBirthPlace(0);
            } else {
            	System.out.println("flow:193");
                m.setBirthPlace(Integer.parseInt(paramsIn[5]));
                if (m.getBirthPlace() == 0) {
                	System.out.println("flow:194");
                    throw new Exception ("Invalid input parameters");
                }
            }
            if (paramsIn[6].toLowerCase().equals("all")){
            	System.out.println("flow:195");
                m.setMaritalStatus(0);
            } else {
            	System.out.println("flow:196");
                m.setMaritalStatus(Integer.parseInt(paramsIn[6]));
                if (m.getMaritalStatus() == 0) {
                	System.out.println("flow:197");
                    throw new Exception ("Invalid input parameters");
                }
            }
        } catch (Exception e) {
            return null;
        }
        return m;
    }
    /**
     * printOutput - prints results
     * @param mresultIn - ArrayList of MarketingResponseDTO objects
     */
    private void printOutput(ArrayList<MarketingResponseDTO> mresultIn) {

        if (mresultIn.size() == 0) {
        	System.out.println("flow:198");
            System.out.println("No Records found:  Please change parameters and retry.");
        }
        for (int i = 0; i < mresultIn.size(); i++) {
        	System.out.println("flow:199");
            MarketingResponseDTO m = mresultIn.get(i);
            String sCount = Integer.toString(m.getCount()) + "      ";
            System.out.println("Count: " + sCount.substring(0,7) + " Ages: " + m.getAgeDesc() +
                " Incomes: " + m.getIncomeDesc() + " BPL: " + m.getBirthPlace().substring(0, 15) + " " +
                "Marital Status: " + m.getMaritalStatusEnum());
        }
    }
    /**
     * execute - main processing for the Command
     * @param params - String[] from command line
     * @return retObj - Object containing the results
     */
    public Object execute(String[] params) {

        Object retObj = new Object();
        MarketingRequestDTO mReq = parseInput(params);

        if (mReq != null) {
        	System.out.println("flow:200");
            MarketingDAO instance = DAOFactory.getDAOFactory().getMarketingDAO();
            ArrayList<MarketingResponseDTO> mresult = instance.selectMarketingStatsByGroup(mReq);
            retObj = mresult;
            printOutput(mresult);
        } else {
        	System.out.println("flow:201");
            System.out.println("Usage:Top||Bottom GroupSize FromAge-ToAge FromIncome-toIncome Birthplace MaritalStatus");
            System.out.println("EX:  GetMarketingCountsByGroup TOP 10 50-90 40000-75000 Alabama 1");
        }

        return retObj;
    }
}

