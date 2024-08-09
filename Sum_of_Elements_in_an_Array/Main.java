package Sum_of_Elements_in_an_Array;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}
