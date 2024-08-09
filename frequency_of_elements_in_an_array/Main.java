package frequency_of_elements_in_an_array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = { 1, 2, 1, 3, 5, 6, 7, 3, 2, 1 };
        int n = a.length;

        // To keep track of elements already processed
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        visited[j] = true; // Mark as visited
                    }
                }
                System.out.println(a[i] + " appears " + count + " times");
            }
        }
    }
    /*
     * public static void main(String[] args) {
     * int[] a = { 1, 2, 1, 3, 5, 6, 7, 3, 2, 1 };
     * Arrays.sort(a);
     * System.out.println(Arrays.toString(a));
     * int n = a.length;
     * int count = 1;
     * for (int i = 1; i < n; i++) {
     * if (a[i] == a[i - 1]) {
     * count++;
     * } else {
     * System.out.println(a[i - 1] + " appears " + count + " times");
     * count = 1;
     * 
     * }
     * 
     * }
     * System.out.println(a[n - 1] + " appears " + count + " times");
     * 
     * }
     */

}
