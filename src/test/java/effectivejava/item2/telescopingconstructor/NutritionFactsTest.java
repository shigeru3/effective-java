package effectivejava.item2.telescopingconstructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NutritionFactsTest {
	@Test
	void test() {
		NutritionFacts actual = new NutritionFacts(240, 8);
		assertEquals(240, actual.getServingSize());
	}

}