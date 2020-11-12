package customers;

public class RegistrationData {

	public static String getCustomerName() {
		return CustomerName;
	}

	public static void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public static String getCustomerPassword() {
		return CustomerPassword;
	}

	public static void setCustomerPassword(String customerPassword) {
		CustomerPassword = customerPassword;
	}

	public static String getCustomerCity() {
		return CustomerCity;
	}

	public static void setCustomerCity(String customerCity) {
		CustomerCity = customerCity;
	}

	public static String getCustomerState() {
		return CustomerState;
	}

	public static void setCustomerState(String customerState) {
		CustomerState = customerState;
	}

	public static int getCustomerZip() {
		return CustomerZip;
	}

	public static void setCustomerZip(int customerZip) {
		CustomerZip = customerZip;
	}

	public static String getCustomerCountry() {
		return CustomerCountry;
	}

	public static void setCustomerCountry(String customerCountry) {
		CustomerCountry = customerCountry;
	}

	private static String CustomerName;
	private static String CustomerPassword;
	private static String CustomerCity;
	private static int CustomerZip;
	private static String CustomerCountry;
	private static String CustomerState;

}
