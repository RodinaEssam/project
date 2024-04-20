package programming;
import java.util.Scanner;

public class EcommereceSystem {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	ElectronicProduct s1=new ElectronicProduct(1,"smart phone",599.9f,"samsung",1);
   ClothingProduct s2=new  ClothingProduct(2,"t-shirt",19.99f,"medium","cotton");
   BookProduct s3=new BookProduct(3,"OOP",39.99f,"O'Reilly","X Publications"); 
   System.out.println("welcome to ecommerce system!");
   System.out.println("please enter your id");
   int id=input.nextInt();
   if(id<0) {
	 id=Math.abs(id);}
   System.out.println("please enter your name");
   String name=input.next();
   System.out.println("please enter your address");
   String address=input.next();
   customer c1=new customer(id,name,address);
   System.out.println("how many products do you want?");
   int nProduct=input.nextInt();
   cart r1=new cart(id,nProduct);
   for(int i=0;i<nProduct;i++) {
   System.out.println("which product do you like to add?");
   System.out.println("1-smart phone"+"\n2-t-shirt"+"\n3-OOP");
   int number=input.nextInt();
   switch (number){
   case 1:
	  r1.addProduct(s1);
	  break;
   case 2:
	   r1.addProduct(s2);
	   break;
   case 3:
	   r1.addProduct(s3);
	   break;
	 default:
		 System.out.println("invalid no");
   }
	}
   System.out.println("your total is "+r1.calculatePrice());
   System.out.println("would you like to place order?"+"\n1-yes  2-no");
   int order=input.nextInt();
   switch (order) {
	   case 1:
	   r1.placeOrder();
	   break;
	   case 2:
		   break;
	   default:
			 System.out.println("invalid no");	   
	}
   
}
}