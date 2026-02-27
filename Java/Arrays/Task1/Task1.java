package Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] hourlyTemperatures = {3, 11, 7, 4, 15, 2};

        int max = Integer.MIN_VALUE;
        for (int t : hourlyTemperatures) {
            if (t > max) {
                max = t;
            }
        }

        System.out.println(max);
    }
}
