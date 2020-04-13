package Q4;
import java.util.Scanner;
public class EventDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter event number : ");
		String e = sc.nextLine();
		System.out.print("Enter number of guests : ");
		int g = sc.nextInt();
		Event o = new Event(e,g);
		o.getPrice();
		System.out.println("\t DEFAULT VALUES");
		Event oo = new Event();
		oo.getPrice();
	}
}