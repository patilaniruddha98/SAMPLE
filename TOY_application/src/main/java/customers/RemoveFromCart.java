package customers;

import java.util.Scanner;

public class RemoveFromCart extends CartActivity {

	public static void remove() {
		Scanner s = new Scanner(System.in);

		while (arr[0] != 0) {
			System.out.println("enter the toy id that you want to remove from the cart: ");
			int delete = s.nextInt();

			for (int i = 0; i < arr.length; i++) {
				if (delete == arr[i]) {
					for (int j = i; j <= arr.length - 1; j++) {
						arr[j] = arr[j + 1];
					}

					break;
				}
			}
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] != 0) {
					System.out.println("item " + i + ": ");
					System.out.println("			Toy id          " + arr[i]);
					System.out.println("			Toy name:      " + t.getToyName());
					System.out.println("			Toy type:      " + t.getToyType());
					System.out.println("			Minimum age:   " + t.getMinAge());
					System.out.println("			Maximum age:   " + t.getMaxAge());
					System.out.println("			Price:         " + t.getPrice());
					System.out.println("			Quantity:      " + t.getQuantity());
					System.out.println("			Rental amount: " + t.getRentalAmount());

				}
			}
			System.out.println(
					"enter 1 to take all the items in a cart on rent else enter any integer to removing items from cart");
			int y = s.nextInt();
			if (y == 1) {
				OrderDetailed.finaliseOrder();////////////////////////////// finalise the order

			} else {

				RemoveFromCart.remove();
			}

		}
	}

}
