package Pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	/** Có 2 cách thực hiện Encapsulation(Tính đóng gói) cho class kế thừa
	 * + 1 là dùng Access modefier: private chỉ dùng được khi khai báo class con là nested(khai báo bên trong class cha)
	 * + 2 là dùng Access modefier: protected dùng được ra bên ngoài
	 * 
	 * */
	protected String name;
	protected String dough;
	protected String sauce;
	protected List<String> toppings = new ArrayList<String>();
	
	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pizza(String name, String dough, String sauce, List<String> toppings) {
		super();
		this.name = name;
		this.dough = dough;
		this.sauce = sauce;
		this.toppings = toppings;
	}

	public void prepare() {
		System.out.println("Preparing: " + name);
		System.out.println("Tossing dough...:" + dough);
		System.out.println("Adding sauce...:" + sauce);
		System.out.println("Adding toppings:");
		if(toppings != null) {
			toppings.forEach((topping)->{
				System.out.println("\t" +  topping);
			});
		}
	}
	
	public void bake() {
		System.out.println("Baking: " + name + " in 30 mins");
	}
	
	public void Cut() {
		System.out.println("Cutting: " + name);
	}
	
	public void Box() {
		System.out.println("Boxing: " + name);
	}
	
}
