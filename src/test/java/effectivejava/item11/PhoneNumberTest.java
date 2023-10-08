package effectivejava.item11;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberTest {
	@Test
	void testHashMap() {
		Map<PhoneNumber, String> hm = new HashMap<>();
		hm.put(new PhoneNumber(60, 333, 1212), "tigers");
		assertTrue(hm.containsKey(new PhoneNumber(60, 333, 1212)));
	}

}