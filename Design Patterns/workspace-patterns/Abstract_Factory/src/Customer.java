
public class Customer {

	private int customerId;
	private String customerFName;
	private String customerLName;
	private String customerAddress;
	private String customerPhone;
	
	public Customer(int customerId, String customerFName, String customerLName, String customerAddress, String customerPhone) {
	
		this.customerId= customerId;
		this.customerFName= customerFName;
		this.customerLName= customerLName;
		this.customerAddress= customerAddress;
		this.customerPhone= customerPhone;
		
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public String getCustomerFName() {
		return customerFName;
	}
	
	public String getCustomerLName() {
		return customerLName;
	}
	
	public String getCustomerAddress() {
		return customerAddress;
	}
	
	public String getCustomerPhone() {
		return customerPhone;
	}
	
}
