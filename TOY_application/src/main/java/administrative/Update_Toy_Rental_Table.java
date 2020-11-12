package administrative;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import customers.CartActivity;
import customers.Login;
import customers.RentalProcedureImpl;
import databaseConnectivity.DbUtility;
import getMyFiles.Toy_RentalToCSV;
import logout.LoggingOff;

public class Update_Toy_Rental_Table extends CartActivity {

	public static void update() {
		try {
			Connection conn = DbUtility.getNetwork();

			if (arr[0] != 0) {
				String sql1 = "insert into toy_rental(Customer_Id,Toy_Id,Rental_Start_Date,Rental_End_Date,Rental_Amount_Per_Day,Total_Amount)"
						+ "values(?,?,?,?,?,?)";
				PreparedStatement stmt1 = conn.prepareStatement(sql1);
				stmt1.setInt(1, Login.getCustomerId());
				stmt1.setInt(2, arr[0]);
				stmt1.setString(3, GetDate.getStartdate());
				stmt1.setString(4, GetDate.getEnddate());
				stmt1.setInt(5, Rental_Amount_Item_0.getRent());
				stmt1.setLong(6, Rental_Amount_Item_0.getTotalAmount());
				stmt1.executeUpdate();
				stmt1.close();
				Process_Rental_ID.arr0();

				/*
				 * stmt.setString(6, x); stmt.setString(7, x); stmt.setString(8, x);
				 */
			}
			// ******************************************************************************************************************************

			if (arr[1] != 0) {
				String sql2 = "insert into toy_rental(Customer_Id,Toy_Id,Rental_Start_Date,Rental_End_Date,Rental_Amount_Per_Day,Total_Amount)"
						+ "values(?,?,?,?,?,?)";
				PreparedStatement stmt2 = conn.prepareStatement(sql2);
				stmt2.setInt(1, Login.getCustomerId());
				stmt2.setInt(2, arr[1]);
				stmt2.setString(3, GetDate.getStartdate());
				stmt2.setString(4, GetDate.getEnddate());
				stmt2.setInt(5, Rental_Amount_Item_1.getRent());
				stmt2.setLong(6, Rental_Amount_Item_1.getTotalAmount());
				stmt2.executeUpdate();

				stmt2.close();
				Process_Rental_ID.arr1();
				/*
				 * stmt.setString(6, x); stmt.setString(7, x); stmt.setString(8, x);
				 */
			}

			// *********************************************************************************************************************************
			if (arr[2] != 0) {
				String sql3 = "insert into toy_rental(Customer_Id,Toy_Id,Rental_Start_Date,Rental_End_Date,Rental_Amount_Per_Day,Total_Amount)"
						+ "values(?,?,?,?,?,?)";
				PreparedStatement stmt3 = conn.prepareStatement(sql3);
				stmt3.setInt(1, Login.getCustomerId());
				stmt3.setInt(2, arr[2]);
				stmt3.setString(3, GetDate.getStartdate());
				stmt3.setString(4, GetDate.getEnddate());
				stmt3.setInt(5, Rental_Amount_Item_2.getRent());
				stmt3.setLong(6, Rental_Amount_Item_2.getTotalAmount());
				stmt3.executeUpdate();
				stmt3.close();
				Process_Rental_ID.arr2();

				/*
				 * stmt.setString(6, x); stmt.setString(7, x); stmt.setString(8, x);
				 */
			}
			// ******************************************************************************************************************************
			if (arr[3] != 0) {
				String sql4 = "insert into toy_rental(Customer_Id,Toy_Id,Rental_Start_Date,Rental_End_Date,Rental_Amount_Per_Day,Total_Amount)"
						+ "values(?,?,?,?,?,?)";
				PreparedStatement stmt4 = conn.prepareStatement(sql4);
				stmt4.setInt(1, Login.getCustomerId());
				stmt4.setInt(2, arr[3]);
				stmt4.setString(3, GetDate.getStartdate());
				stmt4.setString(4, GetDate.getEnddate());
				stmt4.setInt(5, Rental_Amount_Item_3.getRent());
				stmt4.setLong(6, Rental_Amount_Item_3.getTotalAmount());
				stmt4.executeUpdate();
				stmt4.close();
				Process_Rental_ID.arr3();
				/*
				 * stmt.setString(6, x); stmt.setString(7, x); stmt.setString(8, x);
				 */
			}
			// ******************************************************************************************************************************

			if (arr[4] != 0) {
				String sql5 = "insert into toy_rental(Customer_Id,Toy_Id,Rental_Start_Date,Rental_End_Date,Rental_Amount_Per_Day,Total_Amount)"
						+ "values(?,?,?,?,?,?)";
				PreparedStatement stmt5 = conn.prepareStatement(sql5);
				stmt5.setInt(1, Login.getCustomerId());
				stmt5.setInt(2, arr[4]);
				stmt5.setString(3, GetDate.getStartdate());
				stmt5.setString(4, GetDate.getEnddate());
				stmt5.setInt(5, Rental_Amount_Item_4.getRent());
				stmt5.setLong(6, Rental_Amount_Item_4.getTotalAmount());
				stmt5.executeUpdate();
				stmt5.close();
				Process_Rental_ID.arr4();
				/*
				 * stmt.setString(6, x); stmt.setString(7, x); stmt.setString(8, x);
				 */
			}
			// ******************************************************************************************************************************

			if (arr[5] != 0) {
				String sql6 = "insert into toy_rental(Customer_Id,Toy_Id,Rental_Start_Date,Rental_End_Date,Rental_Amount_Per_Day,Total_Amount)"
						+ "values(?,?,?,?,?,?)";
				PreparedStatement stmt6 = conn.prepareStatement(sql6);
				stmt6.setInt(1, Login.getCustomerId());
				stmt6.setInt(2, arr[5]);
				stmt6.setString(3, GetDate.getStartdate());
				stmt6.setString(4, GetDate.getEnddate());
				stmt6.setInt(5, Rental_Amount_Item_5.getRent());
				stmt6.setLong(6, Rental_Amount_Item_5.getTotalAmount());
				stmt6.executeUpdate();
				stmt6.close();
				Process_Rental_ID.arr5();
				/*
				 * stmt.setString(6, x); stmt.setString(7, x); stmt.setString(8, x);
				 */
			}
			// ******************************************************************************************************************************

			if (arr[6] != 0) {
				String sql7 = "insert into toy_rental(Customer_Id,Toy_Id,Rental_Start_Date,Rental_End_Date,Rental_Amount_Per_Day,Total_Amount)"
						+ "values(?,?,?,?,?,?)";
				PreparedStatement stmt7 = conn.prepareStatement(sql7);
				stmt7.setInt(1, Login.getCustomerId());
				stmt7.setInt(2, arr[6]);
				stmt7.setString(3, GetDate.getStartdate());
				stmt7.setString(4, GetDate.getEnddate());
				stmt7.setInt(5, Rental_Amount_Item_6.getRent());
				stmt7.setLong(6, Rental_Amount_Item_6.getTotalAmount());
				stmt7.executeUpdate();
				stmt7.close();
				Process_Rental_ID.arr6();
				/*
				 * stmt.setString(6, x); stmt.setString(7, x); stmt.setString(8, x);
				 */
			}
			// ******************************************************************************************************************************

			if (arr[7] != 0) {
				String sql8 = "insert into toy_rental(Customer_Id,Toy_Id,Rental_Start_Date,Rental_End_Date,Rental_Amount_Per_Day,Total_Amount)"
						+ "values(?,?,?,?,?,?)";
				PreparedStatement stmt8 = conn.prepareStatement(sql8);
				stmt8.setInt(1, Login.getCustomerId());
				stmt8.setInt(2, arr[7]);
				stmt8.setString(3, GetDate.getStartdate());
				stmt8.setString(4, GetDate.getEnddate());
				stmt8.setInt(5, Rental_Amount_Item_7.getRent());
				stmt8.setLong(6, Rental_Amount_Item_7.getTotalAmount());
				stmt8.executeUpdate();
				stmt8.close();
				Process_Rental_ID.arr7();
				/*
				 * stmt.setString(6, x); stmt.setString(7, x); stmt.setString(8, x);
				 */
			}
			// ******************************************************************************************************************************

			if (arr[8] != 0) {
				String sql9 = "insert into toy_rental(Customer_Id,Toy_Id,Rental_Start_Date,Rental_End_Date,Rental_Amount_Per_Day,Total_Amount)"
						+ "values(?,?,?,?,?,?)";
				PreparedStatement stmt9 = conn.prepareStatement(sql9);
				stmt9.setInt(1, Login.getCustomerId());
				stmt9.setInt(2, arr[8]);
				stmt9.setString(3, GetDate.getStartdate());
				stmt9.setString(4, GetDate.getEnddate());
				stmt9.setInt(5, Rental_Amount_Item_8.getRent());
				stmt9.setLong(6, Rental_Amount_Item_8.getTotalAmount());
				stmt9.executeUpdate();
				stmt9.close();
				Process_Rental_ID.arr8();
				/*
				 * stmt.setString(6, x); stmt.setString(7, x); stmt.setString(8, x);
				 */
			}
			// ******************************************************************************************************************************

			if (arr[9] != 0) {
				String sql10 = "insert into toy_rental(Customer_Id,Toy_Id,Rental_Start_Date,Rental_End_Date,Rental_Amount_Per_Day,Total_Amount)"
						+ "values(?,?,?,?,?,?)";
				PreparedStatement stmt10 = conn.prepareStatement(sql10);
				stmt10.setInt(1, Login.getCustomerId());
				stmt10.setInt(2, arr[9]);
				stmt10.setString(3, GetDate.getStartdate());
				stmt10.setString(4, GetDate.getEnddate());
				stmt10.setInt(5, Rental_Amount_Item_9.getRent());
				stmt10.setLong(6, Rental_Amount_Item_9.getTotalAmount());
				stmt10.executeUpdate();
				stmt10.close();
				Process_Rental_ID.arr9();
				/*
				 * stmt.setString(6, x); stmt.setString(7, x); stmt.setString(8, x);
				 */
			}

			Toy_RentalToCSV.getRentalData();
			conn.close();

			System.out.println("your order is placed");

			/*
			 * if(arr[0]!=0) {
			 * 
			 * } if(arr[1]!=0) {
			 * 
			 * } if(arr[2]!=0) {
			 * 
			 * } if(arr[3]!=0) {
			 * 
			 * } if(arr[4]!=0) {
			 * 
			 * } if(arr[5]!=0) {
			 * 
			 * } if(arr[6]!=0) {
			 * 
			 * } if(arr[7]!=0) {
			 * 
			 * } if(arr[8]!=0) {
			 * 
			 * } if(arr[9]!=0) {
			 * 
			 * }
			 * 
			 * 
			 */

			LoggingOff.loggingMeOff();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
