package Q3;
import java.util.Scanner;
public class EventDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter event number : ");
		String e = sc.nextLine();
		System.out.print("Enter number of guests : ");
		int g = sc.nextInt();
		Event o = new Event();
		o.setEvnum(e);
		o.setGuests(g);
		KhizarsEventPriceWithMethods.motto();
		o.getPrice();
	}
}