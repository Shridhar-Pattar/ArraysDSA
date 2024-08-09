package HalfAscending_HalfDescending;

import java.util.Arrays;

public class Main {

    public static void printorder(int a[], int n) {
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n / 2; j++) {
                if (a[j + 1] < a[j]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

            }
            for (int j = n / 2; j < n - 1; j++) {
                if (a[j + 1] > a[j]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] a = { 3, 2, 4, 1, 10, 30, 40, 20 };
        int n = a.length;
        printorder(a, n);
        // expected output [1,2,3,4,40,30,20,10]

    }

}
