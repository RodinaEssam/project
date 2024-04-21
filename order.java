package programming;

public class order {
private int customerId;
private int orderId;
private product[]products2;
private float totalPrice;
public order(int customerId, int orderId, product[] products2, float totalPrice) {
	this.customerId = customerId;
	this.orderId = orderId;
	this.products2 = products2;
	this.totalPrice = totalPrice;
}
public void printProducts() {
	for(int i=0;i<products2.length;i++) {
		System.out.println(products2[i].getName()+"_"+products2[i].getPrice());
	}
}
public void printOrderInfo() {
System.out.println("here is your order summary:"+"\norderID:"+orderId+
		"\ncustomerId:"+customerId+"\nproducts:");
printProducts();
System.out.println("total price:"+totalPrice);
}
}
