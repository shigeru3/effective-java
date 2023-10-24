package effectivejava.item42;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {
	@Test
	void operation() {
		double i = Operation.PLUS.apply(1.0, 2.0);
		assertEquals(3.0, i);
	}
}
