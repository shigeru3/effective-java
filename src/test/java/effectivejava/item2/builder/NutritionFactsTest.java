package effectivejava.item2.builder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NutritionFactsTest {

	@Test
	void testBuilder() {
		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
				.calories(100).sodium(35).carbohydrate(27).build();
		assertEquals(240, cocaCola.getServingSize());
	}
}
