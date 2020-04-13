package Question8;
public class EventDemo {

	public static void main(String[] args) {
		Event obj[]=new Event[3];
		for(int i=0;i<3;i++)
		{
			obj[i]=new Event();
		}
		obj[0].setEvetnType(3);
		System.out.println(obj[0].getEventType());
		obj[1].setEvetnType(1);
		System.out.println(obj[1].getEventType());
		obj[2].setEvetnType(8);
		System.out.println(obj[2].getEventType());
	}
}
