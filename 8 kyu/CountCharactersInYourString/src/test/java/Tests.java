import com.chekalenkovitalii.Kata;
import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;

import java.util.Map;
import java.util.HashMap;

public class Tests {

    @Test
    @Order(1)
    public void testEmptyString() {
        Map<Character, Integer> d = new HashMap<>();
        assertEquals(d, Kata.count(""));
    }

    @Test
    @Order(2)
    public void testSingleCharacter() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 1);
        assertEquals(d, Kata.count("a"));
    }

    @Test
    @Order(3)
    public void testMultipleCharacters() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 3);
        d.put('b', 3);
        d.put('c', 1);
        assertEquals(d, Kata.count("aabbbac"));
    }

    @Test
   @Order(4)
    public void testAllCharactersUnique() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 1);
        d.put('b', 1);
        d.put('c', 1);
        assertEquals(d, Kata.count("abc"));
    }

    @Test
    @Order(5)
    public void testAllCharactersSame() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 5);
        assertEquals(d, Kata.count("aaaaa"));
    }

    @Test
    @Order(6)
    public void testDifferentCharacters() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 2);
        expected.put('b', 2);
        Map<Character, Integer> actual = Kata.count("aabb");
        assertEquals(expected, actual);
    }

}
