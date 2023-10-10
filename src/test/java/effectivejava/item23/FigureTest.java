package effectivejava.item23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FigureTest {
	@Test
	void testCircleArea() {
		Circle circle = new Circle(1);
		assertEquals(Math.PI, circle.area());
	}

	@Test
	void testRectangleArea() {
		Rectangle rectangle = new Rectangle(2, 4);
		assertEquals(8, rectangle.area());
	}

	@Test
	void testSquareArea() {
		Square square = new Square(5);
		assertEquals(25, square.area());
	}
}
