package Question7;

public class Event {
	final static int LOWERPRICEPERGUEST=32;
	final static int HIGHERPRICEPERGUEST=35;
	final static int LARGEEVENT=50;
	private String eventnumber;
	int NoofGuest;
	int priceofEvent;
	int priceperguest;
	String phoneNo;
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
	public void setPhoneNo(String n)
	{
		String no="";
		for(int i=0;i<n.length();i++)
		{
			if(n.charAt(i)>='0' && n.charAt(i)<='9')
			{
				no+=n.charAt(i);
			}
		}
		if(no.length()==10)
		{
			phoneNo=no;
		}
		else
		{
			phoneNo="0000000000";
		}
	}
	public String getPhoneNo()
	{
		String n="(";
		for(int i=0;i<10;i++)
		{
			n+=phoneNo.charAt(i);
			if(i+1==3)
			{
				n+=") ";
			}
			if(i+1==6) {
				n+="-";
			}
		}
		return n;
	}
	public String getEventnumber() {
		return eventnumber;
	}
	public void setEventnumber(String eventnumber) {
		if(eventnumber.length()==4 && eventnumber.charAt(0)>='A' && eventnumber.charAt(0)<='Z') {
			this.eventnumber = eventnumber;
		}
		else
		{
			this.eventnumber="A000";
		}
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
}

