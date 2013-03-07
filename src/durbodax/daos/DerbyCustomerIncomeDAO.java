/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package durbodax.daos;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author SimmonsD
 */
public class DerbyCustomerIncomeDAO implements CustomerIncomeDAO {

    public int getTotalDistinctIncomes()
    {
        ResultSet rs;
        Statement s;
        Connection conn = DerbyDAOFactory.getConnection();
        int total = 0;
        String selectQuery = "SELECT COUNT(DISTINCT INCTOT) FROM MAIN ";
        System.out.println("flow:444");
        try{
        	System.out.println("flow:445");
            s = conn.createStatement();
            rs = s.executeQuery(selectQuery);

            if (rs.next()) {
            	System.out.println("flow:446");
               total = rs.getInt(1);
            }
        }
        catch(SQLException e){
        	System.out.println("flow:447");
            System.err.println("Select Failed: " + e.toString());
        }
        return total;

    }

    public int getTotalIncomesBelowGivenIncome(int income)
    {
        ResultSet rs;
        Statement s;
        Connection conn = DerbyDAOFactory.getConnection();
        int total = 0;
        String selectQuery = "SELECT COUNT(DISTINCT INCTOT) FROM MAIN WHERE INCTOT <"+income;
        System.out.println("flow:448");
        try{
        	System.out.println("flow:449");
            s = conn.createStatement();
            rs = s.executeQuery(selectQuery);

            if (rs.next()) {
            	System.out.println("flow:450");
               total = rs.getInt(1);
            }
        }
        catch(SQLException e){
        	System.out.println("flow:451");
            System.err.println("Select Failed: " + e.toString());
        }
        return total;


    }

}
