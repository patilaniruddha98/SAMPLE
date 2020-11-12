package customers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import administrative.Toy;
import databaseConnectivity.DbUtility;

public class RentalServiceImpl implements Rental_Service {
	List<Toy> ToyTypeList;

	public List<Toy> getToys() {
		try {
			Connection conn = DbUtility.getNetwork();

			String sql = "select distinct toy_type from toy";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			ToyTypeList = new ArrayList<Toy>();

			while (rs.next()) {
				Toy toy = new Toy();
				toy.setToyType(rs.getString("toy_type"));
				ToyTypeList.add(toy);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ToyTypeList;
	}

}
