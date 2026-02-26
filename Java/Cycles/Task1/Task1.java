package Cycles;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            if (sc.hasNextInt()) {
                sum += sc.nextInt();
            } else {
                String s = sc.next();
                if ("ENTER".equals(s)) break;
            }
        }
        System.out.println(sum);
    }
}
