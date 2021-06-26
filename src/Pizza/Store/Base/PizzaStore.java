package Pizza.Store.Base;

import Pizza.Pizza;

public abstract class PizzaStore {
	public void orderPizza(String type) {
//		Pizza pizza = new Pizza(); 
//		vì pizza bây giờ là 1 abstracts class nên ko thể gọi trực tiếp Pizza được

		Pizza pizza;

//		switch (type) {
//			case "cheese": {
//				pizza = new CheesePizza();
//				break;
//			}
//			case "greek": {
//				pizza = new GreekPizza();
//				break;
//			}
//			case "pepperoni": {
//				pizza = new PepperoniPizza();
//				break;
//			}
//			
//		default:
//			System.out.println("We do not have " + type + " pizza!");
//			return;
//		}
		
		pizza = CreatePizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.Cut();
		pizza.Box();
	};
	
	protected abstract Pizza CreatePizza(String type);
}
