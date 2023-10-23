package effectivejava.item34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {
	@Test
	void testWeight() {
		double earthWeight = 1.0;
		double mass = earthWeight / Planet.EARTH.surfaceGravity();
		assertEquals(0.37790669721114595, Planet.MERCURY.surfaceWeight(mass));
		assertEquals(2.5296794386298735, Planet.JUPITER.surfaceWeight(mass));
	}
}
