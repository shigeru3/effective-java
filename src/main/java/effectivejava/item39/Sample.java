package effectivejava.item39;

class Sample {
	@Test
	static void m1() {}
	static void m2() {}
	@Test
	static void m3() {
		throw new RuntimeException("Boom");
	}
	static void m4() {}
	@Test
	void m5() {}
	static void m6() {}
	@Test
	static void m7() {
		throw new RuntimeException("Crash");
	}
	static void m8() {}
}
