package effectivejava.item2.javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NutritionFactsTest {

	@Test
	void test() {
		NutritionFacts actual = new NutritionFacts();
		actual.setServingSize(240);
		actual.setServings(8);
		actual.setCalories(100);
		actual.setSodium(35);
		actual.setCarbohydrate(27);
		assertEquals(240, actual.getServingSize());
	}
}