package durbodax.commands;

import static org.junit.Assert.*;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class RunEveryone {

	@Test
	public void test() {

		try {
			Connection conn = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/priest_durbodax",
					"root", "-password--");
			Statement stmt = (Statement) conn.createStatement();
			String query = "select ID from main;";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				String args = rs.getString("ID");
				System.out.println("flow:1");
				// String params = "ComputeInLawTax 737"; //1->737
				ComputeInLawTax instance1 = new ComputeInLawTax();
				System.out.println("TestCase: ComputeInLaw Test Case");
				String params = "ComputeInLaw " + args;
				instance1.execute(params.split(" "));
				ComputeIncomeTaxSingle instance2 = new ComputeIncomeTaxSingle();
				System.out
						.println("TestCase: ComputeIncomeTaxSingle Test Case");
				params = "ComputeIncomeTaxSingle " + args;
				instance2.execute(params.split(" "));
				ComputeChildCredit instance3 = new ComputeChildCredit();
				System.out.println("TestCase: ComputeChildCredit Test Case");
				params = "ComputeChildCredit " + args;
				instance3.execute(params.split(" "));
				ComputePromo instance4 = new ComputePromo();
				System.out.println("TestCase: ComputePromo Test Case");
				params = "ComputePromo " + args;
				instance4.execute(params.split(" "));
				ComputeEmployedMomCredit instance5 = new ComputeEmployedMomCredit();
				System.out
						.println("TestCase: ComputeEmploymedMomCredit Test Case");
				params = "ComputeEmploymedMomCredit " + args;
				instance5.execute(params.split(" "));
				System.out.print("TestCase: ComputeBplTravel Test Case");
				ComputeBplTravel instance6 = new ComputeBplTravel();

				params = "ComputeBplTravel " + args;
				instance6.execute(params.split(" "));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
