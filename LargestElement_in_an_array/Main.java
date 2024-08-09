package LargestElement_in_an_array;

public class Main {
    public static void main(String[] args) {
        int[] a = { 1, 13, 45, 2, 9, 255, 34, 450, 120 };
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }

        System.out.println("the max value is " + max);

    }
}
