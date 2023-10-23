package effectivejava.item34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayrollDayTest {
	@Test
	void testPay() {
		assertEquals(1200, PayrollDay.valueOf("MONDAY").pay(60, 20));
		assertEquals(1800, PayrollDay.valueOf("SUNDAY").pay(60, 20));
	}
}
