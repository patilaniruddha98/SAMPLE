package customers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import databaseConnectivity.DbUtility;
import getMyFiles.Customer_exportToCSV;

public class CustomerServiceImpl implements Customer_Service, Registration_Service {

	@Override
	public void getCustomers() {

//		try {
//			Connection conn = DbUtility.getNetwork();

		Scanner s = new Scanner(System.in);
		System.out.print("Customer name:");
		String x = s.nextLine();
		Login.setCustomerName(x);
		System.out.print("Password:");
		String y = s.nextLine();
		Login.setCustomerPassword(y);

		Home_Page.homepage();

		/*
		 * String sql = "select * from customer where Customer_name=? and Pass_word=?";
		 * PreparedStatement stmt = conn.prepareStatement(sql); stmt.setString(1,
		 * Login.getCustomerName()); stmt.setString(2, (Login.getCustomerPassword()));
		 * ResultSet rs = stmt.executeQuery();
		 * 
		 * if (rs.next()) {
		 * 
		 * System.out.println("login successful"); //
		 * *****************************************************************************
		 * *************************************************
		 * 
		 * Login.setCustomerState(rs.getString("State"));
		 * Login.setCustomerCity(rs.getString("city"));
		 * Login.setCustomerCountry(rs.getString("country"));
		 * Login.setCustomerZip(rs.getInt("zip"));
		 * Login.setCustomerId(rs.getInt("customer_id"));
		 * 
		 * //
		 * *****************************************************************************
		 * ************************************************* SearchToys.search();
		 * 
		 * } else {
		 * 
		 * System.out.println("username or password is incorrect"); CustomerServiceImpl
		 * customerService = new CustomerServiceImpl(); customerService.getCustomers();
		 * }
		 * 
		 * rs.close(); stmt.close(); conn.close();
		 * 
		 * } catch (Exception e) { // TODO Auto-generated catch block
		 * 
		 * e.printStackTrace();
		 * 
		 * }
		 */
	}

	public void getCustomerData() {

		try {

			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);

			System.out.println("welcome to registration portal");

			System.out.println("Customer Name: ");
			RegistrationData.setCustomerName(s.nextLine());

			System.out.println("Password: ");
			RegistrationData.setCustomerPassword(s.nextLine());

			System.out.println("Country: ");
			RegistrationData.setCustomerCountry(s.nextLine());
			System.out.println("City: ");
			RegistrationData.setCustomerCity(s.nextLine());

			System.out.println("State: ");
			RegistrationData.setCustomerState(s.nextLine());

			System.out.println("Zip: ");
			RegistrationData.setCustomerZip(s.nextInt());

			System.out.println("enter 0 to proceed else 1 to fill again");
			int m = s.nextInt();

			if (m == 0) {
				Connection conn = DbUtility.getNetwork();
				String sql = "insert into customer(Customer_Name,Pass_word,City,State,Zip,Country) values(?,?,?,?,?,?)";
				PreparedStatement stmt = conn.prepareStatement(sql);
				stmt.setString(1, RegistrationData.getCustomerName());
				stmt.setString(2, RegistrationData.getCustomerPassword());
				stmt.setString(3, RegistrationData.getCustomerCity());
				stmt.setString(4, RegistrationData.getCustomerState());
				stmt.setInt(5, RegistrationData.getCustomerZip());
				stmt.setString(6, RegistrationData.getCustomerCountry());
				stmt.executeUpdate();

				System.out.println("Registration is done");
				Customer_exportToCSV yes1 = new Customer_exportToCSV();
				yes1.customerData();
				CustomerServiceImpl customerService = new CustomerServiceImpl();
				customerService.getCustomers();

				stmt.close();
				conn.close();
			} else if (m == 1) {
				CustomerServiceImpl customerService = new CustomerServiceImpl();
				customerService.getCustomerData();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
