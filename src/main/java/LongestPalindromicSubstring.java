import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestPalindromicSubstring {
//    public String longestPalindrome(String s) {
//        var x = new ArrayList<Character>();
//
//        // Take the first letter in case there are no palindromes
//        var palindrome = s.substring(0, 1);
//
//        // if you can reverse string outright then you can return
//
////        var chars = s.split("");
//        var chars = Arrays.asList(s.split(""));
//
//        for (int i = 0; i <= s.length(); i++) {
//            var currentSubstring = s.substring(i);
//            System.out.println("Palindrome: " + palindrome);
//            System.out.println("Current Substring: " + currentSubstring);
//            // We know that once the substring we're working with
//            // is smaller or equal to the palindrome we've already found
//            // that there can't be a bigger palindrome
//            if (currentSubstring.length() <= palindrome.length()) {
//                System.out.println("Leaving loop");
//                i = s.length();
//                break;
//            }
//            for (int j = currentSubstring.length(); j >= 0; j--) {
//                var g = currentSubstring.substring(0, j);
//                System.out.println(g);
//                if (isPalindrome(g)) {
//                    if (g.length() > palindrome.length()) {
//                        palindrome = g;
//                        j = i;
//                    }
//                }
//            }
//            System.out.println("-----------------");
//        }
//        System.out.println(palindrome);
//        return palindrome;
//    }

    String palindrome;
    String originalString;

    public String longestPalindrome(String s) {

        originalString = s;

        // Check if the entire word itself is a palindrome
        if(isPalindrome(s)) {
            System.out.println("Word itself is a palindrome");
            return s;
        }
        // Take the first letter in case there are no palindromes
        palindrome = s.substring(0, 1);
        divideArray(s);
        return palindrome;
    }


    private String divideArray(String str) {
        System.out.println("Processing: " + str + " current palindrome is: " + palindrome);

        // If our current palindrome is greater than the string being processed
        // we don't need to continue on with this path
//        if(palindrome.length() >= str.length()) {
//            return ;
//        }
//        if(isPalindrome(str) && str.length() > palindrome.length()) {
//            System.out.println("Found a larger palindrome: " + str);
//            pal
//            return str;
//        } else {
            if (str.length() == palindrome.length()) {
                originalString = originalString.substring(1);
                return divideArray(originalString);
            }
            else {
                return divideArray(str.substring(0, str.length() - 1));
            }
////            var res = divideArray(str.substring(0, str.length() - 1));
//            if (str.length() >= palindrome.length()) {
//            } else {
//
//            }
//        }
    }

    private static boolean isPalindrome(String currentSubstring) {
        var x = new StringBuilder();
        x.append(currentSubstring);
        x.reverse();
        var z = new String(x);
        var isEqual = currentSubstring.equals(z);
        System.out.println(isEqual);
        return isEqual;
    }
}
