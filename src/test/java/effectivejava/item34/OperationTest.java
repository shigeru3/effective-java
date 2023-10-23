package effectivejava.item34;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {
	@Test
	void testCalculation() {
		assertEquals(
				Optional.of(3.0),
				Operation.fromString("+").map(o -> o.apply(1.0, 2.0))
		);
	}
}
