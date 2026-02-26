package Cycles;

import java.util.*;

public class Task11 {
    private static int[] buildLps(String p) {
        int[] lps = new int[p.length()];
        int len = 0;
        int i = 1;
        while (i < p.length()) {
            if (p.charAt(i) == p.charAt(len)) {
                lps[i++] = ++len;
            } else if (len != 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }
        return lps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String pattern = sc.nextLine();

        if (pattern.isEmpty()) {
            System.out.println("0");
            return;
        }

        int[] lps = buildLps(pattern);
        int i = 0, j = 0;
        StringBuilder ans = new StringBuilder();

        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++; j++;
                if (j == pattern.length()) {
                    ans.append(i - j).append(' ');
                    j = lps[j - 1];
                }
            } else {
                if (j != 0) j = lps[j - 1];
                else i++;
            }
        }

        System.out.println(ans.toString().trim());
    }
}
