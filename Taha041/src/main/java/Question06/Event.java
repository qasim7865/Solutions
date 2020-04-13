package Question06;
import java.util.Scanner;
public class Event {
	public static final int ppg = 35;public static final int cutoff = 10;
	private static String name;private int guests;private float price;
	Scanner scan = new Scanner(System.in);
	public Event() {
		this("A000",0);
	}
	public Event(String name,int guests) {
		Event.name = name;this.guests = guests;
	}
	public static String getName() {
		return name;
	}
	public void setName(){
		System.out.print("Enter the name of event : ");
		String s = scan.nextLine();
		name = s;
	}
	public int getGuests() {
		return guests;}
	public void setGuests(){
		System.out.print("Enter the number of guests : ");
		int g = scan.nextInt();
		guests = g;
	}
	public void getPrice() {
		this.price = ppg * guests;
		System.out.println("Price per guest is $"+ppg);
		System.out.println("Total Price is "+price);
		if(guests>=50) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	public double price_pg() {
		return ppg;
	}
	public double getPricee() {
		this.price = ppg * guests;
		if(guests>=50) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		return price;
	}
}