package frequency_of_elements_in_an_array;

public class Main {
    public static void main(String[] args) {
        int[] a = { 1, 2, 1, 3, 5, 6, 7, 3, 2, 1 };
        int n = a.length;

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count = count + 1;
                }

            }
            System.out.println(a[i] + "the frequency is " + count);

        }

    }
}
