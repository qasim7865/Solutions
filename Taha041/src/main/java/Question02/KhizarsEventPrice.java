package Question02;
import javax.swing.JOptionPane;import abc1.qqq;
public class KhizarsEventPrice {
	public static void main(String[] args) {
		qqq obj = new qqq();
		for(int x=0; x<47;x++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.println("*"+obj+"*");
		for(int x=0; x<47;x++) {
			System.out.print("*");
		}System.out.println("");
		String str = JOptionPane.showInputDialog(null,"Enter number of guests : ");
		int guests = Integer.parseInt(str);
		qwe obj1 = new qwe(guests);
		if(guests>50) {
			System.out.println(obj1+"\nTrue");
		}
		else {
			System.out.println(obj1+"\nFalse");
		}
	}
}