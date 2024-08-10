package Sort_the_ArrayElements_By_Frequency;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] a = { 10, 20, 10, 10, 20, 30, 30, 30, 30, 0 };
        int n = a.length;

        // Step 1: Sort the array
        Arrays.sort(a);

        // Step 2: Create a 2D array 'arr' to store unique elements and their
        // frequencies
        int[][] arr = new int[n][2];
        int count = 1;
        int index = 0;

        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1]) {
                count++;
            } else {
                arr[index][0] = a[i - 1];
                arr[index][1] = count;
                count = 1;
                index++;
            }
        }
        // Add the last element
        arr[index][0] = a[n - 1];
        arr[index][1] = count;
        index++;

        // Step 3: Sort the 'arr' array based on frequency in descending order
        for (int i = 0; i < index - 1; i++) {
            for (int j = i + 1; j < index; j++) {
                if (arr[i][1] < arr[j][1]) {
                    int temp1 = arr[i][0];
                    int temp2 = arr[i][1];
                    arr[i][0] = arr[j][0];
                    arr[i][1] = arr[j][1];
                    arr[j][0] = temp1;
                    arr[j][1] = temp2;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));

        // Step 4: Print the elements based on their frequency
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < arr[i][1]; j++) {
                System.out.print(arr[i][0] + " ");
            }
        }
    }
}
