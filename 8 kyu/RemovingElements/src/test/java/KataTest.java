import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.example.Kata;
import org.junit.jupiter.api.Test;

// TODO: Replace examples and use TDD by writing your own tests

class KataTest {
	@Test
	void basicTest() {
		assertArrayEquals(new Object[] { "Hello", "Hello Again" }, Kata.removeEveryOther(new Object[] { "Hello", "Goodbye", "Hello Again" }));
		assertArrayEquals(new Object[] { new Object[] { 1, 2 } },Kata.removeEveryOther(new Object[] { new Object[] { 1, 2 } }));
		assertArrayEquals(new Object[] { 1, 3, 5, 7, 9 },Kata.removeEveryOther(new Object[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
		assertArrayEquals(new Object[] { "Goodbye" }, Kata.removeEveryOther(new Object[] { "Goodbye" }));
		assertArrayEquals(new Object[] {}, Kata.removeEveryOther(new Object[] {}));
	}
}
