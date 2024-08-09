package Bubble_Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a[] = { 6, 5, 23, 78, 33, 1, 230, 50, 7 };
        int n = a.length;
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(a));

    }
}
