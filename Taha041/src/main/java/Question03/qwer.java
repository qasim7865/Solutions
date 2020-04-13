package Question03;
import javax.swing.JOptionPane;
public class qwer {
	public static int guest;public static int price;
	public static String str = "Khizar's makes the food that makes it a party";
	public static int guests(){
		String g = JOptionPane.showInputDialog(null,"Enter number of guests : ");
		guest = Integer.parseInt(g);
		return guest;
	}
	public static void motto() {
		for(int i = 0; i < 47 ; i++) {
			System.out.print("*");
		}
		System.out.println(" ");
		System.out.println("*"+str+"*");
		for(int i = 0; i < 47 ; i++) {
			System.out.print("*");}
	}
	public static void price() {
		int ppg = 35;
		price = guest * 35;
		if(guest >= 50) {
			System.out.println("Number of guests are "+guest+
					"\nPrice per guest is "+ppg+"\nTotal Price is "+price+"\nTrue");
		}
		else {
			System.out.println("Number of guests are "+guest+
					"\nPrice per guest is "+ppg+"\nTotal Price is "+price+"\nFalse");
		}
	}
}