package programming;

public class customer {
private int customerId;
private String name;
private String address;
public customer(int customerId, String name, String address) {
	super();
	this.customerId = customerId;
	this.name = name;
	this.address = address;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	if(customerId>=0)
	this.customerId = customerId;
	else
		this.customerId=Math.abs(customerId);
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

}
