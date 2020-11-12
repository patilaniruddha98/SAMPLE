package administrative;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import customers.Login;
import customers.RentalProcedureImpl;
import databaseConnectivity.DbUtility;

public class Process_Rental_ID extends RentalProcedureImpl {

	static Rental_ID r1 = new Rental_ID();
	static Rental_ID r2 = new Rental_ID();
	static Rental_ID r3 = new Rental_ID();
	static Rental_ID r4 = new Rental_ID();
	static Rental_ID r5 = new Rental_ID();
	static Rental_ID r6 = new Rental_ID();
	static Rental_ID r7 = new Rental_ID();
	static Rental_ID r8 = new Rental_ID();
	static Rental_ID r9 = new Rental_ID();
	static Rental_ID r10 = new Rental_ID();

	public static void arr0() throws Exception {
		Connection conn = DbUtility.getNetwork();
		String sql = "select*from toy_rental where customer_id=? and toy_id=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, Login.getCustomerId());
		stmt.setInt(2, t.getToyId());
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			r1.setRentalId(rs.getInt("Rental_id"));
		}

		System.out.println("your order id for item 1: " + r1.getRentalId());

		rs.close();
		stmt.close();
		conn.close();

	}

	// *****************************************************************************************************************

	public static void arr1() throws Exception {
		Connection conn = DbUtility.getNetwork();
		String sql = "select*from toy_rental where customer_id=? and toy_id=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, Login.getCustomerId());
		stmt.setInt(2, t.getToyId());
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			r2.setRentalId(rs.getInt("Rental_id"));
		}
		System.out.println("your order id for item 2: " + r2.getRentalId());
		rs.close();
		stmt.close();
		conn.close();

	}

	// *****************************************************************************************************************

	public static void arr2() throws Exception {
		Connection conn = DbUtility.getNetwork();
		String sql = "select*from toy_rental where customer_id=? and toy_id=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, Login.getCustomerId());
		stmt.setInt(2, t.getToyId());
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			r3.setRentalId(rs.getInt("Rental_id"));
		}
		System.out.println("your order id for item 3: " + r3.getRentalId());
		rs.close();
		stmt.close();
		conn.close();
	}

	// *****************************************************************************************************************

	public static void arr3() throws Exception {
		Connection conn = DbUtility.getNetwork();
		String sql = "select*from toy_rental where customer_id=? and toy_id=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, Login.getCustomerId());
		stmt.setInt(2, t.getToyId());
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			r4.setRentalId(rs.getInt("Rental_id"));
		}
		System.out.println("your order id for item 4: " + r4.getRentalId());
		rs.close();
		stmt.close();
		conn.close();
	}

	// *************************************************************************************************************************
	public static void arr4() throws Exception {
		Connection conn = DbUtility.getNetwork();
		String sql = "select*from toy_rental where customer_id=? and toy_id=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, Login.getCustomerId());
		stmt.setInt(2, t.getToyId());
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			r5.setRentalId(rs.getInt("Rental_id"));
		}
		System.out.println("your order id for item 5: " + r5.getRentalId());
		rs.close();
		stmt.close();
		conn.close();
	}

	// *************************************************************************************************************************
	public static void arr5() throws Exception {
		Connection conn = DbUtility.getNetwork();
		String sql = "select*from toy_rental where customer_id=? and toy_id=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, Login.getCustomerId());
		stmt.setInt(2, t.getToyId());
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			r6.setRentalId(rs.getInt("Rental_id"));
		}
		System.out.println("your order id for item 6: " + r6.getRentalId());
		rs.close();
		stmt.close();
		conn.close();
	}

	// *************************************************************************************************************************
	public static void arr6() throws Exception {
		Connection conn = DbUtility.getNetwork();
		String sql = "select*from toy_rental where customer_id=? and toy_id=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, Login.getCustomerId());
		stmt.setInt(2, t.getToyId());
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			r7.setRentalId(rs.getInt("Rental_id"));
		}
		System.out.println("your order id for item 7: " + r7.getRentalId());
		rs.close();
		stmt.close();
		conn.close();
	}

	// *************************************************************************************************************************
	public static void arr7() throws Exception {
		Connection conn = DbUtility.getNetwork();
		String sql = "select*from toy_rental where customer_id=? and toy_id=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, Login.getCustomerId());
		stmt.setInt(2, t.getToyId());
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			r8.setRentalId(rs.getInt("Rental_id"));
		}
		System.out.println("your order id for item 8: " + r8.getRentalId());
		rs.close();
		stmt.close();
		conn.close();
	}

	// ***********************************************************************************************
	public static void arr8() throws Exception {
		Connection conn = DbUtility.getNetwork();
		String sql = "select*from toy_rental where customer_id=? and toy_id=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, Login.getCustomerId());
		stmt.setInt(2, t.getToyId());
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			r9.setRentalId(rs.getInt("Rental_id"));
		}
		System.out.println("your order id for item 9: " + r9.getRentalId());
		rs.close();
		stmt.close();
		conn.close();
	}

	// ***********************************************************************************************
	public static void arr9() throws Exception {
		Connection conn = DbUtility.getNetwork();
		String sql = "select*from toy_rental where customer_id=? and toy_id=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, Login.getCustomerId());
		stmt.setInt(2, t.getToyId());
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			r10.setRentalId(rs.getInt("Rental_id"));
		}
		System.out.println("your order id for item 10: " + r10.getRentalId());
		rs.close();
		stmt.close();
		conn.close();
	}

}
