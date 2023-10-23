package effectivejava.item34;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

enum Operation {
	PLUS("+") {
		public double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS("-") {
		public double apply(double x, double y) {
			return x - y;
		}
	},
	TIMES("*") {
		public double apply(double x, double y) {
			return x * y;
		}
	},
	DIVIDE("/") {
		@Override
		public double apply(double x, double y) {
			return x / y;
		}
	};

	private final String symbol;

	Operation(String symbol) {
		this.symbol = symbol;
	}

	public abstract double apply(double x, double y);

	@Override
	public String toString() {
		return this.symbol;
	}

	private static final Map<String, Operation> stringToEnum = Stream.of(values())
			.collect(toMap(Object::toString, e -> e));

	public static Optional<Operation> fromString(String symbol) {
		return Optional.ofNullable(stringToEnum.get(symbol));
	}
}
