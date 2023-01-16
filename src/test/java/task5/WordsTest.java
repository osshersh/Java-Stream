package task5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {
   private final Words words = new Words();
   private final List<String> STRINGS = List.of("hello", "word", "HELLO", "word");

    @Test
    void shouldReturnUniqueLettersToUppercase() {
        String s = words.getUniqueLettersToUppercase(STRINGS).toString();
        assertEquals("[H, E, L, O, W, R, D]", s);

    }
}