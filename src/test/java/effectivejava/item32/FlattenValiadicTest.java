package effectivejava.item32;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlattenValiadicTest {
	@Test
	void testFlatten() {
		List<Integer> l1 = List.of(1, 2, 3);
		List<Double> l2 = List.of(1.0, 2.0, 3.0);
		List<Number> flattened = FlattenValiadic.flatten(l1, l2);
		assertEquals(List.of(1, 2, 3, 1.0, 2.0, 3.0), flattened);
	}
}
