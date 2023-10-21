package effectivejava.item30;

import org.junit.jupiter.api.Test;

import java.util.function.UnaryOperator;

import static org.junit.jupiter.api.Assertions.*;

class GenericSingletonFactoryTest {
	@Test
	void testIdentityFunction() {
		UnaryOperator<String> identifier = GenericSingletonFactory.identityFunction();
		String s = "tigers";
		String t = identifier.apply(s);
		assertEquals(s, t);
	}
}
