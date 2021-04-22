public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        var y = x;
        var reverse = 0;

        while(x != 0) {
            reverse = reverse * 10;
            reverse = reverse + x%10;
            x = x/10;
        }

//        System.out.println(reverse);
//        System.out.println(y);
        return y == reverse;
    }
}
