package Question_8;



import java.util.Scanner;

import Question_3.BadshahsRentalPriceWithMethods;

public class RentalDemo {

	//_______________________________________________________________________
	//Method to get the Number of Total minutes 
	int minutes;
	public int getMinutes() {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter The Total Minutes : ");
		minutes = s.nextInt();


		//logic for repeating method if value is not as per criteria
		if(minutes < 60 || minutes > 7200) {
			getMinutes();

		}

		return minutes;


	}


	//_______________________________________________________________________
	//Method to get the  Contract Number
	public String getContractNumber() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The Contract Number : ");
		String yh = s.nextLine();
		return yh;
	}

	//_______________________________________________________________________
	//Method to get the   Number
	public String getNumber() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The  Number : ");
		String yh = s.nextLine();
		return yh;
	}

	//_______________________________________________________________________
	//Revised Method to get the   Details
	public void compute(Rental a) {

		//to display the motto
		BadshahsRentalPriceWithMethods wq= new BadshahsRentalPriceWithMethods();
		wq.RentalDemo();

		//to display details
		System.out.println("Contract Number  : "+a.getContractNumber());
		System.out.println("Hours : "+a.getNumberofHours());
		System.out.println("Minutes over hours  : "+a.getNumberofMinutesoverhour());
		System.out.println("Price  : "+a.getPrice());
		System.out.println("Contact Number is  : "+a.getContact());


	}



	//______________________________________________________________________
	//Main Method
	public static void main(String[] args) {

		RentalDemo	as	= new RentalDemo();
		//______________________________________________________________________
		//Object declaration to via Array
		Rental arr[] = new Rental[3];
		for(int i = 0;i<3;i++) {
			arr[i] = new Rental(as.getContractNumber(),as.getMinutes());
			arr[i].setNumber(as.getNumber());
		}


		//______________________________________________________________________
		//Method Call to display the Details of each object
		for(int i = 0;i<3;i++) {
			as.compute(arr[i]);
		}
		
		

		//_______________________________________________________________________
		//to check the equipment type field and array
		System.out.println("\n\nEquipment Name");
		arr[0].setEquipmentNo(44);
		arr[0].getEquipmentName();
	}

}










