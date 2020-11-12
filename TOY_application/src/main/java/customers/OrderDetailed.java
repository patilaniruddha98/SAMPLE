package customers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;

import administrative.GetDate;
import administrative.Rental_Amount_Item_0;
import administrative.Rental_Amount_Item_1;
import administrative.Rental_Amount_Item_2;
import administrative.Rental_Amount_Item_3;
import administrative.Rental_Amount_Item_4;
import administrative.Rental_Amount_Item_5;
import administrative.Rental_Amount_Item_6;
import administrative.Rental_Amount_Item_7;
import administrative.Rental_Amount_Item_8;
import administrative.Rental_Amount_Item_9;
import administrative.Update_Toy_Rental_Table;
import databaseConnectivity.DbUtility;

public class OrderDetailed extends CartActivity {

	public static void finaliseOrder() {
		try {
			Scanner s = new Scanner(System.in);

			SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
			System.out.println("enter start date: ");
			String StartDate = s.nextLine();
			GetDate.setStartdate(StartDate);
			System.out.println("enter end date: ");
			String EndDate = s.nextLine();
			GetDate.setEnddate(EndDate);
			Date date1 = myFormat.parse(StartDate);
			Date date2 = myFormat.parse(EndDate);
			long diff = date2.getTime() - date1.getTime();
			long Total_Days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
			System.out.println("Total days: " + Total_Days);

			Connection conn = DbUtility.getNetwork();

//******************************************************************************************************
			if (arr[0] != 0) {
				String sql1 = "select*from toy where toy_id=?";
				PreparedStatement stmt1 = conn.prepareStatement(sql1);
				stmt1.setInt(1, arr[0]);
				ResultSet rs1 = stmt1.executeQuery();
				while (rs1.next()) {
					Rental_Amount_Item_0.setRent(rs1.getInt("Rental_Amount"));

				}
				System.out.print("Total rent for item 1: ");
				long a = Total_Days * Rental_Amount_Item_0.getRent();
				Rental_Amount_Item_0.setTotalAmount(a);
				System.out.print(" " + a);
				System.out.println();
				rs1.close();
				stmt1.close();
			}
//*****************************************************************************************************
			if (arr[1] != 0) {
				String sql2 = "select*from toy where toy_id=?";
				PreparedStatement stmt2 = conn.prepareStatement(sql2);
				stmt2.setInt(1, arr[1]);
				ResultSet rs2 = stmt2.executeQuery();
				while (rs2.next()) {
					Rental_Amount_Item_1.setRent(rs2.getInt("Rental_Amount"));

				}
				System.out.print("Total rent for item 2: ");
				long a = Total_Days * Rental_Amount_Item_1.getRent();
				Rental_Amount_Item_1.setTotalAmount(a);
				System.out.print(" " + a);
				System.out.println();
				rs2.close();
				stmt2.close();
			}
//*****************************************************************************************************
			if (arr[2] != 0) {
				String sql3 = "select*from toy where toy_id=?";
				PreparedStatement stmt3 = conn.prepareStatement(sql3);
				stmt3.setInt(1, arr[2]);
				ResultSet rs3 = stmt3.executeQuery();
				while (rs3.next()) {
					Rental_Amount_Item_2.setRent(rs3.getInt("Rental_Amount"));

				}
				System.out.print("Total rent for item 3: ");
				long a = Total_Days * Rental_Amount_Item_2.getRent();
				Rental_Amount_Item_2.setTotalAmount(a);
				System.out.print(" " + a);
				System.out.println();
				rs3.close();
				stmt3.close();
			}
//*****************************************************************************************************
			if (arr[3] != 0) {
				String sql4 = "select*from toy where toy_id=?";
				PreparedStatement stmt4 = conn.prepareStatement(sql4);
				stmt4.setInt(1, arr[3]);
				ResultSet rs4 = stmt4.executeQuery();
				while (rs4.next()) {
					Rental_Amount_Item_3.setRent(rs4.getInt("Rental_Amount"));

				}
				System.out.print("Total rent for item 4: ");
				long a = Total_Days * Rental_Amount_Item_3.getRent();
				Rental_Amount_Item_3.setTotalAmount(a);
				System.out.print(" " + a);
				System.out.println();
				rs4.close();
				stmt4.close();
			}
//*****************************************************************************************************
			if (arr[4] != 0) {
				String sql5 = "select*from toy where toy_id=?";
				PreparedStatement stmt5 = conn.prepareStatement(sql5);
				stmt5.setInt(1, arr[4]);
				ResultSet rs5 = stmt5.executeQuery();
				while (rs5.next()) {
					Rental_Amount_Item_4.setRent(rs5.getInt("Rental_Amount"));

				}
				System.out.print("Total rent for item 5: ");
				long a = Total_Days * Rental_Amount_Item_4.getRent();
				Rental_Amount_Item_4.setTotalAmount(a);
				System.out.print(" " + a);
				System.out.println();
				rs5.close();
				stmt5.close();

			}
//*****************************************************************************************************
			if (arr[5] != 0) {
				String sql6 = "select*from toy where toy_id=?";
				PreparedStatement stmt6 = conn.prepareStatement(sql6);
				stmt6.setInt(1, arr[5]);
				ResultSet rs6 = stmt6.executeQuery();
				while (rs6.next()) {
					Rental_Amount_Item_5.setRent(rs6.getInt("Rental_Amount"));

				}
				System.out.print("Total rent for item 6: ");
				long a = Total_Days * Rental_Amount_Item_5.getRent();
				Rental_Amount_Item_5.setTotalAmount(a);
				System.out.print(" " + a);
				System.out.println();
				rs6.close();
				stmt6.close();

			}
//*****************************************************************************************************
			if (arr[6] != 0) {
				String sql7 = "select*from toy where toy_id=?";
				PreparedStatement stmt7 = conn.prepareStatement(sql7);
				stmt7.setInt(1, arr[6]);
				ResultSet rs7 = stmt7.executeQuery();
				while (rs7.next()) {
					Rental_Amount_Item_6.setRent(rs7.getInt("Rental_Amount"));

				}
				System.out.print("Total rent for item 7: ");
				long a = Total_Days * Rental_Amount_Item_6.getRent();
				Rental_Amount_Item_6.setTotalAmount(a);
				System.out.print(" " + a);
				System.out.println();
				rs7.close();
				stmt7.close();
			}
//*****************************************************************************************************
			if (arr[7] != 0) {
				String sql8 = "select*from toy where toy_id=?";
				PreparedStatement stmt8 = conn.prepareStatement(sql8);
				stmt8.setInt(1, arr[7]);
				ResultSet rs8 = stmt8.executeQuery();
				while (rs8.next()) {
					Rental_Amount_Item_7.setRent(rs8.getInt("Rental_Amount"));

				}
				System.out.print("Total rent for item 8: ");
				long a = Total_Days * Rental_Amount_Item_7.getRent();
				Rental_Amount_Item_7.setTotalAmount(a);
				System.out.print(" " + a);
				System.out.println();
				rs8.close();
				stmt8.close();

			}
//*****************************************************************************************************
			if (arr[8] != 0) {
				String sql9 = "select*from toy where toy_id=?";
				PreparedStatement stmt9 = conn.prepareStatement(sql9);
				stmt9.setInt(1, arr[8]);
				ResultSet rs9 = stmt9.executeQuery();
				while (rs9.next()) {
					Rental_Amount_Item_8.setRent(rs9.getInt("Rental_Amount"));

				}
				System.out.print("Total rent for item 9: ");
				long a = Total_Days * Rental_Amount_Item_8.getRent();
				Rental_Amount_Item_8.setTotalAmount(a);
				System.out.print(" " + a);
				System.out.println();
				rs9.close();
				stmt9.close();
			}
//*****************************************************************************************************
			if (arr[9] != 0) {
				String sql10 = "select*from toy where toy_id=?";
				PreparedStatement stmt10 = conn.prepareStatement(sql10);
				stmt10.setInt(1, arr[9]);
				ResultSet rs10 = stmt10.executeQuery();
				while (rs10.next()) {
					Rental_Amount_Item_9.setRent(rs10.getInt("Rental_Amount"));

				}
				System.out.print("Total rent for item 10: ");
				long a = Total_Days * Rental_Amount_Item_9.getRent();
				Rental_Amount_Item_9.setTotalAmount(a);
				System.out.print(" " + a);
				System.out.println();
				rs10.close();
				stmt10.close();

			}

//***************************************************************************************************************
//***************************************************************************************************************
//***************************************************************************************************************

			// conn.close();
			long overall = Rental_Amount_Item_0.getTotalAmount() + Rental_Amount_Item_1.getTotalAmount()
					+ Rental_Amount_Item_2.getTotalAmount() + Rental_Amount_Item_3.getTotalAmount()
					+ Rental_Amount_Item_4.getTotalAmount() + Rental_Amount_Item_5.getTotalAmount()
					+ Rental_Amount_Item_6.getTotalAmount() + Rental_Amount_Item_7.getTotalAmount()
					+ Rental_Amount_Item_8.getTotalAmount() + Rental_Amount_Item_9.getTotalAmount();

			System.out.println("overall amount you need to pay: " + overall);

			System.out.println("enter 1 to confirm the order");
			int p = s.nextInt();
			if (p == 1) {
				Update_Toy_Rental_Table.update();
			}

			/*
			 * if(arr[0]!=0) { System.out.print("Total rent: "); long a=Total_Days +
			 * Rental_Amount_Item_0.getRent(); }
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
