package effectivejava.item32;

import java.util.ArrayList;
import java.util.List;

class FlattenValiadic {
	@SafeVarargs
	static <E> List<E> flatten(List<? extends E>... args) {
		List<E> result = new ArrayList<>();
		for (List<? extends E> a: args) {
			result.addAll(a);
		}
		return result;
	}
}
