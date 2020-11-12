package customers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import databaseConnectivity.DbUtility;

public class Home_Page {
	public static void homepage() {
		try {
			Connection conn = DbUtility.getNetwork();
			String sql = "select * from customer where Customer_name=? and Pass_word=?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, Login.getCustomerName());
			stmt.setString(2, (Login.getCustomerPassword()));
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {

				System.out.println("Welcome " + Login.getCustomerName());
				// ******************************************************************************************************************************

				Login.setCustomerState(rs.getString("State"));
				Login.setCustomerCity(rs.getString("city"));
				Login.setCustomerCountry(rs.getString("country"));
				Login.setCustomerZip(rs.getInt("zip"));
				Login.setCustomerId(rs.getInt("customer_id"));

				// ******************************************************************************************************************************
				SearchToys.search();

			} else {

				System.out.println("username or password is incorrect");
				CustomerServiceImpl customerService = new CustomerServiceImpl();
				customerService.getCustomers();
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block

			e.printStackTrace();

		}
	}

}
