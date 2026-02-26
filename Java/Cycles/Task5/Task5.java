package Cycles;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.nextLine();
            if ("enough".equals(s)) break;
            System.out.println(s);
        }
    }
}
