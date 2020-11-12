package getMyFiles;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import databaseConnectivity.DbUtility;

public class Customer_exportToCSV {
	public static void customerData() {
		try {
			Connection conn = DbUtility.getNetwork();

			String sql = "select*from customer";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData md = rs.getMetaData();

			String fileName = "Customers.csv";
			
			

			FileWriter file = new FileWriter(fileName);//create file

			PrintWriter out = new PrintWriter(file);

			// Print column as header

			int cc = md.getColumnCount();                                                   //cc=7
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
