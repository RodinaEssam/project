package programming;

public class ElectronicProduct extends product{
private String brand;
private int WarrantlyPeriod;
public ElectronicProduct(int productId, String name, float price, String brand, int warrantlyPeriod) {
	super(productId, name, price);
	this.brand = brand;
	WarrantlyPeriod = warrantlyPeriod;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getWarrantlyPeriod() {
	return WarrantlyPeriod;
}
public void setWarrantlyPeriod(int warrantlyPeriod) {
	if(	WarrantlyPeriod>=0)
	WarrantlyPeriod = warrantlyPeriod;
	else
		this.WarrantlyPeriod=Math.abs(warrantlyPeriod);
}

}
