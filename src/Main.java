import java.util.Arrays;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class Main {
    public static void main(String[] args) {
        double [] numbers = {10.0, -2.5, -5.7, 3.1, 4.5, 4.3, -0.6, 4.7, 6.7, -3.5, 1.6, 2.4, 4.5, 2.4, 5.6};
        for (double mean : numbers) {
            double d = (numbers[3] + numbers[4] + numbers[5]) / 3;
            mean = d;
            System.out.println(mean);
            break;
        }

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