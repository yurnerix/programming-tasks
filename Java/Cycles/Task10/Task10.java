package Cycles;

import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long sum = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int even = 0, odd = 0;

        while (true) {
            String s = sc.nextLine().trim();
            if (s.equalsIgnoreCase("stop")) break;

            int x = Integer.parseInt(s);
            count++;
            sum += x;
            if (x < min) min = x;
            if (x > max) max = x;
            if (x % 2 == 0) even++; else odd++;
        }

        double avg = (count == 0) ? 0.0 : (sum * 1.0 / count);

        System.out.println("count=" + count);
        System.out.println("sum=" + sum);
        System.out.println("avg=" + avg);
        System.out.println("min=" + (count == 0 ? "N/A" : min));
        System.out.println("max=" + (count == 0 ? "N/A" : max));
        System.out.println("even=" + even);
        System.out.println("odd=" + odd);
    }
}
