package MainnApplication;

import java.util.Scanner;

import administrative.Admin_Login_First_Page;
import customers.CustomerServiceImpl;
import customers.Customer_Login_First_Page;
import customers.OrderDetailed;
import customers.RentalProcedureImpl;
import logout.LoggingOff;

public class App {

	public static void main(String[] args) throws Exception {

		Scanner s = new Scanner(System.in);
		System.out.print("enter 3 for login as a customer else any integer to login as a Admin: ");
		int k = s.nextInt();
		if (k == 3) {
			Customer_Login_First_Page.customer_Login_First_Page();
		} else {
			Admin_Login_First_Page.admin_Login_First_Page();
		}

	}

}
