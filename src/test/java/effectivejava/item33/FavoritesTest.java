package effectivejava.item33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FavoritesTest {
	@Test
	void testFavorites() {
		Favorites favorites = new Favorites();
		favorites.putFavorite(Integer.class, 3);
		favorites.putFavorite(String.class, "Ohyama");
		assertEquals(3, favorites.getFavorite(Integer.class));
		assertEquals("Ohyama", favorites.getFavorite(String.class));
	}
}
