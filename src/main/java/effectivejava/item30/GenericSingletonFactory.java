package effectivejava.item30;

import java.util.function.UnaryOperator;

class GenericSingletonFactory {
	private static final UnaryOperator<Object> IDENTITY_FN = (t) -> t;

	@SuppressWarnings("unchecked")
	public static <T> UnaryOperator<T> identityFunction() {
		return (UnaryOperator<T>) IDENTITY_FN;
	}
}
