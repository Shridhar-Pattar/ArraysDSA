package LongestPalindrome_in_an_Array;

import java.util.Arrays;

public class Main {

    public static boolean isPalindrome(int n) {
        int m = n;
        int rev = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;

        }
        return rev == m;

    }

    public static void main(String[] args) {
        int a[] = { 121, 1331, 4444, 12321, 9009, 12345 };
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int L = a.length;
        int Longestpalindrome = -1;
        for (int i = 0; i < L; i++) {
            if (isPalindrome(a[i])) {
                if (a[i] > Longestpalindrome) {
                    Longestpalindrome = a[i];
                }

            }

        }
        if (Longestpalindrome != -1) {
            System.out.println("The Longest Palindrome in the array is " + Longestpalindrome);
        } else {
            System.out.println("None found");
        }

    }

}
