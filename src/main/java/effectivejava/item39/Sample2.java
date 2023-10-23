package effectivejava.item39;

class Sample2 {
	@ExceptionTest(ArithmeticException.class)
	static void m1() {
		int i = 0;
		i = i / i;
	}

	@ExceptionTest(ArithmeticException.class)
	static void m2() {
		int[] a = new int[0];
		int i = a[1];
	}

	@ExceptionTest(ArithmeticException.class)
	static void m3() {}
}
