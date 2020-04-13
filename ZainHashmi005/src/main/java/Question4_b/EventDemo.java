package Question4_b;

public class EventDemo {
	public static void main(String[] args) {
		Event obj1=new Event();
		Event obj2=new Event("M24", 60);
		KhizarEventwithMethod.price(obj1);
		KhizarEventwithMethod.price(obj2);
	}
}
