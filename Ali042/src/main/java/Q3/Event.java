package Q3;
public class Event {
	public static final int pricepg = 35;
	public static final int cutoff = 50;
	private String evnum;
	private int g;
	private int p;
	public String getEvnum() {
		return evnum;
	}
	public void setEvnum(String evnum) {
		this.evnum = evnum;
	}
	public int getGuests() {
		return g;
	}
	public void setGuests(int g) {
		this.g = g;
	}
	public void getPrice() {
		p = pricepg * g;
		if(g >= 50) {
			System.out.println("Event number is: "+getEvnum()+"\nNumber of guests is: "+g+"\nPrice per guest is: "+pricepg+"\nTotal Price is: "+p+"\nTrue! Event is large");
		}
		else {
			System.out.println("Event number is: "+getEvnum()+"\nNumber of guests is: "+g+"\nPrice per guest is: "+pricepg+"\nTotal Price is: "+p+"\nFalse! Event is small");
		}
	}
}