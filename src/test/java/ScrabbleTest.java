import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ScrabbleTest {
    @Test
    public void calculateScore_returnsScoreForSingleLetter_1() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 1;
        assertEquals(expected, testScrabble.calculateScore("a"));
    }
    @Test
    public void calculateScore_returnsScoreForSingleLetter_2() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 2;
        assertEquals(expected, testScrabble.calculateScore("b"));
    }
    @Test
    public void calculateScore_returnsScoreForSingleLetter_c() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 3;
        assertEquals(expected, testScrabble.calculateScore("c"));
    }

}