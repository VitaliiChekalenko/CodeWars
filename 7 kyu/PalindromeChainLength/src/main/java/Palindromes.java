//Number is a palindrome if it is equal to the number with digits in reversed order. For example, 5, 44, 171, 4884 are palindromes, and 43, 194, 4773 are not.
//
//Write a function which takes a positive integer and returns the number of special steps needed to obtain a palindrome. The special step is: "reverse the digits, and add to the original number". If the resulting number is not a palindrome, repeat the procedure with the sum until the resulting number is a palindrome.
//
//If the input number is already a palindrome, the number of steps is 0.
//
//All inputs are guaranteed to have a final palindrome which does not overflow long.
//
//Example
//For example, start with 87:
//
//  87 +   78 =  165     - step 1, not a palindrome
// 165 +  561 =  726     - step 2, not a palindrome
// 726 +  627 = 1353     - step 3, not a palindrome
//1353 + 3531 = 4884     - step 4, palindrome!
//4884 is a palindrome and we needed 4 steps to obtain it, so answer for 87 is 4.
//
//Additional info
//Some interesting information on the problem can be found in this Wikipedia article on Lychrel numbers.

//https://www.codewars.com/kata/525f039017c7cd0e1a000a26/train/java

public class Palindromes {
    public static int palindromeChainLength(long n) {

        for (int i = 0; i < n; i++) {
            if (n == Long.parseLong(new StringBuilder((n + "")).reverse().toString())) {
                return i;
            } else {
                n = n + Long.parseLong(new StringBuilder((n + "")).reverse().toString());
            }
        }
        return 0;
    }
}

//    public static int palin(long l){
//
//
//
//            count++;
//            palin(l+Integer.parseInt(new StringBuilder(l+"").reverse().toString()));
//            return count;
//        }

//        if(l)
//        String temp  = "";
//        long n = 0;
//        String[] arr = (l+"").split("");
//        for (int i = arr.length; i > 0 ; i--) {
//            temp= temp+ arr[i];
//        }
//        n = Integer.parseInt(temp);
//    }
//}
