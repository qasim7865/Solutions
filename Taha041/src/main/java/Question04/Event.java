package Question04;
import java.util.Scanner;
public class Event {
	public static final int ppg = 35;public static final int cutoff = 10;
	private static String name;private int guests;private float price;
	Scanner input = new Scanner(System.in);
	public static String getName() {
		return name;
	}
	public void setName(){
		System.out.print("Enter the name of event : ");
		String s = input.nextLine();
		name = s;
	}
	public int getGuests() {
		return guests;
	}
	public void setGuests(){
		System.out.print("Enter the number of guests : ");
		int g = input.nextInt();
		guests = g;
	}
	public void getPrice() {
		price = ppg * guests;
		System.out.println("Price per guest is $"+ppg);
		System.out.println("Total Price is "+price);
		if(guests>=50) {
			System.out.println("True");
		}
		else {
			System.out.println("Fasle");
		}
	}
}