package effectivejava.item30;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UnionTest {
	@Test
	void testSet() {
		Set<String> s1 = Set.of("s1");
		Set<String> s2 = Set.of("s2");
		Set<String> unionedSet = Union.union(s1, s2);
		assertEquals(2, unionedSet.size());
	}
}
