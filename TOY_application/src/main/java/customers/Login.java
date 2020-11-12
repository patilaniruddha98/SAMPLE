package customers;

public class Login {
	public static String customerName;

	public static void setCustomerName(String customerName) {

		Login.customerName = customerName;

	}

	public static String getCustomerName() {
		return customerName;
	}

	public static String customerPassword;

	public static void setCustomerPassword(String customerPassword) {

		Login.customerPassword = customerPassword;

	}

	public static String getCustomerPassword() {
		return customerPassword;
	}

	// ************************************************************************************************************************************

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

	private static int CustomerId;

	public static int getCustomerId() {
		return CustomerId;
	}

	public static void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	private static String CustomerCity;
	private static int CustomerZip;
	private static String CustomerCountry;
	private static String CustomerState;
}
