package customers;

import java.util.Scanner;

import getMyFiles.Age0to3;
import getMyFiles.Age3to5;
import getMyFiles.Age5to8;
import getMyFiles.Age8to12;

public class EnterAge {

	public static void age() {

		Scanner s = new Scanner(System.in);
		System.out.print("enter the age of the child: ");
		int age = s.nextInt();
		s.nextLine();
		if (age >= 0 && age < 3) {
			Age0to3.toyData();
			System.out.println("check file");
			RentalProcedureImpl.getToyData();

		} else if (age >= 3 && age < 5) {
			Age3to5.toyData();
			System.out.println("check file");
			RentalProcedureImpl.getToyData();

		} else if (age >= 5 && age < 8) {
			Age5to8.toyData();
			System.out.println("check file");
			RentalProcedureImpl.getToyData();

		} else if (age >= 8 && age < 12) {
			Age8to12.toyData();
			System.out.println("check file");
			RentalProcedureImpl.getToyData();
		} else {
			if (age < 0) {
				System.out.println("Invalid Age");
			} else {
				System.out.println("Toys are not available for the age group greater than 12");
			}
			EnterAge.age();

		}

	}

}
