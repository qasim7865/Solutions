package Question3_b;
public class Event {
	final static int PRICEPERGUEST=35;
	final static int LARGEEVENT=50;
	@SuppressWarnings("unused")
	private String eventnumber;
	private int NoofGuest;
	@SuppressWarnings("unused")
	private int price;
	public void setEventnumber(String eventnumber) {
		this.eventnumber = eventnumber;
	}
	public void setGuest(int noofGuest) {
		NoofGuest = noofGuest;
		price=NoofGuest*PRICEPERGUEST;
	}
}
