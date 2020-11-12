package customers;

import java.util.Scanner;

public class CartActivity extends RentalProcedureImpl {

	public static void cart_activity() throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter 0 to add in a cart else 1 to go back else 2 to explore through toy type: ");

		int z = s.nextInt();

		if (z == 0) {

			if (arr[0] == 0) {
				arr[0] = t.getToyId();
			}

			if (arr[1] == 0) {
				arr[1] = t1.getToyId();
			}
			if (arr[2] == 0) {
				arr[2] = t2.getToyId();
			}
			if (arr[3] == 0) {
				arr[3] = t3.getToyId();
			}
			if (arr[4] == 0) {
				arr[4] = t4.getToyId();
			}
			if (arr[5] == 0) {
				arr[5] = t5.getToyId();
			}
			if (arr[6] == 0) {
				arr[6] = t6.getToyId();
			}
			if (arr[7] == 0) {
				arr[7] = t7.getToyId();
			}
			if (arr[8] == 0) {
				arr[8] = t8.getToyId();
			}
			if (arr[9] == 0) {
				arr[9] = t9.getToyId();
			}

			if (arr[0] != 0) {
				System.out.println("item " + 1 + ": ");
				System.out.println("			Toy id         " + arr[0]);
				System.out.println("			Toy name:      " + t.getToyName());
				System.out.println("			Toy type:      " + t.getToyType());
				System.out.println("			Minimum age:   " + t.getMinAge());
				System.out.println("			Maximum age:   " + t.getMaxAge());
				System.out.println("			Price:         " + t.getPrice());
				System.out.println("			Quantity:      " + t.getQuantity());
				System.out.println("			Rental amount: " + t.getRentalAmount());

			}
			if (arr[1] != 0) {
				System.out.println("item " + 2 + ": ");
				System.out.println("			Toy id         " + arr[1]);
				System.out.println("			Toy name:      " + t1.getToyName());
				System.out.println("			Toy type:      " + t1.getToyType());
				System.out.println("			Minimum age:   " + t1.getMinAge());
				System.out.println("			Maximum age:   " + t1.getMaxAge());
				System.out.println("			Price:         " + t1.getPrice());
				System.out.println("			Quantity:      " + t1.getQuantity());
				System.out.println("			Rental amount: " + t1.getRentalAmount());

			}
			if (arr[2] != 0) {
				System.out.println("item " + 3 + ": ");
				System.out.println("			Toy id         " + arr[2]);
				System.out.println("			Toy name:      " + t2.getToyName());
				System.out.println("			Toy type:      " + t2.getToyType());
				System.out.println("			Minimum age:   " + t2.getMinAge());
				System.out.println("			Maximum age:   " + t2.getMaxAge());
				System.out.println("			Price:         " + t2.getPrice());
				System.out.println("			Quantity:      " + t2.getQuantity());
				System.out.println("			Rental amount: " + t2.getRentalAmount());

			}
			if (arr[3] != 0) {
				System.out.println("item " + 4 + ": ");
				System.out.println("			Toy id         " + arr[3]);
				System.out.println("			Toy name:      " + t3.getToyName());
				System.out.println("			Toy type:      " + t3.getToyType());
				System.out.println("			Minimum age:   " + t3.getMinAge());
				System.out.println("			Maximum age:   " + t3.getMaxAge());
				System.out.println("			Price:         " + t3.getPrice());
				System.out.println("			Quantity:      " + t3.getQuantity());
				System.out.println("			Rental amount: " + t3.getRentalAmount());

			}
			if (arr[4] != 0) {
				System.out.println("item " + 5 + ": ");
				System.out.println("			Toy id         " + arr[4]);
				System.out.println("			Toy name:      " + t4.getToyName());
				System.out.println("			Toy type:      " + t4.getToyType());
				System.out.println("			Minimum age:   " + t4.getMinAge());
				System.out.println("			Maximum age:   " + t4.getMaxAge());
				System.out.println("			Price:         " + t4.getPrice());
				System.out.println("			Quantity:      " + t4.getQuantity());
				System.out.println("			Rental amount: " + t4.getRentalAmount());

			}
			if (arr[5] != 0) {
				System.out.println("item " + 6 + ": ");
				System.out.println("			Toy id         " + arr[5]);
				System.out.println("			Toy name:      " + t5.getToyName());
				System.out.println("			Toy type:      " + t5.getToyType());
				System.out.println("			Minimum age:   " + t5.getMinAge());
				System.out.println("			Maximum age:   " + t5.getMaxAge());
				System.out.println("			Price:         " + t5.getPrice());
				System.out.println("			Quantity:      " + t5.getQuantity());
				System.out.println("			Rental amount: " + t5.getRentalAmount());

			}
			if (arr[6] != 0) {
				System.out.println("item " + 7 + ": ");
				System.out.println("			Toy id         " + arr[6]);
				System.out.println("			Toy name:      " + t6.getToyName());
				System.out.println("			Toy type:      " + t6.getToyType());
				System.out.println("			Minimum age:   " + t6.getMinAge());
				System.out.println("			Maximum age:   " + t6.getMaxAge());
				System.out.println("			Price:         " + t6.getPrice());
				System.out.println("			Quantity:      " + t6.getQuantity());
				System.out.println("			Rental amount: " + t6.getRentalAmount());

			}
			if (arr[7] != 0) {
				System.out.println("item " + 8 + ": ");
				System.out.println("			Toy id         " + arr[7]);
				System.out.println("			Toy name:      " + t7.getToyName());
				System.out.println("			Toy type:      " + t7.getToyType());
				System.out.println("			Minimum age:   " + t7.getMinAge());
				System.out.println("			Maximum age:   " + t7.getMaxAge());
				System.out.println("			Price:         " + t7.getPrice());
				System.out.println("			Quantity:      " + t7.getQuantity());
				System.out.println("			Rental amount: " + t7.getRentalAmount());

			}
			if (arr[8] != 0) {
				System.out.println("item " + 9 + ": ");
				System.out.println("			Toy id         " + arr[8]);
				System.out.println("			Toy name:      " + t8.getToyName());
				System.out.println("			Toy type:      " + t8.getToyType());
				System.out.println("			Minimum age:   " + t8.getMinAge());
				System.out.println("			Maximum age:   " + t8.getMaxAge());
				System.out.println("			Price:         " + t8.getPrice());
				System.out.println("			Quantity:      " + t8.getQuantity());
				System.out.println("			Rental amount: " + t8.getRentalAmount());

			}
			if (arr[9] != 0) {
				System.out.println("item " + 10 + ": ");
				System.out.println("			Toy id         " + arr[9]);
				System.out.println("			Toy name:      " + t9.getToyName());
				System.out.println("			Toy type:      " + t9.getToyType());
				System.out.println("			Minimum age:   " + t9.getMinAge());
				System.out.println("			Maximum age:   " + t9.getMaxAge());
				System.out.println("			Price:         " + t9.getPrice());
				System.out.println("			Quantity:      " + t9.getQuantity());
				System.out.println("			Rental amount: " + t9.getRentalAmount());

			}

			System.out.println(
					"enter 0 to add another item in a cart and enter 1 to take on rent else enter any integer value to remove item from the cart ");
			int d = s.nextInt();
			if (d == 0) {
				SearchToys.search();
			} else if (d == 1) {
				OrderDetailed.finaliseOrder();
			} else {
				RemoveFromCart.remove();
			}

		} else if (z == 1) {
			RentalProcedureImpl.getToyData();

		} else if (z == 2) {
			EnterYourType.mytype();

		}

		else {
			System.out.println("wrong input");
			CartActivity.cart_activity();
		}

	}
}
