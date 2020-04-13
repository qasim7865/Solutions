package Question02;
public class qwe {
	public int price;
	public int num;
	public qwe(int num){
		this.num = num;
		price = num * 35;
	}
	public String toString() {
		return String.format("The number of guests is %d\nPrice per guest is $35\nTotal Price is %d",num,price);}}