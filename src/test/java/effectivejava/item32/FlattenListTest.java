package effectivejava.item32;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlattenListTest {
	@Test
	void testFlatten() {
		List<Integer> l1 = List.of(1);
		List<Double> l2 = List.of(1.0);
		List<Number> l3 = FlattenList.flatten(List.of(l1, l2));
		assertEquals(List.of(1, 1.0), l3);
	}
}