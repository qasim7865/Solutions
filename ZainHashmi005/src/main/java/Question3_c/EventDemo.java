package Question3_c;

public class EventDemo {
	public static void main(String[] args) {
		Event obj=new Event();
		obj.setEventnumber(KhizarEventwithMethod.getEventnumber());
		obj.setGuest(KhizarEventwithMethod.guest());
		KhizarEventwithMethod.moto();
		KhizarEventwithMethod.price(obj);
	}
}
