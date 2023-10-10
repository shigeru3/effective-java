package effectivejava.item25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CookingTest {
	@Test
	void testCooking() {
		assertEquals("pancake", Cooking.cook());
	}
}