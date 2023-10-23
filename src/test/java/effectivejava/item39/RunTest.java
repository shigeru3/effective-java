package effectivejava.item39;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class RunTest {
	public static void main(String[] args) throws Exception {
		int tests = 0;
		int passed = 0;
		Class<?> testClass = Class.forName("effectivejava.item39.Sample2");

		for (Method m : testClass.getDeclaredMethods()) {
			if (m.isAnnotationPresent(ExceptionTest.class)) {
				tests++;
				try {
					m.invoke(null);
					passed++;
				} catch (InvocationTargetException wrappedExc) {
					Throwable exc = wrappedExc.getCause();
					Class<? extends Throwable> excType = m.getAnnotation(ExceptionTest.class).value();
					if (excType.isInstance(exc)) {
						passed++;
					} else {
						System.out.printf("%s failed: %s%n", m, exc);
					}
				} catch (Exception exc) {
					System.out.printf("Invalid @Test: %s%n", m);
				}
			}
		}
		System.out.printf("Passed: %d, Failed %d%n", passed, tests - passed);
	}
}
