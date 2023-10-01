package effectivejava.item2.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {
	@Test
	void testNewYorkPizza() {
		NyPizza pizza = new NyPizza.Builder(NyPizza.Size.LARGE)
				.addTopping(Pizza.Topping.SAUSAGE)
				.addTopping(Pizza.Topping.ONION)
				.build();
		assertEquals(NyPizza.Size.LARGE, pizza.getSize());
	}

	@Test
	void testCalzone() {
		Calzone pizza = new Calzone.Builder()
				.addTopping(Pizza.Topping.PEPPER)
				.addTopping(Pizza.Topping.MUSHROOM)
				.build();
		assertFalse(pizza.getSauceInside());
	}

	@Test
	void testCalzoneSauceIn() {
		Calzone pizza = new Calzone.Builder()
				.sauceInside().build();
		assertTrue(pizza.getSauceInside());
	}
}
