package Pizza.Stores;

import Pizza.Pizza;
import Pizza.HCMPizza.HCMCheesePizza;
import Pizza.HCMPizza.HCMGreekPizza;
import Pizza.HCMPizza.HCMPepperoniPizza;
import Pizza.Store.Base.PizzaStore;

public class HCMPizzaStore extends PizzaStore{

	@Override
	protected Pizza CreatePizza(String type) {
		switch (type) {
		case "cheese": {
			return new  HCMCheesePizza();
		}
		case "greek": {
			return new HCMGreekPizza();
		}
		case "pepperoni": {
			return new HCMPepperoniPizza();
		}

		default:
			return null;
		}
	}

}
