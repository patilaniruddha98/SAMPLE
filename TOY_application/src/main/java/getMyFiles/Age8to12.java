package getMyFiles;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import databaseConnectivity.DbUtility;

public class Age8to12 {
	public static void toyData() {
		try {
			Connection conn = DbUtility.getNetwork();

			String sql = "select*from toy where min_age=8 and max_age=12";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData md = rs.getMetaData();

			String fileName = "Age8to12.csv";

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
