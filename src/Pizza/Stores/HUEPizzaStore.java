package Pizza.Stores;

import Pizza.Pizza;
import Pizza.HUEPizza.HUECheesePizza;
import Pizza.HUEPizza.HUEGreekPizza;
import Pizza.HUEPizza.HUEPepperoniPizza;
import Pizza.Store.Base.PizzaStore;

public class HUEPizzaStore extends PizzaStore{

	@Override
	protected Pizza CreatePizza(String type) {
		switch (type) {
		case "cheese": {
			return new  HUECheesePizza();
		}
		case "greek": {
			return new HUEGreekPizza();
		}
		case "pepperoni": {
			return new HUEPepperoniPizza();
		}

		default:
			return null;
		}
	}

}
