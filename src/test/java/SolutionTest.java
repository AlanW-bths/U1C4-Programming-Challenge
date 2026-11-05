
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Visible tests for the U1C4 Programming Challenge.
// Grading runs these tests plus additional hidden tests, so passing every
// test here does not guarantee a full score. Editing this file has no effect
// on your grade.
public class SolutionTest {

    // endsLy

    @Test
    public void testEndsLyOddly() {
        Solution sol = new Solution();
        assertTrue(sol.endsLy("oddly"));
    }

    @Test
    public void testEndsLySingleY() {
        Solution sol = new Solution();
        assertFalse(sol.endsLy("y"));
    }

    @Test
    public void testEndsLyOddy() {
        Solution sol = new Solution();
        assertFalse(sol.endsLy("oddy"));
    }

    // conCat

    @Test
    public void testConCatDoubleChar() {
        Solution sol = new Solution();
        assertEquals("abcat", sol.conCat("abc", "cat"));
    }

    @Test
    public void testConCatNoDouble() {
        Solution sol = new Solution();
        assertEquals("dogcat", sol.conCat("dog", "cat"));
    }

    @Test
    public void testConCatSecondEmpty() {
        Solution sol = new Solution();
        assertEquals("abc", sol.conCat("abc", ""));
    }

    // withoutX

    @Test
    public void testWithoutXBothEnds() {
        Solution sol = new Solution();
        assertEquals("Hi", sol.withoutX("xHix"));
    }

    @Test
    public void testWithoutXFront() {
        Solution sol = new Solution();
        assertEquals("Hi", sol.withoutX("xHi"));
    }

    @Test
    public void testWithoutXMiddleKept() {
        Solution sol = new Solution();
        assertEquals("Hxi", sol.withoutX("Hxix"));
    }

    // fizzString

    @Test
    public void testFizzStringFizz() {
        Solution sol = new Solution();
        assertEquals("Fizz", sol.fizzString("fig"));
    }

    @Test
    public void testFizzStringBuzz() {
        Solution sol = new Solution();
        assertEquals("Buzz", sol.fizzString("dib"));
    }

    @Test
    public void testFizzStringFizzBuzz() {
        Solution sol = new Solution();
        assertEquals("FizzBuzz", sol.fizzString("fib"));
    }

    // fizzString2

    @Test
    public void testFizzString2One() {
        Solution sol = new Solution();
        assertEquals("1!", sol.fizzString2(1));
    }

    @Test
    public void testFizzString2Two() {
        Solution sol = new Solution();
        assertEquals("2!", sol.fizzString2(2));
    }

    @Test
    public void testFizzString2Three() {
        Solution sol = new Solution();
        assertEquals("Fizz!", sol.fizzString2(3));
    }
}
