package Q3;
import java.util.Scanner;
public class KhizarsEventPriceWithMethods{
	public static int g;
	public static int p;
	public static String s = "Khizar's makes the food that makes it a party";
	public static int guests() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of guests : ");
		g = sc.nextInt();
		return g;
	}
	public static void motto() {
		for(int x=0; x<=47; x++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.println("* "+s+" *");
		for(int x=0; x<=47; x++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	public static void tp() {
		int pricepg = 35;
		p = pricepg * g;
		if(g >= 50) {
			System.out.println("Number of guests is: "+g+"\nPrice per guest is: "+pricepg+"\nTotal Price is: "+p+"\nTrue! Event is large");
		}
		else {
			System.out.println("Number of guests is: "+g+"\nPrice per guest is: "+pricepg+"\nTotal Price is: "+p+"\nFalse! Event is small");
		}
	}
	public static void main(String[] args) {
		guests();
		motto();
		tp();
	}
}