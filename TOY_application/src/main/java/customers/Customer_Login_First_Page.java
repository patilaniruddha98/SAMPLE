package customers;

import java.util.Scanner;

public class Customer_Login_First_Page {
	public static void customer_Login_First_Page() {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		System.out.println("new user!!!!!");
		System.out.println("enter 0 to register: ");
		System.out.println("exsisting user!!!!!");
		System.out.println("enter 1 to login: ");
		int a = s.nextInt();
		s.nextLine();

		if (a == 0) {
			CustomerServiceImpl customerService = new CustomerServiceImpl();
			customerService.getCustomerData();
		} else if (a == 1) {
			CustomerServiceImpl customerService = new CustomerServiceImpl();
			customerService.getCustomers();
		}

	}

}
