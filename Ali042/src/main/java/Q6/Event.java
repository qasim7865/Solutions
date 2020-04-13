package Q6;
public class Event {
	public static final int pricepg = 35;
	public static final int hpricepg = 35;
	public static final int lpricepg = 32;
	public static final int cutoff = 50;
	private String evnum;
	private int g;
	private int p;
	public boolean s;
	public Event(String a,int b) {
		setEvnum(a);
		setGuests(b);
	}
	public Event() {
		setEvnum("A000");
		setGuests(0);
	}
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
	public boolean isLarge(int g) {
		if(g>=50) {
			return true;
		}
		else {
			return false;
		}
	}
	public void getPrice() {
		s = isLarge(g);
		if(s == true) {
			p = lpricepg * g;
			System.out.println("Event number is: "+getEvnum()+"\nNumber of guests is: "+g+"\nPrice per guest is: "+lpricepg+"\nTotal Price is: "+p+"\nTrue! Event is large");
		}
		else {
			p = hpricepg * g;
			System.out.println("Event number is: "+getEvnum()+"\nNumber of guests is: "+g+"\nPrice per guest is: "+hpricepg+"\nTotal Price is: "+p+"\nFalse! Event is small");
		}
	}
}