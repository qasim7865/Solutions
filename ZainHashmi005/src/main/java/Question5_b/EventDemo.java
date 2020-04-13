package Question5_b;

public class EventDemo {
	public static void main(String[] args) {
		Event obj1=new Event("ABC20", 60);
		Event obj2=new Event("ABC21", 40);
		Event obj3=new Event();
		KhizarEventwithMethod.price(obj1);
		KhizarEventwithMethod.price(obj2);
		KhizarEventwithMethod.price(obj3);
	}
}
