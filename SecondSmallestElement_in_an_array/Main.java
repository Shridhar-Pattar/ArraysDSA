package SecondSmallestElement_in_an_array;

public class Main {

    public static int smallestElement(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {

        int[] a = { 1, 12, 45, 34, 67, 9, 55 };
        int min2 = Integer.MAX_VALUE;
        int S = smallestElement(a);
        System.out.println("The smallest element in an array is " + S);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != S && a[i] < min2) {
                min2 = a[i];

            }
        }
        System.out.println("The Second Smallest element in an array is " + min2);
    }
}
