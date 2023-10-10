package effectivejava.item25;

class Cooking {
	public static String cook() {
		return Utensil.NAME + Dessert.NAME;
	}

	private static class Utensil {
		static final String NAME = "pan";
	}

	private static class Dessert {
		static final String NAME = "cake";
	}
}
