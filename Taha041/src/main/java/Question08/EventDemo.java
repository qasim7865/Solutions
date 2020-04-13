package Question08;
import java.util.Scanner;
public class EventDemo{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many events do you want to enter? : ");
		int event = scan.nextInt();
		Event[] arr = new Event[event];
		int guests;
		for(int x = 0 ; x < arr.length ; x++) {
			arr[x] = new Event();
			arr[x].setName();
			do {
				System.out.print("Enter number of guests : ");
				guests = scan.nextInt();
				if(guests<5||guests>100) {
					System.out.println("------ Invalid entry! Enter again ------");
				}
			}while(guests<5||guests>100);
			arr[x].setGuests(guests);
		}
		System.out.print("Which event do you want to print message for? : ");
		int m = scan.nextInt();
		if(m <= event) {
			Event obj = arr[0];
			for(int x = 0 ; x < obj.getGuests() ; x++) {
				System.out.println("Please come to my event!");
			}
		}
		else {
			System.out.println("Invalid event number!");
		}
	}
}