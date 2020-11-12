package customers;

import java.util.Scanner;

import getMyFiles.Activity_Toys;
import getMyFiles.BabyCar_Toys;
import getMyFiles.Built_Toys;
import getMyFiles.Craft_Toys;
import getMyFiles.Cycle_Toys;
import getMyFiles.Doll_Toys;
import getMyFiles.Education_Toys;
import getMyFiles.Electric_Toys;
import getMyFiles.Game_Toys;
import getMyFiles.Kitchen_Toys;
import getMyFiles.Puzzle_Toys;
import getMyFiles.Teddy_Toys;
import getMyFiles.Wheels_Toys;

public class EnterYourType {
	public static void mytype() {
		Scanner s = new Scanner(System.in);
		System.out.print("enter the type of toy you want to be take on rent: ");
		String str = s.nextLine();

		switch (str) {
		case "Craft": {
			Craft_Toys.toyData();
			System.out.println("check file");
			RentalProcedureImpl.getToyData();
			break;
		}

		case "Electric": {
			Electric_Toys.toyData();
			System.out.println("check file");
			RentalProcedureImpl.getToyData();
			break;
		}

		case "Activity": {
			Activity_Toys.toyData();
			System.out.println("check file");
			RentalProcedureImpl.getToyData();
			break;
		}

		case "Kitchen": {
			Kitchen_Toys.toyData();
			System.out.println("check file");
			RentalProcedureImpl.getToyData();
			break;
		}

		case "Wheels": {
			Wheels_Toys.toyData();
			System.out.println("check file");
			RentalProcedureImpl.getToyData();
			break;
		}

		case "Teddy": {
			Teddy_Toys.toyData();
			System.out.println("check file");
			RentalProcedureImpl.getToyData();
			break;
		}

		case "Baby car": {
			BabyCar_Toys.toyData();
			System.out.println("check file");
			RentalProcedureImpl.getToyData();
			break;
		}

		case "Education": {
			Education_Toys.toyData();
			System.out.println("check file");
			RentalProcedureImpl.getToyData();
			break;
		}

		case "Cycle": {
			Cycle_Toys.toyData();
			System.out.println("check file");
			RentalProcedureImpl.getToyData();
			break;
		}

		case "Puzzle": {
			Puzzle_Toys.toyData();
			System.out.println("check file");
			RentalProcedureImpl.getToyData();
			break;
		}

		case "Built": {
			Built_Toys.toyData();
			System.out.println("check file");
			RentalProcedureImpl.getToyData();
			break;
		}

		case "Doll": {
			Doll_Toys.toyData();
			System.out.println("check file");
			RentalProcedureImpl.getToyData();
			break;
		}

		case "Game": {
			Game_Toys.toyData();
			System.out.println("check file");
			RentalProcedureImpl.getToyData();
			break;
		}

		default: {
			System.out.println("wrong input");

			EnterYourType.mytype();
		}

		}
	}
}
