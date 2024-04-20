package programming;

public class cart {
private int customerId;
private int nProduct;
private int i=0;
private product [] products;
public cart(int customerId, int nProduct) {
	this.customerId = customerId;
	this.nProduct = nProduct;
	products = new product[nProduct];
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public int getnProduct() {
	return nProduct;
}
public void setnProduct(int nProduct) {
	this.nProduct = nProduct;
}
public product[] getProducts() {
	return products;
}
public void setProducts(product[] products) {
	this.products = products;
}
public void addProduct(product element) {
	products[i]=element;
	i++;
}
public void removeProduct(int index) {
	if(index>=0&&index<nProduct) {
		for(int i=index;i<nProduct-1;i++) {
			products[i]=products[i+1];
		}
	nProduct--;
	products[nProduct]=null;
	}
	else {
		System.out.println("invalid index try again");
	}
}
public float calculatePrice() {
	float sum=0f;
	for(int i=0;i<nProduct;i++) {
		sum+=products[i].getPrice();
	}
	return sum;
}
public void placeOrder() {
order ord=new order(customerId,123,products,calculatePrice());	
ord.printOrderInfo();
}
}
