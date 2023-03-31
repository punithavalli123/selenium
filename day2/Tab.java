package week2.day2;

public class Tab {
	public int tabPrice(int tabPrice) {
		return tabPrice;
	}
public String tabBrand(String tabBrand) {
	return tabBrand;
	
}
public static void main(String []args) {
	Tab tab= new Tab();
	String brand =tab.tabBrand("Apple");
	int price =tab.tabPrice(100000);
	System.out.println("Tab price is" +price);
	System.out.println("Tab brand is " +brand);
}
}
