package Arrays;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 2};
        int[] b = {2, 3, 2, 1};

        int[] copyA = Arrays.copyOf(a, a.length);
        int[] copyB = Arrays.copyOf(b, b.length);

        Arrays.sort(copyA);
        Arrays.sort(copyB);

        boolean same = Arrays.equals(copyA, copyB);

        System.out.println(same);
    }
}
