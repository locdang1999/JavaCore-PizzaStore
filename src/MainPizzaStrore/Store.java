package MainPizzaStrore;

import Pizza.Store.Base.PizzaStore;
import Pizza.Stores.HCMPizzaStore;
import Pizza.Stores.HUEPizzaStore;
import Pizza.Stores.NTPizzaStore;

public class Store {
	public static void main(String[] args) {
		//base 1
//		Pizza pizza = new Pizza("Pizza 1", "Thin dough", "Chill sauce", new ArrayList<String>(Arrays.asList("Black Olives")));
//		pizza.prepare();
//		pizza.bake();
//		pizza.Cut();
//		pizza.Box();
		//nâng cấp 2
//		PizzaStore pizzaStore = new PizzaStore();
//		pizzaStore.orderPizza("cheese");
		//nâng cấp 3 SOLID
		PizzaStore hue = new HUEPizzaStore();
		hue.orderPizza("cheese");
		PizzaStore hcm = new HCMPizzaStore();
		hcm.orderPizza("cheese");
		PizzaStore nt = new NTPizzaStore();
		nt.orderPizza("cheese");
	}
}
