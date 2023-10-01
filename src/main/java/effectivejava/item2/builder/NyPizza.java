package effectivejava.item2.builder;

import java.util.Objects;

class NyPizza extends Pizza {
	public enum Size { SMALL, MEDIUM, LARGE }
	private final Size size;

	public Size getSize() {
		return size;
	}

	public static class Builder extends Pizza.Builder<Builder> {
		private final Size size;

		public Builder(Size size) {
			this.size = Objects.requireNonNull(size);
		}

		@Override
		NyPizza build() {
			return new NyPizza(this);
		}

		@Override
		protected Builder self() {
			return this;
		}
	}
	NyPizza(Builder builder) {
		super(builder);
		size = builder.size;
	}
}
