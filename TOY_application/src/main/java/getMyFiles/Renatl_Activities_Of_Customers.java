package getMyFiles;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

import databaseConnectivity.DbUtility;

public class Renatl_Activities_Of_Customers {
	public static void renatl_Activities_Of_Customers() {
		try {
			Scanner s = new Scanner(System.in);
			Connection conn = DbUtility.getNetwork();
			System.out.println("enter the customer id: ");
			int g = s.nextInt();
			String sql = "select customer.customer_id,Customer_Name,City,State,Zip,Country,Toy_Id,Rental_Start_Date,Rental_End_Date,Rental_Amount_Per_Day,Total_Amount,Fine,Toy_Status from customer,toy_rental \r\n"
					+ "where customer.customer_id=toy_rental.customer_id and customer.customer_id=?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, g);
			ResultSet rs = stmt.executeQuery();
			ResultSetMetaData md = rs.getMetaData();

			String fileName = "renatl_Activities_Of_Customers.csv";

			FileWriter file = new FileWriter(fileName);

			PrintWriter out = new PrintWriter(file);

			// Print column as header

			int cc = md.getColumnCount();
			for (int i = 1; i <= cc; i++) {
				out.print(md.getColumnName(i));
				if (i < cc) {
					out.print(",");
				}
			}
			out.println();

			// print row data

			while (rs.next()) {
				for (int i = 1; i <= cc; i++) {
					out.print(rs.getString(i));
					if (i < cc) {
						out.print(",");
					}

				}
				out.println();
			}

			out.close();
			file.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
