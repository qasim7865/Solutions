package Question07;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Event {
	public static int ppg = 35;
	public static final int lowerppg = 32;public static final int higherppg = 35;
	private static String name;private int guests;private static float price;public static boolean value;
	Scanner input = new Scanner(System.in);
	public static String getName() {
		return name;}
	public void setName(String s){
		name = s;
	}
	public int price_pg(){
		return ppg;}
	public int getGuests() {
		return guests;
	}
	public void setGuests(int g) {
		guests = g;
	}
	public boolean isLarge(int guests) {
		if(guests>=50) {
			return true;}
		else {
			return false;}
	}
	public void p(int guests) {
		this.guests = guests;
		if(guests>=50) {
			price = lowerppg * guests;
		}
		else {
			price = higherppg * guests;}
	}	
	public void check(int guests) {
		value = isLarge(guests);
		if(value == true) {
			JOptionPane.showMessageDialog(null, "Number of guests is "+guests+"\nPrice per guest is $"+lowerppg+"\nTotal Price is "+price);
		}
		else{
			JOptionPane.showMessageDialog(null, "Number of guests is "+guests+"\nPrice per guest is $"+higherppg+"\nTotal Price is "+price);
		}
	}
}