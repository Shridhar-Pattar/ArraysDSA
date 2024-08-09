package SmallestElment_in_an_array;

public class Main {
    public static void main(String[] args) {
        int[] a = { 456, 9, 12, 56, 23, 131, 324, 535 };
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }

        }
        System.out.println("The smallest elment in an array is " + min);
    }

}
