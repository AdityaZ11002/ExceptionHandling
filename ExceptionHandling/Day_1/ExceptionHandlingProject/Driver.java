package ExceptionHandlingProject;

class Delivery {

	String name;
	String address;
	String city;
	Integer pincode;

	public Delivery() {
		super();
	}

	public Delivery(String name, String address, String location, Integer pincode) {
		super();
		this.name = name;
		this.address = address;
		this.city = location;
		this.pincode = pincode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocation() {
		return city;
	}

	public void setLocation(String city) {
		this.city = city;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
}

class Order {

	private String status;

	public Order() {
		super();
	}

	public Order(String status) {
		super();
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}

public class Driver {

	public static void main(String[] args) {

		Delivery delivery = new Delivery("Aditya","BTM 1",null,123456);

		Order order;

		try {

			String pincode = delivery.getPincode().toString();
			String city = delivery.getLocation().toString();

			order = new Order("Placed");
		}

		catch (NullPointerException e) {

			order = new Order("Hold");
		}

		System.out.println("Status : " + order.getStatus());
	}
}