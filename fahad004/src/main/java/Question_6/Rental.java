package Question_6;


public class Rental {


	//___________________________________________________
	//two public static fields
	public final static int minutes = 60;
	public final static int hourRate = 40;

	//___________________________________________________
	//four private fields
	private String contractNumber;
	private int numberofHours;
	private int numberofMinutesoverhour;
	private int Price;


	//___________________________________________________
	//the Two constructors that will pass the values as per the arguments passed to them

	//1st Constructor
	public Rental(String contact , int as) {
		setContractNumber(contact);
		setHoursandMinutes(as);

	}

	//2nd Constructor
	public Rental() {
		this("A000",0);

	}


	//____________________________________________________
	//two setter methods for Contract Number and Minutes, hours, price etc
	public void setContractNumber(String u) {
		contractNumber = u;
	}

	int totalMinutes;

	public void setHoursandMinutes(int y) {
		totalMinutes = y;

		int hours = y/60;
		numberofHours = hours;

		int minutes = y%60;
		numberofMinutesoverhour = minutes;

		int price = (hours*40) + (minutes*1);
		Price = price;

		if(numberofMinutesoverhour>40) {
			numberofMinutesoverhour = 40;
		}
		else {
			numberofMinutesoverhour = numberofMinutesoverhour;
		}


		if(y<60) {
			Price = 40;
		}
		if(y==0) {
			Price = 0;
		}


	}


	//____________________________________________________
	//four getter methods
	public String getContractNumber() {
		return contractNumber;
	}

	public int getNumberofHours() {
		return numberofHours;
	}

	public int getNumberofMinutesoverhour() {
		return numberofMinutesoverhour;
	}

	public int getPrice() {
		return Price;}



}

