package customers;

import java.util.List;
import java.util.Scanner;

import administrative.Toy;

public class SearchToys {

	public static void search() throws InterruptedException {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 to search toys according to age group");
		System.out.println("Enter 2 to search toys according to their types: ");

		int l = Integer.parseInt(input.nextLine());

		if (l == 1) {

			EnterAge.age();

		} else if (l == 2) {

			System.out.println("type of toys available: ");

			RentalServiceImpl rentalService = new RentalServiceImpl();
			List<Toy> ToyTypeList = rentalService.getToys();
			for (Toy toytype : ToyTypeList) {
				System.out.println(toytype);
			}

			EnterYourType.mytype();

		} else {
			System.out.println("wrong input");
			SearchToys.search();
		}
	}
}
