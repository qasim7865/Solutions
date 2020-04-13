package Q6;
import javax.swing.JOptionPane;
public class EventDemo {
	public static void main(String[] args) {
		int g;
		String ns = JOptionPane.showInputDialog(null,"How many events do you want to enter? ");
		int n = Integer.parseInt(ns);
		Event[] a = new Event[n];
		for(int i=0;x<n;x++) {
			a[i] = new Event();
			a[i].setEvnum(JOptionPane.showInputDialog(null,"Enter the name of event"));
			do {
				String gs = JOptionPane.showInputDialog(null,"Enter number of guests");
				g = Integer.parseInt(gs);
				if(g < 5 || g > 100) {
					System.out.println("Invalid number of guests entered! Enter Again!");
				}
			}while(g < 5 || g > 100);
			a[i].setGuests(g);
		}
		int op = n-1;
		String des = JOptionPane.showInputDialog(null,"Which event do you want to print message for? (0 - "+ op +") ? ");
		int de = Integer.parseInt(des);
		if(de <= op) {
			Event aa = a[de];
			for(int x=1;x<=aa.getGuests();x++) {
				System.out.println("Please come to my event!");
			}
		}
		else {
			System.out.println("Invalid event number!");
		}
	}
}