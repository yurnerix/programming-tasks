package Cycles;

import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println(0);
            return;
        }

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int x = p * p; x <= n; x += p) {
                    isPrime[x] = false;
                }
            }
        }

        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                cnt++;
                sb.append(i).append(' ');
            }
        }

        System.out.println(cnt);
        System.out.println(sb.toString().trim());
    }
}
