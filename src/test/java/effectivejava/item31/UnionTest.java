package effectivejava.item31;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UnionTest {
	@Test
	void testUnion() {
		Set<Integer> integerSet = Set.of(1, 2, 3);
		Set<Double> doubleSet = Set.of(1.0, 2.0, 3.0);
		Set<Number> numberSet = Union.union(integerSet, doubleSet);
		assertEquals(Set.of(1, 2, 3, 1.0, 2.0, 3.0), numberSet);
	}

}