package Q5;
import javax.swing.JOptionPane;
public class EventDemo {
	public static void checkSize(Event a, Event b) {
		if(a.getGuests() == b.getGuests()) {
			System.out.println("Both events have same number of guests!");
		}
		else if(a.getGuests() > b.getGuests()) {
			System.out.println("Event "+a.getEvnum()+" is a greater event!");
		}
		else {
			System.out.println("Event "+b.getEvnum()+" is a greater event!");
		}
	}
	public static void main(String[] args) {
		String e = JOptionPane.showInputDialog(null,"Enter 1st event number");
		String gs = JOptionPane.showInputDialog(null,"Enter number of guests in 1st event");
		int g = Integer.parseInt(gs);
		String e1 = JOptionPane.showInputDialog(null,"Enter 2nd event number");
		String gs1 = JOptionPane.showInputDialog(null,"Enter number of guests in 2nd event");
		int g1 = Integer.parseInt(gs1);
		String e2 = JOptionPane.showInputDialog(null,"Enter 3rd event number");
		String gs2 = JOptionPane.showInputDialog(null,"Enter number of guests in 3rd event");
		int g2 = Integer.parseInt(gs2);
		Event o = new Event();
		o.setEvnum(e);
		o.setGuests(g);
		o.getPrice();
		Event oo = new Event();
		oo.setEvnum(e1);
		oo.setGuests(g1);
		oo.getPrice();
		Event ooo = new Event();
		ooo.setEvnum(e2);
		ooo.setGuests(g2);
		ooo.getPrice();
		System.out.println(" ");
		checkSize(o,oo);
		checkSize(o,ooo);
		checkSize(oo,ooo);
	}
}