package effectivejava.item31;

import java.util.List;

class RecursiveTypeBound {
	public static <E extends Comparable<? super E>> E max(List<? extends E> list) {
		if (list.isEmpty()) {
			throw new IllegalArgumentException("list is empty.");
		}

		E result = null;
		for (E e: list) {
			if (result == null || e.compareTo(result) > 0) {
				result = e;
			}
		}
		return result;
	}
}
