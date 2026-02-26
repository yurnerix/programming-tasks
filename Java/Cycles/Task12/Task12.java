package Cycles;

import java.util.*;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        int target = 0;
        for (int j = 0; j < n; j++) target += a[0][j];

        // rows
        for (int i = 0; i < n; i++) {
            int s = 0;
            for (int j = 0; j < n; j++) s += a[i][j];
            if (s != target) { System.out.println("NO"); return; }
        }

        // cols
        for (int j = 0; j < n; j++) {
            int s = 0;
            for (int i = 0; i < n; i++) s += a[i][j];
            if (s != target) { System.out.println("NO"); return; }
        }

        // diagonals
        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++) {
            d1 += a[i][i];
            d2 += a[i][n - 1 - i];
        }
        if (d1 != target || d2 != target) { System.out.println("NO"); return; }

        System.out.println("YES");
    }
}
