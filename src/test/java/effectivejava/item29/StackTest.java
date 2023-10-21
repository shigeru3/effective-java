package effectivejava.item29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
	@Test
	void testStack() {
		Stack<String> stack = new Stack<>();
		stack.push("string0");
		assertFalse(stack.isEmpty());
		String element = stack.pop();
		assertTrue(stack.isEmpty());
		assertEquals("string0", element);
	}

}