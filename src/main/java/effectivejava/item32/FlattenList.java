package effectivejava.item32;

import java.util.ArrayList;
import java.util.List;

class FlattenList {
	static <E> List<E> flatten(List<List<? extends E>> lists) {
		List<E> result = new ArrayList<>();
		for (List<? extends E> list: lists) {
			result.addAll(list);
		}
		return result;
	}
}
