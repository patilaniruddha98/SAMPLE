package administrative;

import getMyFiles.Customer_exportToCSV;
import getMyFiles.Toy_RentalToCSV;
import getMyFiles.Toy_exportToSCV;

public class Tables implements Task {

	@Override
	public void Searchtoy() {
		// TODO Auto-generated method stub
		Toy_exportToSCV.toyData();
	}

	@Override
	public void Searchcustomers() {
		// TODO Auto-generated method stub
		Customer_exportToCSV.customerData();

	}

	@Override
	public void SearchrentalData() {
		// TODO Auto-generated method stub
		Toy_RentalToCSV.getRentalData();

	}

	@Override
	public void SearchcustomertoRentalData() {
		// TODO Auto-generated method stub

	}

	@Override
	public void SearchrentalDataToCustomer() {
		// TODO Auto-generated method stub

	}

}
