package Question8;

public class Event {
	final static String array[]= {"wedding", "baptism", "birthday", "corporate","other"};
	int eventType;
	public void setEvetnType(int n)
	{
		if(n<=5) {
			eventType=n-1;
		}
		else
		{
			eventType=4;
		}
	}
	public String getEventType()
	{
		return array[eventType];
	}
}

