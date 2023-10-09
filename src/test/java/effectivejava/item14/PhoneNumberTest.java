package effectivejava.item14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberTest {
	@Test
	void testComparePhoneNumber() {
		PhoneNumber phoneNumber1 = new PhoneNumber(60, 333, 1111);
		PhoneNumber phoneNumber2 = new PhoneNumber(60, 333, 1112);
		assertEquals(-1, phoneNumber1.compareTo(phoneNumber2));
		assertEquals(1, phoneNumber2.compareTo(phoneNumber1));
	}

}