package Question06;
public class EventDemo{
	public static void disp(Event art) {
    	System.out.println("Event number : "+Event.getName());
    	System.out.println("Total guests : "+art.getGuests());
    	System.out.println("Price per guest is $"+art.price_pg());
    	System.out.println("Total price is $"+art.getPricee());
    	}
	public static void main(String[] args){
		Event obj = new Event();
		Event obj1 = new Event();
		obj.setName();
		obj.setGuests();
		disp(obj);
		System.out.println("--- Default Values ---");
		disp(obj1);
	}
}