package leetcode;

public class PalindromeNumber {



    public boolean isPalindrome(int num) {


        // Check if the number is negative or modulo of 10. If either is true then the number is not a palindrome.
        if(num < 0 || num % 10 == 0 && num != 0) {
            return false;
        }

        
        int revNum = 0;
        while (num > revNum) {

            revNum = revNum * 10 + num % 10;
            num = num / 10;
        }

        return (num == revNum || num == revNum / 10);
    }


}
