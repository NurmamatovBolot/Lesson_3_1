import java.util.Arrays;

public class Main {

    public static double d;

    public static void main(String[] args) {
        double [] numbers = {10.0, -2.5, -5.7, 3.1, 4.5, 4.3, -0.6, 4.7, 6.7, -3.5, 1.6, 2.4, 4.5, 2.4, 5.6};
        for (double mean : numbers) {
            d = (numbers[3] + numbers[4] + numbers[5] + numbers[7] + numbers[8] + numbers[10] + numbers[11] + numbers[12] + numbers[13] + numbers[14]) / 10;
            mean = d;
            d = mean;
        }
        System.out.println(d);

        sort();
    }

    public static void sort() {
        int [] numbers = {6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            int min = i;
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] < numbers[min]) {
                    min = j;
                }
                swap(numbers, i, min);
                System.out.println(Arrays.toString(numbers));
            }
        }
    }

    public static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}