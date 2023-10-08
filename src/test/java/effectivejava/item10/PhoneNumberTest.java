package effectivejava.item10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneNumberTest {
	@Test
	void testEquals() {
		PhoneNumber pn1 = new PhoneNumber(60, 333, 1212);
		PhoneNumber pn2 = new PhoneNumber(60, 333, 1212);
		assertTrue(pn1.equals(pn2));
	}
}
