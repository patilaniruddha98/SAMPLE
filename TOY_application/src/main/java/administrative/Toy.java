package administrative;

public class Toy {
	private int toyId;

	public int getToyId() {
		return toyId;
	}

	public void setToyId(int toyId) {
		this.toyId = toyId;
	}

	public String getToyName() {
		return toyName;
	}

	public void setToyName(String toyName) {
		this.toyName = toyName;
	}

	public String getToyType() {
		return toyType;
	}

	public void setToyType(String toyType) {
		this.toyType = toyType;
	}

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRentalAmount() {
		return rentalAmount;
	}

	public void setRentalAmount(int rentalAmount) {
		this.rentalAmount = rentalAmount;
	}

	private String toyName;
	private String toyType;
	private int minAge;
	private int maxAge;
	private int price;
	private int rentalAmount;
	private int quantity;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantuty(int quantity) {
		this.quantity = quantity;
	}

	public String toString() {
		return this.getToyType();
	}
}
