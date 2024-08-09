package Reverse_an_array;

import java.util.Arrays;

public class Main {
    public static void swap(int a[], int left, int right) {
        int temp = 0;
        temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            swap(a, left, right);
            left++;
            right--;
        }
        System.out.println(Arrays.toString(a));
        // outputs [6,5,4,3,2,1]
    }
}
