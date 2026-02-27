package Arrays;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] marks = {7, 10, 4, 8, 6, 9, 5};

        Arrays.sort(marks);

        double median;
        int n = marks.length;
        if (n % 2 == 1) {
            median = marks[n / 2];
        } else {
            median = (marks[n / 2 - 1] + marks[n / 2]) / 2.0;
        }

        System.out.println(median);
    }
}
