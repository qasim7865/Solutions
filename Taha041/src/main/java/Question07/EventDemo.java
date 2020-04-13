package Question07;
import abc7.Event;import javax.swing.JOptionPane;
public class EventDemo{
	static String n1,n2,n3;
	public static void disp(Event art, Event brt) {
		if(art.getGuests() == brt.getGuests()) {
			JOptionPane.showMessageDialog(null,"Both the events have same guests");}
		else if(art.getGuests() >= brt.getGuests()) {
			JOptionPane.showMessageDialog(null,"1st event is the larger event");}
		else {
			JOptionPane.showMessageDialog(null,"2nd event is the larger event");}
    }
	public static void main(String[] args){
		n1 = JOptionPane.showInputDialog(null,"Enter the first event name : ");
		String sg1 = JOptionPane.showInputDialog(null,"Enter no of guests in first event : ");
		int g1 = Integer.parseInt(sg1);
		n2 = JOptionPane.showInputDialog(null,"Enter the second event name : ");
		String sg2 = JOptionPane.showInputDialog(null,"Enter no of guests in second event : ");
		int g2 = Integer.parseInt(sg2);
		n3 = JOptionPane.showInputDialog(null,"Enter the third event name : ");
		String sg3 = JOptionPane.showInputDialog(null,"Enter no of guests in third event : ");
		int g3 = Integer.parseInt(sg3);
		Event obj = new Event();
		obj.setGuests(g1); obj.setName(n1);
		obj.check(g1);
		Event obj1 = new Event();
		obj1.setGuests(g2); obj1.setName(n2);
		obj1.check(g2);
		Event obj2 = new Event();
		obj2.setGuests(g3); obj2.setName(n3);
		obj2.check(g3);
		disp(obj,obj1);
	}
}