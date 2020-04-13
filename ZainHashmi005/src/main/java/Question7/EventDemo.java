package Question7;
public class EventDemo {

	public static void main(String[] args) {
		System.out.println("True Case:");
		Event obj1=new Event("A123",30);
		obj1.setPhoneNo("(920) 872-9182,");
		KhizarEventwithMethod.price(obj1);
		System.out.println();
		System.out.println("false Case:");
		Event obj2=new Event("b121",50);
		obj2.setPhoneNo("(920) 872-918223,");
		KhizarEventwithMethod.price(obj2);
	}
}
