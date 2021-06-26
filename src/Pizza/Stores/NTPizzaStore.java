package Pizza.Stores;

import Pizza.Pizza;
import Pizza.NTPizza.NTCheesePizza;
import Pizza.NTPizza.NTGreekPizza;
import Pizza.NTPizza.NTPepperoniPizza;
import Pizza.Store.Base.PizzaStore;

public class NTPizzaStore extends PizzaStore {

	@Override
	protected Pizza CreatePizza(String type) {
		switch (type) {
		case "cheese": {
			return new  NTCheesePizza();
		}
		case "greek": {
			return new NTGreekPizza();
		}
		case "pepperoni": {
			return new NTPepperoniPizza();
		}

		default:
			return null;
		}
	}

}
