package NO_of_DistinctElements;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = { 2, 3, 4, 4, 5, 2, 3, 9, 7, 10 };

        if (a.length == 0) {
            System.out.println(0); // No elements, so distinct count is 0
            return;
        }

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int n = a.length;
        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                count++;
            }

        }
        System.out.println(count);

    }
}
