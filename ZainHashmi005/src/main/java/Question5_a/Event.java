package Question5_a;

public class Event {
	final static int LOWERPRICEPERGUEST=32;
	final static int HIGHERPRICEPERGUEST=35;
	final static int LARGEEVENT=50;
	private String eventnumber;
	private int NoofGuest;
	private int priceofEvent;
	private int priceperguest;
	public Event()
	{
		setEventnumber("A000");
		setNoofGuest(0);
	}
	public Event(String event,int guest)
	{
		setEventnumber(event);
		setNoofGuest(guest);
		
	}
	public String getEventnumber() {
		return eventnumber;
	}
	public void setEventnumber(String eventnumber) {
		this.eventnumber = eventnumber;
	}
	public int getNoofGuest() {
		return NoofGuest;
	}
	public int getPrice()
	{
		return priceofEvent;
	}
	public void setNoofGuest(int noofGuest) {
		NoofGuest = noofGuest;
		if(isLarge()) priceperguest=LOWERPRICEPERGUEST;
		else priceperguest=HIGHERPRICEPERGUEST;
		priceofEvent=NoofGuest*priceperguest;
	}
	public int pricePerGuest()
	{
		return priceperguest;
	}
	public boolean isLarge()
	{
		if(NoofGuest>=50) return true;
		else return false;
	}
	public void display()
	{
		System.out.println("************************************************\n"
				+ "*Khizar’s makes the food that makes it a party.*\n"
				+ "************************************************");
		System.out.println("Event Number:  "+eventnumber);
		System.out.println("Number of Guest:  "+NoofGuest);
		System.out.println("price per guest:  "+pricePerGuest());
		System.out.println("Total price:      &"+priceofEvent);
		System.out.println("Large Event       "+isLarge());
	}
}
