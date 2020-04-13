package Question6;

import java.util.Scanner;

public class EventDemo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(true) {
			int no=input.nextInt();
			Event obj1=new Event("ABC20", 60);
			KhizarEventwithMethod.price(obj1);
			System.out.println("Please come to my event!");
			if(no>5 && no<100) {
				break;
			}
		}
		input.close();
	}
}
