package effectivejava.item9;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TopLineTest {
	@Test
	void testFirstLineOfFile() {
		assertThrows(IOException.class, () -> TopLine.firstLineOfFile("path"));
	}
}
