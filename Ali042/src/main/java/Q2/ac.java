package Q2;
import Q1.b;
public class ac {
	public int price;
	public int gnum;
	public final int pricepg = 35;
	public ac(int gnum){
		b o = new b();
		for(int x=0; x<=47; x++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.println("* "+o+" *");
		for(int x=0; x<=47; x++) {
			System.out.print("*");
		}
		System.out.println("");
		this.gnum = gnum;
		this.price = gnum * pricepg;
		if(gnum >= 50) {
			System.out.println("Number of guests is: "+gnum+"\nPrice per guest is: "+pricepg+"\nTotal Price is: "+price+"\nTrue! Event is large");
		}
		else {
			System.out.println("Number of guests is: "+gnum+"\nPrice per guest is: "+pricepg+"\nTotal Price is: "+price+"\nFalse! Event is small");
		}
	}
}