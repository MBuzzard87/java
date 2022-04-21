import leetcode.PalindromeNumber;
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeNumberTest {

    PalindromeNumber pn = new PalindromeNumber();

    @Test
    public void isPalindrome1() {
        int num = 1221;
        boolean actual = pn.isPalindrome(num);
        assertTrue(actual);
    }

    @Test
    public void isPalindrome2() {
        int num = 321;
        boolean actual = pn.isPalindrome(num);
        assertFalse(actual);
    }

    @Test
    public void isPalindrome3() {
        int num = 123454321;
        boolean actual = pn.isPalindrome(num);

        assertTrue(actual);
    }

    @Test
    public void isPalindrome4() {
        int num = -1;
        boolean actual = pn.isPalindrome(num);

        assertFalse(actual);
    }

    @Test
    public void isPalindrome5() {
        int num = 1223;
        boolean actual = pn.isPalindrome(num);
        assertFalse(actual);
    }
}