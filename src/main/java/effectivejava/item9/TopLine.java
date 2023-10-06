package effectivejava.item9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TopLine {
	static String firstLineOfFile(String path) throws IOException {
		// try-with-resources
		// BufferedReader implements AutoClosable
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		}
	}
}
