package administrative;

import java.util.Scanner;

import getMyFiles.Customer_exportToCSV;
import getMyFiles.Renatl_Activities_Of_Customers;
import getMyFiles.SearchByRental_Id;
import getMyFiles.Toy_RentalToCSV;
import getMyFiles.Toy_exportToSCV;

public class Admin_Login_First_Page {
	public static void admin_Login_First_Page() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter 0 to explore toy details");
		System.out.println("enter 1 to explore customer details");
		System.out.println("enter 2 to explore toy rental details");
		System.out.println("enter 3 to get all the details about rental activities of customers");
		System.out.println("enter 4 to get all the details about customers using rental activity");
		int n = s.nextInt();
		if (n == 0) {
			Toy_exportToSCV.toyData();

		} else if (n == 1) {
			Customer_exportToCSV.customerData();

		} else if (n == 2) {
			Toy_RentalToCSV.getRentalData();

		} else if (n == 3) {

			Renatl_Activities_Of_Customers.renatl_Activities_Of_Customers();

		} else if (n == 4) {
			SearchByRental_Id.searchByRental_Id();

		} else {
			System.out.println("wrong input");
			Admin_Login_First_Page.admin_Login_First_Page();

		}

	}
}
