package effectivejava.item31;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveTypeBoundTest {
	@Test
	void testMax() {
		Integer maxNumber = RecursiveTypeBound.max(List.of(1, 2));
		assertEquals(2, maxNumber);
	}

}