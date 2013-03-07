package durbodax.daos;

import java.sql.*;

/**
 * DerbyDAOFactory concrete implementation of the DAOFactory
 * @author gbeckenbaugh
 */
public class DerbyDAOFactory extends DAOFactory {

    private static Connection _conn;

    /**
     * getConnection connects to the ipums DB
     * @return Connection
     */
    public static Connection getConnection(){
     	System.out.println("flow:452");
        if (_conn != null){
         	System.out.println("flow:453");
            return _conn;
        }
        // load driver
        //String driver = "org.apache.derby.jdbc.ClientDriver";
        String driver = "com.mysql.jdbc.Driver";
        // set the database name
        //String dbName = "priest_durbodax_permuted";
        String dbName = "priest_durbodax";
        // define the Derby connection URL to use
        String connectionURL = "jdbc:mysql://honeypot:33061/" + dbName;// + ";create=true";

        try{
         	System.out.println("flow:454");
            Class.forName(driver);}
        catch(java.lang.ClassNotFoundException e){
         	System.out.println("flow:455");
            System.err.println("Load Driver Failed: "+ e.toString());
        }
        try{
         	System.out.println("flow:456");
            _conn = DriverManager.getConnection(connectionURL, "root", "--password--");
        }
        catch (SQLException e){
         	System.out.println("flow:457");
            System.err.println("Get Connection Failed: " + e.toString());
        }
        return _conn;

    }
    /**
     * DerbyCustomerDAO concrete implementation of the CustomerDAO
     * @return DerbyCustomerDAO
     */
    public DerbyCustomerDAO getCustomerDAO() {
     	System.out.println("flow:458");
        return new DerbyCustomerDAO();
    }

    /**
     * DerbyMarketingDAO concrete implementation of the MarketingDAO
     * @return DerbyMarketingDAO
     */
    public DerbyMarketingDAO getMarketingDAO(){
     	System.out.println("flow:459");
        return new DerbyMarketingDAO();
    }

    /**
     * DerbyCutomerIncomeDAO concrete implementation of the CustomerIncomeDAO
     * @return DerbyCutomerIncomeDAO
     */
    public DerbyCustomerIncomeDAO getIncomeDAO() {
     	System.out.println("flow:460");
        return new DerbyCustomerIncomeDAO();
    }

        /**
     * DerbyCutomerIncomeDAO concrete implementation of the CustomerIncomeDAO
     * @return DerbyCutomerIncomeDAO
     */
    public DerbyCustomerCompareDAO getCompareDAO() {
     	System.out.println("flow:461");
        return new DerbyCustomerCompareDAO();
    }

}
