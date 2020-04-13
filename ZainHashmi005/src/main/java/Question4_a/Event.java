package Question4_a;
public class Event {
	final static int PRICEPERGUEST=35;
	final static int LARGEEVENT=50;
	String eventnumber;
	int NoofGuest;
	int price;
	public Event()
	{
		setEventnumber("A000");
		setGuest(0);
	}
	public Event(String event,int guest)
	{
		setEventnumber(event);
		setGuest(guest);
	}
	public String getEventnumber() {
		return eventnumber;
	}
	public void setEventnumber(String eventnumber) {
		this.eventnumber = eventnumber;
	}
	public void setGuest(int noofGuest) {
		NoofGuest = noofGuest;
		price=NoofGuest*PRICEPERGUEST;
	}
}
