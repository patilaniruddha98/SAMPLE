package logout;

import java.util.Scanner;

import MainnApplication.App;
import customers.Home_Page;

public class LoggingOff {

	public static void loggingMeOff() throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.print("enter 9 to logging off and 8 to go back on home page: ");
		int r = s.nextInt();
		System.out
				.println("*******************************************************************************************");
		System.out
				.println("*******************************************************************************************");
		if (r == 9) {
			App.main(null);
		} else if (r == 8) {
			Home_Page.homepage();
		}

	}

}
