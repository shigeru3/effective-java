package effectivejava.item30;

import java.util.Collection;
import java.util.Objects;

class RecursiveTypeBound {
	public static <E extends Comparable<E>> E max(Collection<E> c) {
		if (c.isEmpty()) {
			throw new IllegalArgumentException("Empty collection");
		}

		E result = null;
		for (E e: c) {
			if (result == null || e.compareTo(result) > 0) {
				result = Objects.requireNonNull(e);
			}
		}
		return result;
	}
}
