package Minimum_scalar_product_of_two_vectors;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int a1[] = { 5, 4, 3, 2, 1 };
        int a2[] = { 1, 2, 3, 4, 5 };
        int n = a1.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a1[j] > a1[j + 1]) {
                    int temp = a1[j];
                    a1[j] = a1[j + 1];
                    a1[j + 1] = temp;

                }
            }

        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a2[j] < a2[j + 1]) {
                    int temp = a2[j];
                    a2[j] = a2[j + 1];
                    a2[j + 1] = temp;

                }
            }

        }
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        int printProduct = 0;
        for (int i = 0; i < n; i++) {
            printProduct += a1[i] * a2[i];

        }
        System.out.println(printProduct);

    }
}
