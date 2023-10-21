package effectivejava.item30;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveTypeBoundTest {
	@Test
	void testRecursiveTypeBound() {
		List<Integer> championYears = List.of(1985, 2003, 2005, 2023);
		Integer recentYear = RecursiveTypeBound.max(championYears);
		assertEquals(2023, recentYear);
	}
}
